package com.gof.entity.mode.behavior.iterator;

public interface Aggregate {
	public void add(Object obj);  
    public void remove(Object obj);  
    public Iterator iterator();  
}
