package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Student name in Student class");
	}
	public void studentDept()
	{
		System.out.println("Student Dept in Student class");
	}
	public void studentId()
	{
		System.out.println("Student Id in Student class");
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentId();
		student.studentDept();
	}
}
