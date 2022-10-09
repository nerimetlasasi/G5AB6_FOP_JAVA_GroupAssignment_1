package com.greatlearning.departmentapp.main;

import com.greatlearning.departmentapp.model.AdminDepartment;
import com.greatlearning.departmentapp.model.HrDepartment;
import com.greatlearning.departmentapp.model.SuperDepartment;
import com.greatlearning.departmentapp.model.TechDepartment;

public class DriverClass {
	
	public static void main(String[] args) {
		SuperDepartment admin = new AdminDepartment(); // Used upcasting in Polymorphism concept
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday()+"\n");
		
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday()+"\n");
	}
}
