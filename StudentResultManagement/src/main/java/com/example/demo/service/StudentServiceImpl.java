package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.studnetRepository;

@Service
public class StudentServiceImpl implements studentService {

	@Autowired
	private studnetRepository studrepo;
	
	@Override
	public void add(Student st) {

		studrepo.save(st);
	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return studrepo.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(Student st, Integer id) {
		st.setRollno(id);
		studrepo.save(st);
	}

	@Override
	public List<Student> searchByField(String name, String grade, String division, String result) {
		// TODO Auto-generated method stub
		var studentArray= new ArrayList<Student>();
		
			for (Student student : studrepo.findAll()) {
				if (name!=null &&student.getName().equalsIgnoreCase(name)||
						grade!=null && student.getGrade().equalsIgnoreCase(grade)||
						division!=null && student.getDivision().equalsIgnoreCase(division)||
						result!=null && student.getResult().equalsIgnoreCase(result)) {
					studentArray.add(student);
					return studentArray;
				}
			}
		
		return null;
	}

	@Override
	public List<Student> maxMarksStudent() {
		List<Student> maxarray = studrepo.findAll();

		List<Student> maxMarkStudent = new ArrayList<Student>();

		float max = Integer.MIN_VALUE;

		for (Student student : maxarray) {
			if (student.getMarks() > max) {
				max = student.getMarks();
			}
		}
		for (Student student : maxarray) {
			if (student.getMarks() == max) {
				maxMarkStudent.add(student);
			}
		}
		return maxMarkStudent;
	}



}
