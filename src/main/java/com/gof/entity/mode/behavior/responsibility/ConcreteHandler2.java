package com.gof.entity.mode.behavior.responsibility;

public class ConcreteHandler2 extends Handler {

	@Override
	protected Level getHandlerLevel() {
		return new Level(3);
	}

	@Override
	public Response response(Request request) {
		System.out.println("-----请求由处理器2进行处理-----");
		return null;
	}
}
