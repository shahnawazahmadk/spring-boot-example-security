package com.example.demo.student;

import java.time.Month;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class StudentService {

	private final StudentRepository studentrepository ;
	
	
	@Autowired
	public StudentService(StudentRepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}



	public List<Student> getStudent() {
		
		return studentrepository.findAll();
		
	}
	

	public void addnewStudent(Student student) {
		Optional <Student> studentbyemail = studentrepository.findStudentByEmail(student.getEmail());
		if(studentbyemail.isPresent())
		{
			throw new IllegalStateException("email taken");
		}
		System.out.println(student);
	}



	public void deleteStudent(Long studentid) {
	
		boolean exits=studentrepository.existsById(studentid);
		if(!exits)
		{
			throw new IllegalStateException("Stduent Id does not exists");
		}
		studentrepository.deleteById(studentid);
		
		
	}



	public void UpdateStudent(long studentid, String name) {
		// TODO Auto-generated method stub
		
	}

}
