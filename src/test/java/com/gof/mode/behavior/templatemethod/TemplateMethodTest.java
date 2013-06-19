package com.gof.mode.behavior.templatemethod;

import org.junit.Test;

import com.gof.entity.mode.behavior.templatemethod.AbstractSort;
import com.gof.entity.mode.behavior.templatemethod.ConcreteSort;


public class TemplateMethodTest {
	public static int[] a={10,32,1};
	@Test
	public void test() {
		AbstractSort s=new ConcreteSort();
		s.showSortResule(a);
	}

}
