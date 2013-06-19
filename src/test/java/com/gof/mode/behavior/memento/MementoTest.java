package com.gof.mode.behavior.memento;

import org.junit.Test;

import com.gof.entity.mode.behavior.memento.Caretaker;
import com.gof.entity.mode.behavior.memento.Originator;

public class MementoTest {

	@Test
	public void test() {
		Originator originator = new Originator();
		originator.setState("状态1");
		System.out.println("初始状态:" + originator.getState());
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		originator.setState("状态2");
		System.out.println("改变后状态:" + originator.getState());
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("恢复后状态:" + originator.getState());
	}

}
