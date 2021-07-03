package com.jp.ht.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;


public class ExcelOut {
	
	
	/**
     * 得到Excel表中的值
     * 
     * @param hssfCell
     *            Excel中的每一个格子
     * @return Excel中每一个格子中的值
     */
	private String getValue(HSSFCell hssfCell) {
		
        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
            // 返回布尔类型的值
            return String.valueOf(hssfCell.getBooleanCellValue());
        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
            // 返回数值类型的值
            return String.valueOf(hssfCell.getNumericCellValue());
        } else {
            // 返回字符串类型的值
            return String.valueOf(hssfCell.getStringCellValue());
        }
    }
	/**
     * 设置单元格的格式
     */
    /**
     * @param wb
     * @return
     */
    public static Map<String, CellStyle> createStyles(Workbook wb){
        Map<String, CellStyle> styles = new HashMap<String, CellStyle>();

        short borderColor = IndexedColors.GREY_50_PERCENT.getIndex();
             
      //正文title样式
        CellStyle style;
        style = wb.createCellStyle();
        // 居中
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        //边框
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style.setFillForegroundColor(HSSFColor.LIGHT_GREEN.index);
        //设置字体
        Font titleFont = wb.createFont();
        titleFont.setFontName("宋体");
        titleFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
        //设置字体大小
        titleFont.setFontHeightInPoints((short)10);
        //设置颜色
        titleFont.setColor(IndexedColors.AUTOMATIC.getIndex());
        //设置样式的字体
        style.setFont(titleFont);
        styles.put("title", style);
            
        //标题行样式
        CellStyle styleName;
        styleName = wb.createCellStyle();
        styleName.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        styleName.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        styleName.setBorderTop(HSSFCellStyle.BORDER_THIN);
        styleName.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        styleName.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        styleName.setBorderRight(HSSFCellStyle.BORDER_THIN);
        Font nameFont = wb.createFont();
        nameFont.setFontName("宋体");
        nameFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
        nameFont.setFontHeightInPoints((short)10);
        nameFont.setColor(IndexedColors.AUTOMATIC.getIndex());
        styleName.setFont(nameFont);
        styles.put("name", styleName);
        
        //标题行动态数据样式
        CellStyle styleData;
        styleData = wb.createCellStyle();
        styleData.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        styleData.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        styleData.setBorderTop(HSSFCellStyle.BORDER_THIN);
        styleData.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        styleData.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        styleData.setBorderRight(HSSFCellStyle.BORDER_THIN);
        Font dataFont = wb.createFont();
        dataFont.setFontName("宋体");
        dataFont.setFontHeightInPoints((short)10);
        dataFont.setColor(IndexedColors.AUTOMATIC.getIndex());
        styleData.setFont(dataFont);
        styleData.setWrapText(true);
        styles.put("data", styleData);
        
        //单元格样式
        CellStyle styleCell;
        styleCell = wb.createCellStyle();
        styleCell.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        styleCell.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        styleCell.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        styleCell.setBorderRight(HSSFCellStyle.BORDER_THIN);
        styleCell.setBorderTop(HSSFCellStyle.BORDER_THIN);
        styleCell.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        Font cellFont = wb.createFont();
        cellFont.setFontName("宋体");
        cellFont.setFontHeightInPoints((short)8);
        cellFont.setColor(IndexedColors.AUTOMATIC.getIndex());
        styleCell.setFont(dataFont);
        styleCell.setWrapText(true);
        styles.put("cell", styleCell);
        
        return styles;
    }

    
   /* public static void tradeExportExcel(List<Tpurchase> list, String string,
			String fileName, HttpServletResponse response) throws IOException {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("采购单信息");
		HSSFRow row = sheet.createRow((int) 0);
		Map<String, CellStyle> styles =createStyles(wb); 
		HSSFCell cell = row.createCell(0);
		cell.setCellValue("创建日期");
		cell.setCellStyle(styles.get("title"));
		cell = row.createCell(1);
		cell.setCellValue("入库日期");
		cell.setCellStyle(styles.get("title"));
		cell = row.createCell(2);
		cell.setCellValue("药品名称");
		cell.setCellStyle(styles.get("title"));
		cell = row.createCell(3);
		cell.setCellValue("申请数量");
		cell.setCellStyle(styles.get("title"));
		cell = row.createCell(4);
		cell.setCellValue("实际数量");
		cell.setCellStyle(styles.get("title"));
		cell = row.createCell(5);
		cell.setCellValue("采购单位");
		cell.setCellStyle(styles.get("title"));
	
		
		for (int i=0;i<list.size();i++) {
			row = sheet.createRow( i + 2);
			Tpurchase tpurchase =list.get(i);
			cell=row.createCell(0);
			cell.setCellValue(tpurchase.getCreateDateString()); 
			cell.setCellStyle(styles.get("cell"));
			cell=row.createCell(1);
			cell.setCellValue(tpurchase.getArrivalDateString()); 
			cell.setCellStyle(styles.get("cell"));
			cell=row.createCell(2);
			cell.setCellValue(tpurchase.getDrugName()); 
			cell.setCellStyle(styles.get("cell")); 
			cell=row.createCell(3);
			cell.setCellValue(tpurchase.getRequestAmount()); 
			cell.setCellStyle(styles.get("cell"));
			cell=row.createCell(4);
			cell.setCellValue(tpurchase.getRealAmount()); 
			cell.setCellStyle(styles.get("cell"));
			cell=row.createCell(5);
			cell.setCellValue(tpurchase.getField1()); 
			cell.setCellStyle(styles.get("cell"));

		}

		OutputStream out = response.getOutputStream();
		response.setContentType("application/vnd.ms-excel;charset=utf-8");
	    response.setHeader("Content-disposition", "attachment;filename=" + URLEncoder.encode(fileName, "utf-8"));
		wb.write(out);
		out.flush();
		out.close();
		
	}*/
	
}

