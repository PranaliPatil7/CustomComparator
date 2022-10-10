package com.sorting;
import java.util.*;
public class Employee {
	int Empid;
	String Empname;
	String Empcity;
	
	public Employee() {
		super();
	}
	
	public Employee(int Empid, String Empname, String Empcity) {
		super();
		this.Empid = Empid;
		this.Empname = Empname;
		this.Empcity = Empcity;
	}

	
	@Override
	public int hashCode() {
		
		return Objects.hash(Empid, Empname, Empcity);
	}

	@Override
	public boolean equals(Object o) {
		
		if (this == o)
			return true;
		if (o == null  || getClass() != o.getClass())
			return false;
		Employee object = (Employee) o;
		return  Objects.equals(Empname, object.Empname) && Objects.equals(Empcity, object.Empcity) && Empid == object.Empid;
		
	}

	@Override
	public String toString() {
		
	 return "Student [Empid=" + Empid + ", Empname=" + Empname + ",Empcity="+ Empcity + "]";
	}

}
