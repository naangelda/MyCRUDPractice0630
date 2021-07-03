package com.jp.ht.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jp.ht.service.StudentIService;
import com.jp.ht.vo.Student;

public class Test {
	
	@Autowired
	StudentIService studentServiceImpl;
	
	@org.junit.Test
	public void test1() {
		List<Student> list = studentServiceImpl.findAll();
		System.out.println(list);
	}	
}
