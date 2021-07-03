/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2006
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


public class Tgood implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Tgood";
	public static final String ALIAS_GOOD_ID = "商品编号";
	public static final String ALIAS_GOOD_NAME = "商品名称";
	public static final String ALIAS_UNIT = "单价";
	public static final String ALIAS_PRICE = "商品价格";
	public static final String ALIAS_SALE_PRICE = "销售价格";
	public static final String ALIAS_TYPE_ID = "库存数量";
	public static final String ALIAS_REMARK = "商品标签";
	public static final String ALIAS_GOOD_INFO = "商品描述";
	public static final String ALIAS_IMAGE_ADDRESS = "图片地址";
	public static final String ALIAS_STATUS = "商品状态0-上架 1-未上架 2-下架�?除";
	public static final String ALIAS_CREATETIME = "创建时间";
	public static final String ALIAS_FIELD1 = "属�?�id";
	public static final String ALIAS_FIELD2 = "field2";
	public static final String ALIAS_FIELD3 = "field3";
	public static final String ALIAS_FIELD4 = "field4";
	public static final String ALIAS_FIELD5 = "field5";
	public static final String ALIAS_FIELD6 = "field6";
	public static final String ALIAS_FIELD7 = "field7";
	public static final String ALIAS_FIELD8 = "field8";
	public static final String ALIAS_FIELD9 = "field9";
	public static final String ALIAS_FIELD10 = "field10";
	
	//date formats
	public static final String FORMAT_CREATETIME =DateFormats.DATE_TIME_FORMAT;
	
	//可以直接使用: @Length(max=50,message="用户名长度不�?�大�?50")显示错误消�?�
	//columns START
    /**
     * �?品编�??       db_column: good_id 
     */ 	
	@Max(9999999999L)
	private java.lang.Integer goodId;
	
    /**
     * �?品名称       db_column: good_name 
     */ 	
	@Length(max=100)
	private java.lang.String goodName;
	
    /**
     * 单�?       db_column: unit 
     */ 	
	@Length(max=10)
	private java.lang.String unit;
	
    /**
     * �?品价格       db_column: price 
     */ 	
	@Length(max=17)
	private java.lang.String price;
	
    /**
     * �?售价格       db_column: sale_price 
     */ 	
	@Length(max=17)
	private java.lang.String salePrice;
	
    /**
     * 库存数�?     db_column: type_id 
     */ 	
    private double storage;
	
    /**
     * �?品�??签       db_column: remark 
     */ 	
	@Length(max=60)
	private java.lang.String remark;
	
    /**
     * �?品描述       db_column: good_info 
     */ 	
	@Length(max=1000)
	private java.lang.String goodInfo;
	
    /**
     * 图�?       db_column: image_address 
     */ 	
	@Length(max=100)
	private java.lang.String imageAddress;
	
    /**
     * �?品状�?�?0-上架 1-未上架 2-下架�?除       db_column: status 
     */ 	
	@Length(max=1)
	private java.lang.String status;
	
    /**
     * 创建时间       db_column: createtime 
     */ 	
	
	private java.util.Date createtime;
	
	private String createtimeString;
    /**
     * 属�?�id       db_column: field1 
     */ 	
	@Length(max=50)
	private java.lang.String field1;
	
    /**
     * field2       db_column: field2 
     */ 	
	@Length(max=50)
	private java.lang.String field2;
	
    /**
     * field3       db_column: field3 
     */ 	
	@Length(max=50)
	private java.lang.String field3;
	
    /**
     * field4       db_column: field4 
     */ 	
	@Length(max=50)
	private java.lang.String field4;
	
    /**
     * field5       db_column: field5 
     */ 	
	@Length(max=50)
	private java.lang.String field5;
	
    /**
     * field6       db_column: field6 
     */ 	
	@Length(max=50)
	private java.lang.String field6;
	
    /**
     * field7       db_column: field7 
     */ 	
	@Length(max=50)
	private java.lang.String field7;
	
    /**
     * field8       db_column: field8 
     */ 	
	@Length(max=50)
	private java.lang.String field8;
	
    /**
     * field9       db_column: field9 
     */ 	
	@Length(max=50)
	private java.lang.String field9;
	
    /**
     * field10       db_column: field10 
     */ 	
	@Length(max=50)
	private java.lang.String field10;
	
	//columns END

	public Tgood(){
	}

	public Tgood(
		java.lang.Integer goodId
	){
		this.goodId = goodId;
	}

		
	public void setGoodId(java.lang.Integer value) {
		this.goodId = value;
	}
	
	public java.lang.Integer getGoodId() {
		return this.goodId;
	}		
	
		
	public void setGoodName(java.lang.String value) {
		this.goodName = value;
	}
	
	public java.lang.String getGoodName() {
		return this.goodName;
	}		
	
		
	public void setUnit(java.lang.String value) {
		this.unit = value;
	}
	
	public java.lang.String getUnit() {
		return this.unit;
	}		
	
		
	public void setPrice(java.lang.String value) {
		this.price = value;
	}
	
	public java.lang.String getPrice() {
		return this.price;
	}		
	
		
	public void setSalePrice(java.lang.String value) {
		this.salePrice = value;
	}
	
	public java.lang.String getSalePrice() {
		return this.salePrice;
	}		
	

	public double getStorage() {
		return storage;
	}

	public void setStorage(double storage) {
		this.storage = storage;
	}

	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}		
	
		
	public void setGoodInfo(java.lang.String value) {
		this.goodInfo = value;
	}
	
	public java.lang.String getGoodInfo() {
		return this.goodInfo;
	}		
	
		
	public void setImageAddress(java.lang.String value) {
		this.imageAddress = value;
	}
	
	public java.lang.String getImageAddress() {
		return this.imageAddress;
	}		
	
		
	public void setStatus(java.lang.String value) {
		this.status = value;
	}
	
	public java.lang.String getStatus() {
		return this.status;
	}		
	
	public void setCreatetime(java.util.Date value) {
		this.createtime = value;
		this.createtimeString = getCreatetimeString();
	}
	
	public java.util.Date getCreatetime() {
		return this.createtime;
	}
	
	public String getCreatetimeString() {
		return this.createtimeString = DateConvertUtils.format(getCreatetime(), FORMAT_CREATETIME);
	}
	public void setCreatetimeString(String value) {
		setCreatetime(DateConvertUtils.parse(value, FORMAT_CREATETIME,java.util.Date.class));
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
	
		
	public void setField4(java.lang.String value) {
		this.field4 = value;
	}
	
	public java.lang.String getField4() {
		return this.field4;
	}		
	
		
	public void setField5(java.lang.String value) {
		this.field5 = value;
	}
	
	public java.lang.String getField5() {
		return this.field5;
	}		
	
		
	public void setField6(java.lang.String value) {
		this.field6 = value;
	}
	
	public java.lang.String getField6() {
		return this.field6;
	}		
	
		
	public void setField7(java.lang.String value) {
		this.field7 = value;
	}
	
	public java.lang.String getField7() {
		return this.field7;
	}		
	
		
	public void setField8(java.lang.String value) {
		this.field8 = value;
	}
	
	public java.lang.String getField8() {
		return this.field8;
	}		
	
		
	public void setField9(java.lang.String value) {
		this.field9 = value;
	}
	
	public java.lang.String getField9() {
		return this.field9;
	}		
	
		
	public void setField10(java.lang.String value) {
		this.field10 = value;
	}
	
	public java.lang.String getField10() {
		return this.field10;
	}		
	
	

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("GoodId",getGoodId())
			.append("GoodName",getGoodName())
			.append("Unit",getUnit())
			.append("Price",getPrice())
			.append("SalePrice",getSalePrice())
			.append("Storage",getStorage())
			.append("Remark",getRemark())
			.append("GoodInfo",getGoodInfo())
			.append("ImageAddress",getImageAddress())
			.append("Status",getStatus())
			.append("Createtime",getCreatetime())
			.append("Field1",getField1())
			.append("Field2",getField2())
			.append("Field3",getField3())
			.append("Field4",getField4())
			.append("Field5",getField5())
			.append("Field6",getField6())
			.append("Field7",getField7())
			.append("Field8",getField8())
			.append("Field9",getField9())
			.append("Field10",getField10())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getGoodId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Tgood == false) return false;
		if(this == obj) return true;
		Tgood other = (Tgood)obj;
		return new EqualsBuilder()
			.append(getGoodId(),other.getGoodId())
			.isEquals();
	}
}

