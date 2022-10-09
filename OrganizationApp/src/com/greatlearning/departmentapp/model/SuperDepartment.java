package com.greatlearning.departmentapp.model;

import java.util.Calendar;

public abstract class SuperDepartment {

	protected String departmentName = "Super Department";
	protected String todaysWork = "No work as of now";
	protected String workDeadline = "Nil";

	public String departmentName() {
		return departmentName;
	}

	public String getTodaysWork() {
		return todaysWork;
	}

	public String getWorkDeadline() {
		return workDeadline;
	}

	public String isTodayAHoliday() {
		Calendar calendar = Calendar.getInstance();
		if (calendar.DAY_OF_WEEK < 6) { // Considering Saturdays and Sundays are holidays
			return "Today is not a Holiday";
		} else
			return "Today is a Holiday";
	}
}
