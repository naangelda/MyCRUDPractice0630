/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2006
 */

package com.jp.ht.query;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jp.ht.vo.Tgood;

import cn.org.rapid_framework.util.DateConvertUtils;
import common.dwz.DwzPageQuery;
import common.util.DateFormats;


public class TgoodQuery extends DwzPageQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    
  //date formats
	public static final String FORMAT_FTIME =DateFormats.DATE_FORMAT;
    

	/** �?品编�?? */
	private java.lang.Integer goodId;
	/** �?品名称 */
	private java.lang.String goodName;
	/** 单�? */
	private java.lang.String unit;
	/** �?品价格 */
	private java.lang.String price;
	/** �?售价格 */
	private java.lang.String salePrice;
	/** 库存数�? */
	private java.lang.Double storage;
	/** �?品�??签 */
	private java.lang.String remark;
	/** �?品描述 */
	private java.lang.String goodInfo;
	/** 图�? */
	private java.lang.String imageAddress;
	/** �?品状�?�?0-上架 1-未上架 2-下架�?除 */
	private java.lang.String status;
	/** 创建时间 */
	private java.util.Date createtimeBegin;
	private java.util.Date createtimeEnd;
	/** 属�?�id */
	private java.lang.String field1;
	/** field2 */
	private java.lang.String field2;
	/** field3 */
	private java.lang.String field3;
	/** field4 */
	private java.lang.String field4;
	/** field5 */
	private java.lang.String field5;
	/** field6 */
	private java.lang.String field6;
	/** field7 */
	private java.lang.String field7;
	/** field8 */
	private java.lang.String field8;
	/** field9 */
	private java.lang.String field9;
	/** field10 */
	private java.lang.String field10;

	public java.lang.Integer getGoodId() {
		return this.goodId;
	}
	
	public void setGoodId(java.lang.Integer value) {
		this.goodId = value;
	}
	
	public java.lang.String getGoodName() {
		return this.goodName;
	}
	
	public void setGoodName(java.lang.String value) {
		this.goodName = value;
	}
	
	public java.lang.String getUnit() {
		return this.unit;
	}
	
	public void setUnit(java.lang.String value) {
		this.unit = value;
	}
	
	public java.lang.String getPrice() {
		return this.price;
	}
	
	public void setPrice(java.lang.String value) {
		this.price = value;
	}
	
	public java.lang.String getSalePrice() {
		return this.salePrice;
	}
	
	public void setSalePrice(java.lang.String value) {
		this.salePrice = value;
	}
	
	
	
	public java.lang.Double getStorage() {
		return storage;
	}

	public void setStorage(java.lang.Double storage) {
		this.storage = storage;
	}

	public java.lang.String getRemark() {
		return this.remark;
	}
	
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getGoodInfo() {
		return this.goodInfo;
	}
	
	public void setGoodInfo(java.lang.String value) {
		this.goodInfo = value;
	}
	
	public java.lang.String getImageAddress() {
		return this.imageAddress;
	}
	
	public void setImageAddress(java.lang.String value) {
		this.imageAddress = value;
	}
	
	public java.lang.String getStatus() {
		return this.status;
	}
	
	public void setStatus(java.lang.String value) {
		this.status = value;
	}
	
	public java.util.Date getCreatetimeBegin() {
		return this.createtimeBegin;
	}
	
	public String getCreatetimeBeginString() {
		return DateConvertUtils.format(getCreatetimeBegin(), Tgood.FORMAT_CREATETIME);
	}
	
	public void setCreatetimeBegin(java.util.Date value) {
		this.createtimeBegin = value;
	}	
	
	public void setCreatetimeBeginString(String value) {
		setCreatetimeBegin(DateConvertUtils.parse(value, Tgood.FORMAT_CREATETIME,java.util.Date.class));
	}
	
	public java.util.Date getCreatetimeEnd() {
		return this.createtimeEnd;
	}
	
	public String getCreatetimeEndString() {
		return DateConvertUtils.format(getCreatetimeEnd(), Tgood.FORMAT_CREATETIME);
	}
	
	public void setCreatetimeEnd(java.util.Date value) {
		this.createtimeEnd = value;
	}
	public void setCreatetimeEndString(String value) {
		setCreatetimeEnd(DateConvertUtils.parse(value, Tgood.FORMAT_CREATETIME,java.util.Date.class));
	}
	
	public java.lang.String getField1() {
		return this.field1;
	}
	
	public void setField1(java.lang.String value) {
		this.field1 = value;
	}
	
	public java.lang.String getField2() {
		return this.field2;
	}
	
	public void setField2(java.lang.String value) {
		this.field2 = value;
	}
	
	public java.lang.String getField3() {
		return this.field3;
	}
	
	public void setField3(java.lang.String value) {
		this.field3 = value;
	}
	
	public java.lang.String getField4() {
		return this.field4;
	}
	
	public void setField4(java.lang.String value) {
		this.field4 = value;
	}
	
	public java.lang.String getField5() {
		return this.field5;
	}
	
	public void setField5(java.lang.String value) {
		this.field5 = value;
	}
	
	public java.lang.String getField6() {
		return this.field6;
	}
	
	public void setField6(java.lang.String value) {
		this.field6 = value;
	}
	
	public java.lang.String getField7() {
		return this.field7;
	}
	
	public void setField7(java.lang.String value) {
		this.field7 = value;
	}
	
	public java.lang.String getField8() {
		return this.field8;
	}
	
	public void setField8(java.lang.String value) {
		this.field8 = value;
	}
	
	public java.lang.String getField9() {
		return this.field9;
	}
	
	public void setField9(java.lang.String value) {
		this.field9 = value;
	}
	
	public java.lang.String getField10() {
		return this.field10;
	}
	
	public void setField10(java.lang.String value) {
		this.field10 = value;
	}
	
	public String getSortColumns(){
		return (getSortColumns(orderField,orderDirection) == null?
				getSortColumns(orderColumnsMap):getSortColumns(orderField,orderDirection));
	}

	static public String getSortColumns(String orderField,String orderDirection){
		if(StringUtils.isNotBlank(orderField)){
			StringBuffer orderColumns = new StringBuffer();
			if(orderField.equals("goodId")){
				orderColumns.append("good_id");
			}
			if(orderField.equals("goodName")){
				orderColumns.append("good_name");
			}
			if(orderField.equals("unit")){
				orderColumns.append("unit");
			}
			if(orderField.equals("price")){
				orderColumns.append("price");
			}
			if(orderField.equals("salePrice")){
				orderColumns.append("sale_price");
			}
			if(orderField.equals("typeId")){
				orderColumns.append("type_id");
			}
			if(orderField.equals("remark")){
				orderColumns.append("remark");
			}
			if(orderField.equals("goodInfo")){
				orderColumns.append("good_info");
			}
			if(orderField.equals("imageAddress")){
				orderColumns.append("image_address");
			}
			if(orderField.equals("status")){
				orderColumns.append("status");
			}
			if(orderField.equals("createtime")){
				orderColumns.append("createtime");
			}
			if(orderField.equals("field1")){
				orderColumns.append("field1");
			}
			if(orderField.equals("field2")){
				orderColumns.append("field2");
			}
			if(orderField.equals("field3")){
				orderColumns.append("field3");
			}
			if(orderField.equals("field4")){
				orderColumns.append("field4");
			}
			if(orderField.equals("field5")){
				orderColumns.append("field5");
			}
			if(orderField.equals("field6")){
				orderColumns.append("field6");
			}
			if(orderField.equals("field7")){
				orderColumns.append("field7");
			}
			if(orderField.equals("field8")){
				orderColumns.append("field8");
			}
			if(orderField.equals("field9")){
				orderColumns.append("field9");
			}
			if(orderField.equals("field10")){
				orderColumns.append("field10");
			}
			if(StringUtils.isNotBlank(orderColumns.toString())){
				if(StringUtils.isNotBlank(orderDirection))
					orderColumns.append(" " + orderDirection);
				return orderColumns.toString();
			}
		}
		return null;
	}
	
	static public String getSortColumns(Map<String,String> orderColumnsMap){
		if(orderColumnsMap != null){
			StringBuffer orderColumnsStr = new StringBuffer();
			Set<String> orderColumnsNames = orderColumnsMap.keySet();
			int length = orderColumnsNames.size();
			int i = 0;
			
			for (String name : orderColumnsNames) {
				orderColumnsStr.append(getSortColumns(name,orderColumnsMap.get(name)));
				if(i<length-1){
					orderColumnsStr.append(",");
				}
				i++;
			}
			return orderColumnsStr.toString();
		}	
		return null;
	}
	public String getParamString(){
		StringBuffer str = new StringBuffer();
		if(goodId != null){
			str.append("&goodId=").append(goodId);
		}
		if(goodName != null){
			str.append("&goodName=").append(goodName);
		}
		if(unit != null){
			str.append("&unit=").append(unit);
		}
		if(price != null){
			str.append("&price=").append(price);
		}
		if(salePrice != null){
			str.append("&salePrice=").append(salePrice);
		}
		if(storage != null){
			str.append("&storage=").append(storage);
		}
		if(remark != null){
			str.append("&remark=").append(remark);
		}
		if(goodInfo != null){
			str.append("&goodInfo=").append(goodInfo);
		}
		if(imageAddress != null){
			str.append("&imageAddress=").append(imageAddress);
		}
		if(status != null){
			str.append("&status=").append(status);
		}
		if(createtimeBegin != null){
			str.append("&createtimeBegin=").append(createtimeBegin);
		}
		if(createtimeBegin != null){
			str.append("&createtimeEnd=").append(createtimeEnd);
		}
		if(field1 != null){
			str.append("&field1=").append(field1);
		}
		if(field2 != null){
			str.append("&field2=").append(field2);
		}
		if(field3 != null){
			str.append("&field3=").append(field3);
		}
		if(field4 != null){
			str.append("&field4=").append(field4);
		}
		if(field5 != null){
			str.append("&field5=").append(field5);
		}
		if(field6 != null){
			str.append("&field6=").append(field6);
		}
		if(field7 != null){
			str.append("&field7=").append(field7);
		}
		if(field8 != null){
			str.append("&field8=").append(field8);
		}
		if(field9 != null){
			str.append("&field9=").append(field9);
		}
		if(field10 != null){
			str.append("&field10=").append(field10);
		}
		if(StringUtils.isNotBlank(orderField)){
			str.append("&orderField=").append(orderField);
		}
		if(StringUtils.isNotBlank(orderDirection)){
			str.append("&orderDirection=").append(orderDirection);
		}
		str.append("&pageNum=").append(getPageNum());
		str.append("&numPerPage=").append(getNumPerPage());
		return str.toString();
	}
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

