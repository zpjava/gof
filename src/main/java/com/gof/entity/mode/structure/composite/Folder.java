package com.gof.entity.mode.structure.composite;

import java.util.ArrayList;

public class Folder implements Node {

	 private String folderName;  
	    private ArrayList<Node> nodeList =new ArrayList<Node>(); //用于存储文件夹下的文件夹或文件的信息 
	 
	    public Folder(String folderName){  
	        this.folderName = folderName;  
	    }  
	 
	    public void add(Node node){ //增加文件或文件夹  
	        nodeList.add(node);  
	    }  
	    
	    @Override
	    public void copy(){  //文件夹复制操作实现递归  
	        System.out.println("复制文件夹：" + folderName);  
	        for (int j = 0; j < nodeList.size(); j++) {
	        	Node node = (Node)nodeList.get(j);  
	        	node.copy();  
	        }  
	    }  

}
