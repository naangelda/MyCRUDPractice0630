package com.jp.ht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.ht.dao.StudentMapper;
import com.jp.ht.vo.Student;

@Service
public class StudentServiceImpl implements StudentIService {

	@Autowired
	StudentMapper studentMapperImpl;
	
	@Override
	public List<Student> findAll() {
		return studentMapperImpl.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		studentMapperImpl.deleteById(id);
	}

	@Override
	public void update(Student student) {
		studentMapperImpl.update(student);
	}

	@Override
	public Student findById(Integer id) {
		return studentMapperImpl.findById(id);
	}

	@Override
	public void add(Student student) {
		studentMapperImpl.add(student);
	}

	
	
	

}
