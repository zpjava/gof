package com.gof.entity.mode.structure.composite;

public class File implements Node {

	private String fileName;

	public File(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void copy() {
		System.out.println("复制文件：" + fileName);
	}
}
