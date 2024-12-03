package com.tcs.crm.J_stream.custom;
public class Customer {
	int Customerid;
	String Customername;
	long customersalary;
	public Customer(int customerid, String customername, long customersalary) {
		Customerid = customerid;
		Customername = customername;
		this.customersalary = customersalary;
	}
	public int getCustomerid() {
		return Customerid;
	}
	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String customername) {
		Customername = customername;
	}
	public long getCustomersalary() {
		return customersalary;
	}
	public void setCustomersalary(long customersalary) {
		this.customersalary = customersalary;
	}
	@Override
	public String toString() {
		return "Customer [Customerid=" + Customerid + ", Customername=" + Customername + ", customersalary="
				+ customersalary + "]";
	}
	
}

