/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2017
 */

package com.jp.ht.query;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.jp.ht.vo.Torder;

import cn.org.rapid_framework.util.DateConvertUtils;
import common.dwz.DwzPageQuery;
import common.util.DateFormats;


public class TorderQuery extends DwzPageQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    
  //date formats
	public static final String FORMAT_FTIME =DateFormats.DATE_FORMAT;
    

	/** orderId */
	private java.lang.Integer orderId;
	/** 会员id */
	private java.lang.Integer customerId;
	/** 会员姓名 */
	private java.lang.String customerName;
	/** 总费用 */
	private java.lang.Double totalFee;
	/** 消费�?容 */
	private java.lang.String content;
	/** 下单日�? */
	private java.util.Date createTimeBegin;
	private java.util.Date createTimeEnd;
	/** field1 */
	private java.lang.String field1;
	/** field2 */
	private java.lang.String field2;
	/** field3 */
	private java.lang.String field3;
	
	private java.lang.String field4;


	public java.lang.Integer getOrderId() {
		return this.orderId;
	}
	
	public void setOrderId(java.lang.Integer value) {
		this.orderId = value;
	}
	
	public java.lang.Integer getCustomerId() {
		return this.customerId;
	}
	
	public void setCustomerId(java.lang.Integer value) {
		this.customerId = value;
	}
	
	public java.lang.String getCustomerName() {
		return this.customerName;
	}
	
	public void setCustomerName(java.lang.String value) {
		this.customerName = value;
	}
	
	public java.lang.Double getTotalFee() {
		return this.totalFee;
	}
	
	public void setTotalFee(java.lang.Double value) {
		this.totalFee = value;
	}
	
	public java.lang.String getContent() {
		return this.content;
	}
	
	public void setContent(java.lang.String value) {
		this.content = value;
	}
	
	public java.util.Date getCreateTimeBegin() {
		return this.createTimeBegin;
	}
	
	public String getCreateTimeBeginString() {
		return DateConvertUtils.format(getCreateTimeBegin(), Torder.FORMAT_CREATE_TIME);
	}
	
	public void setCreateTimeBegin(java.util.Date value) {
		this.createTimeBegin = value;
	}	
	
	public void setCreateTimeBeginString(String value) {
		setCreateTimeBegin(DateConvertUtils.parse(value, Torder.FORMAT_CREATE_TIME,java.util.Date.class));
	}
	
	public java.util.Date getCreateTimeEnd() {
		return this.createTimeEnd;
	}
	
	public String getCreateTimeEndString() {
		return DateConvertUtils.format(getCreateTimeEnd(), Torder.FORMAT_CREATE_TIME);
	}
	
	public void setCreateTimeEnd(java.util.Date value) {
		this.createTimeEnd = value;
	}
	public void setCreateTimeEndString(String value) {
		setCreateTimeEnd(DateConvertUtils.parse(value, Torder.FORMAT_CREATE_TIME,java.util.Date.class));
	}
	
	public java.lang.String getField1() {
		return this.field1;
	}
	
	public void setField1(java.lang.String value) {
		this.field1 = value;
	}
	
	
	
	public java.lang.String getField4() {
		return field4;
	}

	public void setField4(java.lang.String field4) {
		this.field4 = field4;
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
	
	public String getSortColumns(){
		return (getSortColumns(orderField,orderDirection) == null?
				getSortColumns(orderColumnsMap):getSortColumns(orderField,orderDirection));
	}

	static public String getSortColumns(String orderField,String orderDirection){
		if(StringUtils.isNotBlank(orderField)){
			StringBuffer orderColumns = new StringBuffer();
			if(orderField.equals("orderId")){
				orderColumns.append("order_id");
			}
			if(orderField.equals("customerId")){
				orderColumns.append("customer_id");
			}
			if(orderField.equals("customerName")){
				orderColumns.append("customer_name");
			}
			if(orderField.equals("totalFee")){
				orderColumns.append("total_fee");
			}
			if(orderField.equals("content")){
				orderColumns.append("content");
			}
			if(orderField.equals("createTime")){
				orderColumns.append("create_time");
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
		if(orderId != null){
			str.append("&orderId=").append(orderId);
		}
		if(customerId != null){
			str.append("&customerId=").append(customerId);
		}
		if(customerName != null){
			str.append("&customerName=").append(customerName);
		}
		if(totalFee != null){
			str.append("&totalFee=").append(totalFee);
		}
		if(content != null){
			str.append("&content=").append(content);
		}
		if(createTimeBegin != null){
			str.append("&createTimeBegin=").append(createTimeBegin);
		}
		if(createTimeBegin != null){
			str.append("&createTimeEnd=").append(createTimeEnd);
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

