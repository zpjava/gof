package com.gof.entity.mode.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator<T> implements Iterator {
	private List<T> list = new ArrayList<T>();  
    private int cursor =0;  
    public ConcreteIterator(List<T> list){  
        this.list = list;  
    }  
    public boolean hasNext() {  
        if(cursor==list.size()){  
            return false;  
        }  
        return true;  
    }  
    public Object next() {  
        Object obj = null;  
        if(this.hasNext()){  
            obj = this.list.get(cursor++);  
        }  
        return obj;  
    }  
}
