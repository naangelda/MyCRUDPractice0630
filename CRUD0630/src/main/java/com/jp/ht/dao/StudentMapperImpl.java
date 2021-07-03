package com.jp.ht.dao;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.jp.ht.vo.Student;

@Repository
public class StudentMapperImpl  extends SqlMapClientDaoSupport implements StudentMapper{

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findAll() {
		return (List<Student>)getSqlMapClientTemplate().queryForList("findAll");
	}
	
	@Override
	public void deleteById(Integer id) {
		getSqlMapClientTemplate().delete("deleteById",id);
	}

	@Override
	public void update(Student student) {
		getSqlMapClientTemplate().update("update",student);
	}

	@Override
	public Student findById(Integer id) {
		return (Student)getSqlMapClientTemplate().queryForObject("findById", id);
	}

	@Override
	public void add(Student student) {
		getSqlMapClientTemplate().insert("add",student);
	}
	
	
	
}
