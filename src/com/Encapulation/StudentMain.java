package com.Encapulation;

import java.util.Scanner;

public class StudentMain {
	
	public static void getUserInput() {
		
		
		System.out.println("Enter the StudentId >> ");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		System.out.println("Enter the Name >> ");
		String name = scanner.next();
		System.out.println("Enter the City >> ");
		String city = scanner.next();

		Student student = new Student();
		student.setStudentId(id);
		student.setStudentName(name);
		student.setStudentCity(city);

		System.out.println("Student Id>>" + student.getStudentId());
		System.out.println("Student Name>>" + student.getStudentName());
		System.out.println("Student City>>" + student.getStudentCity());

		
	}
	public static void main(String[] args) {
		getUserInput();
	}
}
