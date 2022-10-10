package com.sorting;
import java.util.*;
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {		
		return (emp1.Empname.compareTo(emp2.Empname));
	}
}
