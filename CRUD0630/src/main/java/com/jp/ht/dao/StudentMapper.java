package com.jp.ht.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jp.ht.vo.Student;

public interface StudentMapper {
	public List<Student> findAll();
	public void deleteById(Integer id);
	public void update(Student student);
	public Student findById(Integer id);
	
	public void add(Student student);
}
