package com.jp.ht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.ht.vo.Tmenu;

import common.base.EntityDao;
import common.dwz.DwzPageQuery;

@Service
public class TmenuServiceImpl implements TmenuIService{
	
	@Autowired
	EntityDao<Tmenu, Integer> tmenuDao;

	@Override
	public List<Tmenu> findByCondition(DwzPageQuery query) {
		return tmenuDao.findByCondition(query);
	}
	
}
