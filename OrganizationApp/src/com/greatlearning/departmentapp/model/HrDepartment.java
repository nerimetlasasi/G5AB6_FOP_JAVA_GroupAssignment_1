package com.greatlearning.departmentapp.model;

public class HrDepartment extends SuperDepartment {
	private String activity = "Team lunch";

	@Override
	public String departmentName() {
		departmentName = "HR Departent";
		return departmentName;
	}

	@Override
	public String getTodaysWork() {
		todaysWork = "Fill today's timesheet and mark your attendance";
		return todaysWork;
	}

	@Override
	public String getWorkDeadline() {
		workDeadline = "Complete by EOD";
		return workDeadline;
	}

	public String doActivity() {
		return activity;
	}
}
