package com.gof.entity.mode.structure.proxy;

public class ProxySubject extends Subject {
	private RealSubject realSubject; // 以真实角色作为代理角色的属性

	public ProxySubject() {
	}

	public void request() { // 该方法封装了真实对象的request方法
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request(); // 此处执行真实对象的request方法
	}

}
