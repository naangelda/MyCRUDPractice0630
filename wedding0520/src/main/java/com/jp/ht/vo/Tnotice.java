/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.jp.ht.vo;

import javax.validation.constraints.Max;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;

import cn.org.rapid_framework.util.DateConvertUtils;

import common.util.DateFormats;


public class Tnotice implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Tnotice";
	public static final String ALIAS_NOTICE_ID = "noticeId";
	public static final String ALIAS_NOTICE_NAME = "noticeName";
	public static final String ALIAS_CREATE_TIME = "createTime";
	public static final String ALIAS_CONTENT = "content";
	public static final String ALIAS_FIELD1 = "field1";
	public static final String ALIAS_FIELD2 = "field2";
	public static final String ALIAS_FIELD3 = "field3";
	
	//date formats
	public static final String FORMAT_CREATE_TIME =DateFormats.DATE_TIME_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不�?�大�?50")显示错误消�?�
	//columns START
    /**
     * noticeId       db_column: notice_id 
     */ 	
	@Max(9999999999L)
	private java.lang.Integer noticeId;
	
    /**
     * noticeName       db_column: notice_name 
     */ 	
	@Length(max=100)
	private java.lang.String noticeName;
	
    /**
     * createTime       db_column: create_time 
     */ 	
	
	private java.util.Date createTime;
	
	private String createTimeString;
    /**
     * content       db_column: content 
     */ 	
	@Length(max=65535)
	private java.lang.String content;
	
    /**
     * field1       db_column: field1 
     */ 	
	@Length(max=10)
	private java.lang.String field1;
	
    /**
     * field2       db_column: field2 
     */ 	
	@Length(max=10)
	private java.lang.String field2;
	
    /**
     * field3       db_column: field3 
     */ 	
	@Length(max=10)
	private java.lang.String field3;
	
	//columns END

	public Tnotice(){
	}

	public Tnotice(
		java.lang.Integer noticeId
	){
		this.noticeId = noticeId;
	}

		
	public void setNoticeId(java.lang.Integer value) {
		this.noticeId = value;
	}
	
	public java.lang.Integer getNoticeId() {
		return this.noticeId;
	}		
	
		
	public void setNoticeName(java.lang.String value) {
		this.noticeName = value;
	}
	
	public java.lang.String getNoticeName() {
		return this.noticeName;
	}		
	
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
		this.createTimeString = getCreateTimeString();
	}
	
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	public String getCreateTimeString() {
		return this.createTimeString = DateConvertUtils.format(getCreateTime(), FORMAT_CREATE_TIME);
	}
	public void setCreateTimeString(String value) {
		setCreateTime(DateConvertUtils.parse(value, FORMAT_CREATE_TIME,java.util.Date.class));
	}
		
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}		
	
		
	public void setField1(java.lang.String value) {
		this.field1 = value;
	}
	
	public java.lang.String getField1() {
		return this.field1;
	}		
	
		
	public void setField2(java.lang.String value) {
		this.field2 = value;
	}
	
	public java.lang.String getField2() {
		return this.field2;
	}		
	
		
	public void setField3(java.lang.String value) {
		this.field3 = value;
	}
	
	public java.lang.String getField3() {
		return this.field3;
	}		
	
	

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("NoticeId",getNoticeId())
			.append("NoticeName",getNoticeName())
			.append("CreateTime",getCreateTime())
			.append("Content",getContent())
			.append("Field1",getField1())
			.append("Field2",getField2())
			.append("Field3",getField3())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getNoticeId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Tnotice == false) return false;
		if(this == obj) return true;
		Tnotice other = (Tnotice)obj;
		return new EqualsBuilder()
			.append(getNoticeId(),other.getNoticeId())
			.isEquals();
	}
}

