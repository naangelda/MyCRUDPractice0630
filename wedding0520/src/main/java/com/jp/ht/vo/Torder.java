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


public class Torder implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Torder";
	public static final String ALIAS_ORDER_ID = "orderId";
	public static final String ALIAS_CUSTOMER_ID = "客户id";
	public static final String ALIAS_CUSTOMER_NAME = "客户姓名";
	public static final String ALIAS_TOTAL_FEE = "总费用";
	public static final String ALIAS_CONTENT = "消费�?容";
	public static final String ALIAS_CREATE_TIME = "下单日�?";
	public static final String ALIAS_FIELD1 = "field1";
	public static final String ALIAS_FIELD2 = "field2";
	public static final String ALIAS_FIELD3 = "field3";
	
	//date formats
	public static final String FORMAT_CREATE_TIME =DateFormats.DATE_TIME_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不�?�大�?50")显示错误消�?�
	//columns START
    /**
     * orderId       db_column: order_id 
     */ 	
	@Max(9999999999L)
	private java.lang.Integer orderId;
	
    /**
     * 会员id       db_column: customer_id 
     */ 	
	@Max(9999999999L)
	private java.lang.Integer customerId;
	
    /**
     * 会员姓名       db_column: customer_name 
     */ 	
	@Length(max=50)
	private java.lang.String customerName;
	
    /**
     * 总费用       db_column: total_fee 
     */ 	
	
	private java.lang.Double totalFee;
	
    /**
     * 消费�?容       db_column: content 
     */ 	
	@Length(max=65535)
	private java.lang.String content;
	
    /**
     * 下单日�?       db_column: create_time 
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
	@Length(max=20)
	private java.lang.String field2;
	
    /**
     * field3       db_column: field3 
     */ 	

	private java.lang.Integer field3;
	
	private java.lang.Integer field4;
	
	//columns END

	public Torder(){
	}

	public Torder(
		java.lang.Integer orderId
	){
		this.orderId = orderId;
	}

		
	public void setOrderId(java.lang.Integer value) {
		this.orderId = value;
	}
	
	public java.lang.Integer getOrderId() {
		return this.orderId;
	}		
	
		
	public void setCustomerId(java.lang.Integer value) {
		this.customerId = value;
	}
	
	public java.lang.Integer getCustomerId() {
		return this.customerId;
	}		
	
		
	public void setCustomerName(java.lang.String value) {
		this.customerName = value;
	}
	
	public java.lang.String getCustomerName() {
		return this.customerName;
	}		
	
		
	public void setTotalFee(java.lang.Double value) {
		this.totalFee = value;
	}
	
	public java.lang.Double getTotalFee() {
		return this.totalFee;
	}		
	
		
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
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
	


	public java.lang.Integer getField3() {
		return field3;
	}

	public void setField3(java.lang.Integer field3) {
		this.field3 = field3;
	}

	public java.lang.Integer getField4() {
		return field4;
	}

	public void setField4(java.lang.Integer field4) {
		this.field4 = field4;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("OrderId",getOrderId())
			.append("CustomerId",getCustomerId())
			.append("CustomerName",getCustomerName())
			.append("TotalFee",getTotalFee())
			.append("Content",getContent())
			.append("CreateTime",getCreateTime())
			.append("Field1",getField1())
			.append("Field2",getField2())
			.append("Field3",getField3())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getOrderId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Torder == false) return false;
		if(this == obj) return true;
		Torder other = (Torder)obj;
		return new EqualsBuilder()
			.append(getOrderId(),other.getOrderId())
			.isEquals();
	}
}

