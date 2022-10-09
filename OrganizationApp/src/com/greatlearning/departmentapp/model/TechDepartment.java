package com.greatlearning.departmentapp.model;

public class TechDepartment extends SuperDepartment {

	private String techStackInformation;

	@Override
	public String departmentName() {
		departmentName = "Tech Department";
		return departmentName;
	}

	@Override
	public String getTodaysWork() {
		todaysWork = "Complete coding of Module 1";
		return todaysWork;
	}

	@Override
	public String getWorkDeadline() {
		workDeadline = "Complete by EOD";
		return workDeadline;
	}

	public String getTechStackInformation() {
		techStackInformation = "Core Java";
		return techStackInformation;
	}
}
