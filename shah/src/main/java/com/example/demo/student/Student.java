package com.example.demo.student;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table
public class Student {

	
	@Id
	@SequenceGenerator(
			name="student_seq",
			sequenceName="student_seq",
			allocationSize=1
			)
	
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="student_seq"	
			)
	
	@Column(name="Id",
	updatable=false)
	
	private Long id;
	
	private String name;
	@Column( name="email",nullable =false,columnDefinition="TEXT")
	private String email;

	private int age;
	private LocalDate dob;
	
	public Student(
			) 
	
	{
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", dob=" + dob + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Student(String name, String email, int age, LocalDate dob) {
	
		this.name = name;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}
	

}
