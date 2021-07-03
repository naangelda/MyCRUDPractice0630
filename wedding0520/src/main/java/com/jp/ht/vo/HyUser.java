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


public class HyUser implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "HyUser";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_USER_NO = "工号";
	public static final String ALIAS_REAL_NAME = "姓名";
	public static final String ALIAS_PHONE_NUM = "手机号码";
	public static final String ALIAS_ADDRESS = "联系地址";
	public static final String ALIAS_ROLE_ID = "角色id";
	public static final String ALIAS_USER_STATUS = "是否可用";
	public static final String ALIAS_USER_REMARK = "标注";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_FIELD1 = "field1";
	public static final String ALIAS_IS_ADMIN = "是否超级管理员";
	public static final String ALIAS_FIELD2 = "field2";
	public static final String ALIAS_FIELD3 = "field3";
	
	//date formats
	public static final String FORMAT_CREATE_TIME =DateFormats.DATE_TIME_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不�?�大�?50")显示错误消�?�
	//columns START
    /**
     * userId       db_column: user_id 
     */ 	
	@Max(9999999999L)
	private java.lang.Integer userId;
	
    /**
     * 工号       db_column: user_no 
     */ 	
	@Length(max=10)
	private java.lang.String userNo;
	
    /**
     * 姓名       db_column: real_name 
     */ 	
	@Length(max=30)
	private java.lang.String realName;
	
    /**
     * 手机号�?       db_column: phone_num 
     */ 	
	@Length(max=20)
	private java.lang.String phoneNum;
	
    /**
     * 联系地�?       db_column: address 
     */ 	
	@Length(max=200)
	private java.lang.String address;
	
    /**
     * 角色id       db_column: role_id 
     */ 	
	@Max(9999999999L)
	private java.lang.Integer roleId;
	
    /**
     * 是否可用       db_column: user_status 
     */ 	
	@Length(max=10)
	private java.lang.String userStatus;
	
    /**
     * �?注       db_column: user_remark 
     */ 	
	@Length(max=200)
	private java.lang.String userRemark;
	
    /**
     * 创建时间       db_column: create_time 
     */ 	
	
	private java.util.Date createTime;
	
	private String createTimeString;
    /**
     * �?�?       db_column: field1 
     */ 	
	@Length(max=10)
	private java.lang.String field1;
	
    /**
     * 是否�?级管�?�?       db_column: isAdmin 
     */ 	
	@Length(max=10)
	private java.lang.String isAdmin;
	
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

	public HyUser(){
	}

	public HyUser(java.lang.Integer userId){
		this.userId = userId;
	}

		
	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	public java.lang.Integer getUserId() {
		return this.userId;
	}		
	
		
	public void setUserNo(java.lang.String value) {
		this.userNo = value;
	}
	
	public java.lang.String getUserNo() {
		return this.userNo;
	}		
	
		
	public void setRealName(java.lang.String value) {
		this.realName = value;
	}
	
	public java.lang.String getRealName() {
		return this.realName;
	}		
	
		
	public void setPhoneNum(java.lang.String value) {
		this.phoneNum = value;
	}
	
	public java.lang.String getPhoneNum() {
		return this.phoneNum;
	}		
	
		
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}		
	
		
	public void setRoleId(java.lang.Integer value) {
		this.roleId = value;
	}
	
	public java.lang.Integer getRoleId() {
		return this.roleId;
	}		
	
		
	public void setUserStatus(java.lang.String value) {
		this.userStatus = value;
	}
	
	public java.lang.String getUserStatus() {
		return this.userStatus;
	}		
	
		
	public void setUserRemark(java.lang.String value) {
		this.userRemark = value;
	}
	
	public java.lang.String getUserRemark() {
		return this.userRemark;
	}		
	
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
		this.createTime = getCreateTime();
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
	
		
	public void setIsAdmin(java.lang.String value) {
		this.isAdmin = value;
	}
	
	public java.lang.String getIsAdmin() {
		return this.isAdmin;
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
			.append("UserId",getUserId())
			.append("UserNo",getUserNo())
			.append("RealName",getRealName())
			.append("PhoneNum",getPhoneNum())
			.append("Address",getAddress())
			.append("RoleId",getRoleId())
			.append("UserStatus",getUserStatus())
			.append("UserRemark",getUserRemark())
			.append("CreateTime",getCreateTime())
			.append("Field1",getField1())
			.append("IsAdmin",getIsAdmin())
			.append("Field2",getField2())
			.append("Field3",getField3())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getUserId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof HyUser == false) return false;
		if(this == obj) return true;
		HyUser other = (HyUser)obj;
		return new EqualsBuilder()
			.append(getUserId(),other.getUserId())
			.isEquals();
	}
}

