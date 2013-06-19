package com.gof.entity.principle.lod;

import java.util.ArrayList;
import java.util.List;

public class SubCompanyManager {
	public List<SubEmployee> getAllEmployee() {
		List<SubEmployee> list=new ArrayList<SubEmployee>();
		for (int i=0;i<100;i++) {
			SubEmployee emp=new SubEmployee();
			emp.setId("分公司："+i);
			list.add(emp);
		}
		return list;
	}
}
