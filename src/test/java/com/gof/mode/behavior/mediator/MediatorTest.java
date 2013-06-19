package com.gof.mode.behavior.mediator;

import org.junit.Test;

import com.gof.entity.mode.behavior.mediator.AbstractColleague;
import com.gof.entity.mode.behavior.mediator.AbstractMediator;
import com.gof.entity.mode.behavior.mediator.ColleagueA;
import com.gof.entity.mode.behavior.mediator.ColleagueB;
import com.gof.entity.mode.behavior.mediator.Mediator;

public class MediatorTest {

	@Test
	public void test() {
		AbstractColleague collA = new ColleagueA();  
        AbstractColleague collB = new ColleagueB();  
          
        AbstractMediator am = new Mediator(collA, collB);  
          
        System.out.println("==========通过设置A影响B==========");  
        collA.setNumber(1000, am);  
        System.out.println("collA的number值为："+collA.getNumber());  
        System.out.println("collB的number值为A的10倍："+collB.getNumber());  
  
        System.out.println("==========通过设置B影响A==========");  
        collB.setNumber(1000, am);  
        System.out.println("collB的number值为："+collB.getNumber());  
        System.out.println("collA的number值为B的0.1倍："+collA.getNumber());  
	}

}
