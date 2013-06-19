package com.gof.entity.principle.dip;

/**
 * 
 * 这样修改后，无论以后怎样扩展Client类，都不需要再修改Mother类了。这只是一个简单的例子，实际情况中，
 * 代表高层模块的Mother类将负责完成主要的业务逻辑，
 * 一旦需要对它进行修改，引入错误的风险极大。
 * 所以遵循依赖倒置原则可以降低类之间的耦合性，提高系统的稳定性，降低修改程序造成的风险。
 * @author zrw
 * 
 */
public class Mother {
	/**
	 * 接口传递
	 * @param iReader
	 */
	public void narrate(IReader iReader) {
		System.out.println("妈妈开始讲故事");
		System.out.println(iReader.getContent());
	}
}
