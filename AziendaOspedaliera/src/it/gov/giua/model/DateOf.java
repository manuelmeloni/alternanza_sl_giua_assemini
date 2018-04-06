package it.gov.giua.model;

import java.time.LocalDate;

public class DateOf {
	
	//Attributes
	private int year;
	private int month;
	private int day;
	
	//Constructors
	public DateOf() {
		this.year = 0;
		this.month = 0;
		this.day = 0;
	}
	public DateOf(DateOf d) {
		this.year = d.getYear();
		this.month = d.getMonth();
		this.day = d.getDay();
	}
	public DateOf(int year, int month, int day) {
		if(!(this.setYear(year) && this.setMonth(month) && this.setDay(day))) {
			this.year = LocalDate.now().getYear();
			this.month = LocalDate.now().getMonthValue();
			this.day = LocalDate.now().getDayOfMonth();
		}
	}
	
	//Properties
	public boolean setYear(int year) {
		if(year >= 0 && year <= LocalDate.now().getYear()) {
			this.year = year;
			return true;
		}
		else
			return false;
	}
	public boolean setMonth(int month) {
		if(month >= 1 && month <= 12) {
			this.month = month;
			return true;
		}
		return false;
	}
	public boolean setDay(int day) {
		if(day >= 1 && day <= 31 && (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12)) {
			this.day = day;
			return true;
		}
		else if(day >= 1 && day <= 30 && (this.month == 2 || this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)) {
			this.day = day;
			return true;
		}
		else if(day >= 1 && day <= 29 && this.month == 2) {
			this.day = day;
			return true;
		}
		else
			return false;
	}
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	
	//toString
	public String toString() {
		return this.year + "-" + this.month + "-" + this.day;
	}
	
	//equals
	public boolean equals(DateOf d) {
		if(this.year == d.getYear() && this.month == d.getMonth() && this.day == d.getDay())
			return true;
		else
			return false;
	}
}
