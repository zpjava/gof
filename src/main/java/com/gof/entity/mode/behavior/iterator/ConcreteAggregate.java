package com.gof.entity.mode.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
	private List<Object> list = new ArrayList<Object>();

	public void add(Object obj) {
		list.add(obj);
	}

	public Iterator iterator() {
		return new ConcreteIterator<Object>(list);
	}

	public void remove(Object obj) {
		list.remove(obj);
	}
}
