package com.gof;

import org.junit.Test;

import com.gof.entity.principle.isp.A1;
import com.gof.entity.principle.isp.B1;
import com.gof.entity.principle.isp.C1;
import com.gof.entity.principle.isp.D1;

public class ISPTest {
	/**
	 * 接口隔离
	 */
	@Test
	public void test() {
//		A a=new A();
//		a.depend1(new B());
//		a.depend2(new B());
//		a.depend3(new B());
//		
//		C c=new C();
//		c.depend1(new D());
//		c.depend2(new D());
//		c.depend3(new D());
		
		A1 a=new A1();
		a.depend1(new B1());
		a.depend2(new B1());
		a.depend3(new B1());
		
		C1 c=new C1();
		c.depend1(new D1());
		c.depend2(new D1());
		c.depend3(new D1());
	}

}
