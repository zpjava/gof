package com.gof;

import org.junit.Test;

import com.gof.entity.principle.lod.CompanyManager;
import com.gof.entity.principle.lod.SubCompanyManager;

public class LODTest {
	/**
	 * 迪米特
	 */
	@Test
	public void test() {
		CompanyManager e = new CompanyManager();
		e.printAllEmployee(new SubCompanyManager()); 
	}

}
