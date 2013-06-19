package com.gof.mode.structure.decorator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.gof.entity.mode.structure.decorator.Bird;
import com.gof.entity.mode.structure.decorator.Fish;
import com.gof.entity.mode.structure.decorator.Monkey;
import com.gof.entity.mode.structure.decorator.TheGreatestSage;

public class DecoratorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		TheGreatestSage sage = new Monkey();
		// 第一种写法
		TheGreatestSage bird = new Bird(sage);
		TheGreatestSage fish = new Fish(bird);
		// 第二种写法
		// TheGreatestSage fish = new Fish(new Bird(sage));
		fish.move();
	}

}
