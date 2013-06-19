package com.gof;

import org.junit.Test;

import com.gof.entity.principle.dip.Book;
import com.gof.entity.principle.dip.Mother;
import com.gof.entity.principle.dip.Newspaper;

public class DIPTest {
	/**
	 * 依赖倒置
	 */
	@Test
	public void testDIP() {
		Mother mother=new Mother();
		mother.narrate(new Book());
		mother.narrate(new Newspaper());
		System.out.println("测试依赖倒置！");
	}

}
