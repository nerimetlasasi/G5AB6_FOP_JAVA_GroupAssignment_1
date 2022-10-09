package com.greatlearning.departmentapp.model;

public class AdminDepartment extends SuperDepartment {

	@Override
	public String departmentName() {
		departmentName = "Admin Department";
		return departmentName;
	}

	@Override
	public String getTodaysWork() {
		todaysWork = "Complete your documents submission";
		return todaysWork;
	}

	@Override
	public String getWorkDeadline() {
		workDeadline = "Complete by EOD";
		return workDeadline;
	}
}
