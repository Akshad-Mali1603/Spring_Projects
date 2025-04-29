package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.studentService;

@RestController
@RequestMapping("/student")
public class studentController {

	@Autowired
	private studentService sts;
	
	@PostMapping("/add")
	public void registerStud(@RequestBody Student stud) {
		sts.add(stud);
	}
	
	@GetMapping("/display")
	public List<Student> display(){
		return sts.display();
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		sts.delete(id);
		
	}
	
	@PutMapping("/update/{id}")
	public void update(@RequestBody Student stud, @PathVariable Integer id) {
		sts.updateStudent(stud, id);
	}
	
	@GetMapping("/search")
	public List<Student> searchByField(@RequestParam(required = false) String name,
										@RequestParam(required = false) String grade,
										@RequestParam(required = false) String division,
										@RequestParam(required = false) String result){
		
		return sts.searchByField(name, grade, division, result);
		
	}
	
	@GetMapping("/max")
	public List<Student> maxResult(){
		return sts.maxMarksStudent();
	}
}
