package com.sorting;
import java.util.*;
public class EmployeeCityComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return (emp1.Empcity.compareTo(emp2.Empcity));
	}
}
