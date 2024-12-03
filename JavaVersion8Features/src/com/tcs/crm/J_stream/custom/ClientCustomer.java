package com.tcs.crm.J_stream.custom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class ClientCustomer {
	public static void main(String[] args) {
		Customer customerList1 = new Customer(1, "Amit", 10000);
		Customer customerList2 = new Customer(2, "Dev", 20000);
		Customer customerList3 = new Customer(3, "Rohan", 25000);
		Customer customerList4 = new Customer(4, "Rohan", 18000);
		Customer customerList5= new Customer(5, "Sohan", 12000);
		Customer customerList6 = new Customer(6, "Mohan", 28000);
		Customer customerList7 = new Customer(7, "Kajal", 30000);
		Customer customerList8 = new Customer(8, "Saloni", 35000);
		Customer customerList9 = new Customer(9, "Meera", 32000);
		Customer customerList10 = new Customer(10, "Veer", 40000);
		List<Customer> listObj = new  ArrayList<>();
		listObj.add(customerList1);
		listObj.add(customerList2);
		listObj.add(customerList3);
		listObj.add(customerList4);
		listObj.add(customerList5);
		listObj.add(customerList6);
		listObj.add(customerList7);
		listObj.add(customerList8);
		listObj.add(customerList9);
		listObj.add(customerList10);
		for(Customer res :  listObj) {
			System.out.println(res);
		}
		System.out.println("size of the list " + listObj.size());
		Comparator<Customer> Comparingnamesalary = Comparator.comparing(Customer :: getCustomername)
				.thenComparing(Customer :: getCustomersalary);
		List<Customer> collectList = listObj.stream()
				.filter(c->c.getCustomername().startsWith("s"))
				.sorted(Comparingnamesalary)
				.collect(Collectors.toList());
			
		
		for(Customer cusobj : collectList) {
			System.out.println("Message"+cusobj.getCustomerid() +":"+ cusobj.getCustomername() +":"+ cusobj.getCustomersalary());
		}
	}
}
