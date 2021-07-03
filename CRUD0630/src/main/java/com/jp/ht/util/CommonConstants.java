package com.jp.ht.util;


import java.util.HashMap;
import java.util.Map;


public class CommonConstants {
	
	///////////////////////////////////////////////////////////////////////////////////////////////
	//                            文件上传的存放路径                                                      ///
	///////////////////////////////////////////////////////////////////////////////////////////////
	//LOCAL_FILE_STORAGE_PATH为本地存放图片的路径
	//tomcat的实际位置改变这个值
	private static final String LOCAL_FILE_STORAGE_PATH = "D:\\apache-tomcat-6.0.32\\webapps\\upload\\baodan";
	private static final String SERVER_FILE_STORAGE_PATH = "D:\\apache-tomcat-6.0.32\\webapps\\upload\\baodan";

	
	///////////////////////////////////////////////////////////////////////////////////////////////
	//                            文件访问的基础路径                                                      ///
	///////////////////////////////////////////////////////////////////////////////////////////////
	private static final String LOCAL_API_ACCESS = "http://localhost:8080";
	private static final String SERVER_API_ACCESS = "http://localhost:8080";
	private static final String FILE_ASK_PATH = getApiAccess() + "/upload/baodan/";
	
	 ///////////////////////////////// //////////////////////////////////////////////////////////////
    //                           环境   LOCAL代表本地,SERVER代表服务器   及获取随环境变化而改变的           ///
    ///////////////////////////////////////////////////////////////////////////////////////////////
	private static final String environment = "LOCAL";
	
	
	public static String getFileStoragePath(){
		if(environment.equals("LOCAL")) return LOCAL_FILE_STORAGE_PATH;
		else return SERVER_FILE_STORAGE_PATH;
	}
	
	public static String getFileAskPath() {
		return FILE_ASK_PATH;
	}
	
	public static String getApiAccess() {
		if(environment.equals("LOCAL")) return LOCAL_API_ACCESS;
		else return SERVER_API_ACCESS;
	}
	

}
