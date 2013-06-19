package com.gof.entity.principle.lod;

import java.util.ArrayList;
import java.util.List;

public class CompanyManager1 {
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		for (int i = 0; i < 30; i++) {
			Employee emp = new Employee();
			// 为总公司人员按顺序分配一个ID
			emp.setId("总公司" + i);
			list.add(emp);
		}
		return list;
	}

	public void printAllEmployee(SubCompanyManager1 sub) {
		sub.printEmployee();
		List<Employee> list2 = this.getAllEmployee();
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
