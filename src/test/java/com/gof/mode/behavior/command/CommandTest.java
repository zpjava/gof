package com.gof.mode.behavior.command;

import org.junit.Test;

import com.gof.entity.mode.behavior.command.Command;
import com.gof.entity.mode.behavior.command.ConcreteCommand;
import com.gof.entity.mode.behavior.command.Invoker;
import com.gof.entity.mode.behavior.command.Receiver;

public class CommandTest {

	@Test
	public void test() {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		// 客户端直接执行具体命令方式（此方式与类图相符）
		command.execute();

		// 客户端通过调用者来执行命令
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.action();
	}

}
