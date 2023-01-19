package com.yedam.java.ch03;

public class MainExample {
	public static void main(String[] args) {

		// Course1
		Person person = new Person();
		Applicant<Person> applicant = new Applicant<>(person);  
		Course.registerCourse1(applicant);
		
		Course.registerCourse1(new Applicant<Person>(new Person()));  
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HightStudent>(new HightStudent()));
		Course.registerCourse1(new Applicant<MiddleSutdent>(new MiddleSutdent()));
		System.out.println();
		// Course2
		Course.registerCourse2(new Applicant<Person>(new Person()));  
		Course.registerCourse2(new Applicant<Worker>(new Worker()));
//		Course.registerCourse2(new Applicant<Student>(new Student()));
//		Course.registerCourse2(new Applicant<HightStudent>(new HightStudent()));
//		Course.registerCourse2(new Applicant<MiddleSutdent>(new MiddleSutdent()));
		System.out.println();
		// Course3
//		Course.registerCourse3(new Applicant<Person>(new Person()));  
//		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		Course.registerCourse3(new Applicant<Student>(new Student()));
		Course.registerCourse3(new Applicant<HightStudent>(new HightStudent()));
		Course.registerCourse3(new Applicant<MiddleSutdent>(new MiddleSutdent()));
		
	}
}