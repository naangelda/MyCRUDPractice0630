package com.jp.ht.service;

import java.util.List;

import com.jp.ht.vo.Tmenu;

import common.dwz.DwzPageQuery;

public interface TmenuIService {
	public List<Tmenu> findByCondition(DwzPageQuery query);
	
}
