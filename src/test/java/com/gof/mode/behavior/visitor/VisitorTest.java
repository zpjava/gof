package com.gof.mode.behavior.visitor;

import java.util.List;

import org.junit.Test;

import com.gof.entity.mode.behavior.visitor.Element;
import com.gof.entity.mode.behavior.visitor.ObjectStruture;
import com.gof.entity.mode.behavior.visitor.Visitor;

public class VisitorTest {

	@Test
	public void test() {
		List<Element> list = ObjectStruture.getList();
		for (Element e : list) {
			e.accept(new Visitor());
		}
	}

}
