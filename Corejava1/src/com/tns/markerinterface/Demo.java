package com.tns.markerinterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"navya");
		if(s instanceof Registerable)
		{
			System.out.println("Student Regesteriable");
		}
		else
		{
			System.out.println("Student not Registered");
		}
			
	}

}
