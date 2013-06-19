package com.gof.entity.principle.lod;

import java.util.ArrayList;
import java.util.List;

public class CompanyManager {
	public List<Employee> getAllEmployee() {
		List<Employee> list=new ArrayList<Employee>();
		for (int i=0;i<100;i++) {
			Employee emp=new Employee();
			emp.setId("总公司："+i);
			list.add(emp);
		}
		return list;
	}
	
	public void printAllEmployee(SubCompanyManager sub) {
		List<SubEmployee> list1 = sub.getAllEmployee();
		for (SubEmployee e : list1) {
			System.out.println(e.getId());
		}

		List<Employee> list2 = this.getAllEmployee();
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
