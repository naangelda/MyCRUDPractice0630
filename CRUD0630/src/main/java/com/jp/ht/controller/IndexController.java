package com.jp.ht.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jp.ht.service.StudentIService;
import com.jp.ht.vo.Student;

@Controller
@RequestMapping("/student")
public class IndexController {
	
	@Autowired
	StudentIService studentServiceImpl;
	
	@RequestMapping("/access")
	public String show(Model model) {
		System.out.println("access to index");
		List<Student> studentList = studentServiceImpl.findAll();
		model.addAttribute("studentList", studentList);
		return "index";
	}
	
	@RequestMapping("/delete/{id}")
	@ResponseBody
	public int show(@PathVariable Integer id) {
		try {
			
			studentServiceImpl.deleteById(id);
		}catch (Exception e) {
			return -1;
		}
		return 1;
	}
	@RequestMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Integer id) {
		Student student = studentServiceImpl.findById(id);
		model.addAttribute("student",student);
		return "edit";
	}
	
	@RequestMapping("/addPage")
	public String addPage() {
		return "add";
	}
	
	@RequestMapping("/update")
	public String update(Model model,Student student) {
		try {
			System.out.println(student);
			if(student.getId()!=null&&student.getStuId()!=null) {
				System.out.println("updating...");
				studentServiceImpl.update(student);
				System.out.println("updated.");
			}else {
			}
		}catch (Exception e) {
			model.addAttribute("errorMsg", "修改失败");
		}
		return "default";
	}
	
	@RequestMapping("/add")
	public String add(Model model,Student student) {
		try {
			System.out.println(student);
			System.out.println("adding...");
			studentServiceImpl.add(student);
			System.out.println("added.");
		}catch (Exception e) {
			model.addAttribute("errorMsg", "添加失败");
		}
		return "default";
	}
	
}
