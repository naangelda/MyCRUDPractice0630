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


public class Tcustomer implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Tcustomer";
	public static final String ALIAS_CUSTOMER_ID = "customerId";
	public static final String ALIAS_NAME = "姓名";
	public static final String ALIAS_ID_CARD = "身份证号码";
	public static final String ALIAS_SEX = "性别";
	public static final String ALIAS_TELEPHONE = "联系方式";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_FIELD1 = "field1";
	public static final String ALIAS_FIELD2 = "field2";
	public static final String ALIAS_FIELD3 = "field3";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不大于50")显示错误消息
	//columns START
    /**
     * customerId       db_column: customer_id 
     */ 	
	@Max(9999999999L)
	private java.lang.Integer customerId;
	
    /**
     * 姓名       db_column: name 
     */ 	
	@Length(max=100)
	private java.lang.String name;
	
    /**
     * 身份证号�?       db_column: id_card 
     */ 	
	@Length(max=20)
	private java.lang.String idCard;
	
    /**
     * 性别       db_column: sex 
     */ 	
	@Length(max=10)
	private java.lang.String sex;
	
    /**
     * 联系方�?       db_column: telephone 
     */ 	
	@Length(max=20)
	private java.lang.String telephone;
	
    /**
     * �?注       db_column: remark 
     */ 	
	@Length(max=65535)
	private java.lang.String remark;
	
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

	public Tcustomer(){
	}

	public Tcustomer(
		java.lang.Integer customerId
	){
		this.customerId = customerId;
	}

		
	public void setCustomerId(java.lang.Integer value) {
		this.customerId = value;
	}
	
	public java.lang.Integer getCustomerId() {
		return this.customerId;
	}		
	
		
	public void setName(java.lang.String value) {
		this.name = value;
	}
	
	public java.lang.String getName() {
		return this.name;
	}		
	
		
	public void setIdCard(java.lang.String value) {
		this.idCard = value;
	}
	
	public java.lang.String getIdCard() {
		return this.idCard;
	}		
	
		
	public void setSex(java.lang.String value) {
		this.sex = value;
	}
	
	public java.lang.String getSex() {
		return this.sex;
	}		
	
		
	public void setTelephone(java.lang.String value) {
		this.telephone = value;
	}
	
	public java.lang.String getTelephone() {
		return this.telephone;
	}		
	
		
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
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
			.append("CustomerId",getCustomerId())
			.append("Name",getName())
			.append("IdCard",getIdCard())
			.append("Sex",getSex())
			.append("Telephone",getTelephone())
			.append("Remark",getRemark())
			.append("Field1",getField1())
			.append("Field2",getField2())
			.append("Field3",getField3())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getCustomerId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Tcustomer == false) return false;
		if(this == obj) return true;
		Tcustomer other = (Tcustomer)obj;
		return new EqualsBuilder()
			.append(getCustomerId(),other.getCustomerId())
			.isEquals();
	}
}

