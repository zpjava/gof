package com.gof.mode.creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gof.entity.mode.creational.singleton.Singleton;

public class SingletonTest {

	@Test
	public void test() {
		assertEquals(Singleton.getInstance(), Singleton.getInstance());
	}

}
