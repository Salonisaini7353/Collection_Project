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
		List<Customer> Listobj = new  ArrayList<>();
		Listobj.add(customerList10);
		Listobj.add(customerList9);
		Listobj.add(customerList8);
		Listobj.add(customerList7);
		Listobj.add(customerList6);
		Listobj.add(customerList5);
		Listobj.add(customerList4);
		Listobj.add(customerList3);
		Listobj.add(customerList2);
		Listobj.add(customerList1);
		System.out.println("size of the list " + Listobj.size());
		Comparator<Customer> Comparingnamesalary = Comparator.comparing(Customer :: getCustomername)
				.thenComparing(Customer :: getCustomersalary);
		List<Customer> collectList = Listobj.stream()
				.filter(c->c.getCustomername().startsWith("s"))
				.sorted(Comparingnamesalary)
				.distinct()
				.collect(Collectors.toList());
		for(Customer cusobj :collectList) {
			System.out.println(cusobj.getCustomerid() +":"+ cusobj.getCustomername() +":"+ cusobj.getCustomersalary());
		}
	}
}
