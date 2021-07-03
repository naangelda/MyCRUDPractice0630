/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2017
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


public class Tset implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Tset";
	public static final String ALIAS_SET_ID = "setId";
	public static final String ALIAS_SET_NAME = "套餐名称";
	public static final String ALIAS_FEE = "费用";
	public static final String ALIAS_CONTENT = "套餐介�?";
	public static final String ALIAS_IMAGE_ADDRESS = "拍摄场地";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_FIELD1 = "field1";
	public static final String ALIAS_FIELD2 = "field2";
	public static final String ALIAS_FIELD3 = "field3";
	
	//date formats
	public static final String FORMAT_CREATE_TIME =DateFormats.DATE_TIME_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不�?�大�?50")显示错误消�?�
	//columns START
    /**
     * setId       db_column: set_id 
     */ 	
	@Max(9999999999L)
	private java.lang.Integer setId;
	
    /**
     * 套餐名称       db_column: set_name 
     */ 	
	@Length(max=50)
	private java.lang.String setName;
	
    /**
     * 费用       db_column: fee 
     */ 	
	
	private java.lang.Double fee;
	
    /**
     * 套餐介�?       db_column: content 
     */ 	
	@Length(max=65535)
	private java.lang.String content;
	
    /**
     * 拍摄场地       db_column: image_address 
     */ 	
	@Length(max=100)
	private java.lang.String imageAddress;
	
    /**
     * 创建时间       db_column: create_time 
     */ 	
	
	private java.util.Date createTime;
	
	private String createTimeString;
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

	public Tset(){
	}

	public Tset(
		java.lang.Integer setId
	){
		this.setId = setId;
	}

		
	public void setSetId(java.lang.Integer value) {
		this.setId = value;
	}
	
	public java.lang.Integer getSetId() {
		return this.setId;
	}		
	
		
	public void setSetName(java.lang.String value) {
		this.setName = value;
	}
	
	public java.lang.String getSetName() {
		return this.setName;
	}		
	
		
	public void setFee(java.lang.Double value) {
		this.fee = value;
	}
	
	public java.lang.Double getFee() {
		return this.fee;
	}		
	
		
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}		
	
		
	public void setImageAddress(java.lang.String value) {
		this.imageAddress = value;
	}
	
	public java.lang.String getImageAddress() {
		return this.imageAddress;
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
			.append("SetId",getSetId())
			.append("SetName",getSetName())
			.append("Fee",getFee())
			.append("Content",getContent())
			.append("ImageAddress",getImageAddress())
			.append("CreateTime",getCreateTime())
			.append("Field1",getField1())
			.append("Field2",getField2())
			.append("Field3",getField3())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSetId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Tset == false) return false;
		if(this == obj) return true;
		Tset other = (Tset)obj;
		return new EqualsBuilder()
			.append(getSetId(),other.getSetId())
			.isEquals();
	}
}

