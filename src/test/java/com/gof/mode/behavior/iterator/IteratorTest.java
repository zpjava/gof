package com.gof.mode.behavior.iterator;

import org.junit.Test;

import com.gof.entity.mode.behavior.iterator.Aggregate;
import com.gof.entity.mode.behavior.iterator.ConcreteAggregate;
import com.gof.entity.mode.behavior.iterator.Iterator;

public class IteratorTest {

	@Test
	public void test() {
		Aggregate ag = new ConcreteAggregate();
		ag.add("小明");
		ag.add("小红");
		ag.add("小刚");
		Iterator it = ag.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}

}
