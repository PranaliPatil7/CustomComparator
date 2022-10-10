package com.sorting;
import java.util.*;
public class EmployeeIdComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
	
		if (emp1.Empid == emp2.Empid)
			return 0;
		else if(emp1.Empid > emp2.Empid)
			return 1;
		else
			return -1;
		
	}
}
