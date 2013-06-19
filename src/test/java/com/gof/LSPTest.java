package com.gof;

import org.junit.Test;

import com.gof.entity.principle.lsp.B;

public class LSPTest {
	/**
	 * 里氏替换
	 */
	@Test
	public void testLSP() {
//		A a=new A();
//		System.out.println("100-50="+a.func1(100, 50));
//		System.out.println("100-80="+a.func1(100, 80));
		
		B b=new B();
		System.out.println("100-50="+b.func1(100, 50));
		System.out.println("100-80="+b.func1(100, 80));
		System.out.println("100+20+100="+b.func2(100, 20));

	}
}
