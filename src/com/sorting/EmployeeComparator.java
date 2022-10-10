package com.sorting;
import java.util.*;
public class EmployeeComparator {
public static void main(String[] args) {
		
		Employee e1 =new Employee(17, "Raj", "Kolhapur");
		Employee e2 =new Employee(71, "Vishu", "Pune");
		Employee e3 =new Employee(77, "Janvi", "Sangli");
		
		EmployeeCityComparator idcom = new EmployeeCityComparator();
		EmployeeNameComparator namecom = new EmployeeNameComparator();
		EmployeeCityComparator citycom = new EmployeeCityComparator();
		
		TreeSet ts = new TreeSet(idcom);
		
		ts.add(e3);
		ts.add(e1);
		ts.add(e2);
		
		System.out.println(ts);
		
		TreeSet ts1 = new TreeSet(namecom);
		
		ts1.add(e3);
		ts1.add(e1);
		ts1.add(e2);
		
		System.out.println(ts1);
		
		TreeSet ts2 = new TreeSet(citycom);
		
		ts2.add(e3);
		ts2.add(e2);
		ts2.add(e1);
		
		System.out.println(ts2);
		
		
		
	}
}
