package com.gof.entity.mode.behavior.mediator;

public class ColleagueA extends AbstractColleague{

	@Override
	public void setNumber(int number, AbstractMediator am) {  
        this.number = number;  
        am.BaffectA();  
    }  

}
