package com.tcs.crm.custom;

public class Employee {
	String Empid;
	long Empsalary;
	public Employee(String string, long empsalary) {
		this.Empid = string;
		this.Empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + Empid + ", empsalary=" + Empsalary + ", getEmpid()=" + getEmpid()
		+ ", getEmpsalary()=" + getEmpsalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
		+ ", toString()=" + super.toString() + "]";
	}
	public String getEmpid() {
		return Empid;
	}
	public void setEmpid(String empid) {
		this.Empid = empid;
	}
	public long getEmpsalary() {
		return Empsalary;
	}
	public void setEmpsalary(long empsalary) {
		this.Empsalary = empsalary;
	}






}
