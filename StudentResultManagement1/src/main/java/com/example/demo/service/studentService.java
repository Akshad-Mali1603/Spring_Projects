package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface studentService {
	
	public void add(Student st);
	public List<Student> display();
	public void delete(Integer id);
	public void updateStudent(Student st,Integer id);
	public List<Student> searchByField(String name,String grade, String division, String result);
	public List<Student> maxMarksStudent();

}
