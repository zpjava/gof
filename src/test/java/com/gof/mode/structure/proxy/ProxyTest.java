package com.gof.mode.structure.proxy;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.gof.entity.mode.structure.proxy.ProxySubject;
import com.gof.entity.mode.structure.proxy.Subject;

public class ProxyTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		 Subject sub = new  ProxySubject(); 
		 sub.request(); 
	}

}
