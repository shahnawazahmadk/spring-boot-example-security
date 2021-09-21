package com.example.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/student")
public class StudentController {
	
	private final StudentService studentservice;
	
	
	@Autowired
	public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}


	@GetMapping
	public List<Student> getStudent() {
		return studentservice.getStudent();
		
		
		
	}
	@PostMapping
	public void RegisterNewStudent(@RequestBody Student student)
	{
		studentservice.addnewStudent(student);
	}
	
	@DeleteMapping(path="{id}")
	public void deleteStudent(@PathVariable("id")Long id)
	{
		studentservice.deleteStudent(id);
	}
	
	@PutMapping(path="{id}")
	public void updateStudent(
	
		@PathVariable("id") long studentid,@PathVariable(required=false)String name)
		{
			
		
		studentservice.UpdateStudent(studentid,name);
		}
}
