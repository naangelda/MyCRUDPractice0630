package com.jp.ht.service;

import java.util.List;

import com.jp.ht.vo.Student;

public interface StudentIService {
	public List<Student> findAll();
	public void deleteById(Integer id);
	public void update(Student student);
	public Student findById(Integer id);
	public void add(Student student);
	
}
