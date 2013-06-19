package com.gof;

import org.junit.Test;

import com.gof.entity.principle.srp.Animal;

public class SRPTest {
	/**
	 * 单一职责
	 */
	@Test
	public void testSRP() {
//		Terrestrial terrestrial=new Terrestrial();
//		terrestrial.breathe("马");
//		terrestrial.breathe("龙");
//		terrestrial.breathe("羊");
//		
//		Aquatic aquatic=new Aquatic();
//		aquatic.breathe("鲨鱼");
		
		Animal animal=new Animal();
		animal.breathe("马");
		animal.breathe("龙");
		animal.breathe("羊");
		animal.breathe1("鲨鱼");
	}

}
