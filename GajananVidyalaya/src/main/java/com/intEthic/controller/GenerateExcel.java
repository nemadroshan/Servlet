package com.intEthic.controller;
import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.intEthic.dto.StudentDTO;
import com.intEthic.service.StudentService;
import com.intEthic.service.StudentServiceImpl;




/**
 * Servlet implementation class GeneratePDF
 */
@WebServlet("/StudentExcelSheet")
public class GenerateExcel extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService service = new StudentServiceImpl();
		List<StudentDTO> allStudent = null;
		int sr = 1;
		int rowNum = 0;
		int cellNUm = 0;
		Workbook workbook = null;
		// set the response content type to PDF
		response.setContentType("application/vnd.ms-excel");
		// create a new document
		try {
			allStudent = service.getAllStudent();

			workbook = new HSSFWorkbook();
			// get the number of sheet in the xlxs file
			Sheet sheet = workbook.createSheet("report");
			Row row = sheet.createRow(rowNum);
			Cell cell = row.createCell(cellNUm++);
			cell.setCellValue("Name");

			cell = row.createCell(cellNUm++);
			cell.setCellValue("Fathers Name");

			cell = row.createCell(cellNUm++);
			cell.setCellValue("Roll Num");

			cell = row.createCell(cellNUm++);
			cell.setCellValue("Physics");

			cell = row.createCell(cellNUm++);
			cell.setCellValue("Chemistry");

			cell = row.createCell(cellNUm++);
			cell.setCellValue("Biology");

			cell = row.createCell(cellNUm++);
			cell.setCellValue("English");

			cell = row.createCell(cellNUm++);
			cell.setCellValue("outOF");

			cell = row.createCell(cellNUm++);
			cell.setCellValue("Percentage");

			for (StudentDTO dto : allStudent) {
				int rowCount = 1;
				cellNUm = 0;
				Row row1 = sheet.createRow(rowNum++);
				cell = row.createCell(cellNUm++);
				cell.setCellValue(rowCount);

				cell = row.createCell(cellNUm++);
				cell.setCellValue(dto.getName());

				cell = row.createCell(cellNUm++);
				cell.setCellValue(dto.getFname());

				cell = row.createCell(cellNUm++);
				cell.setCellValue(String.valueOf(dto.getRollNum()));

				cell = row.createCell(cellNUm++);
				cell.setCellValue(String.valueOf(dto.getPhysics_marks()));
				cell = row.createCell(cellNUm++);
				cell.setCellValue(String.valueOf(dto.getChemistry_mark()));
				cell = row.createCell(cellNUm++);
				cell.setCellValue(String.valueOf(dto.getBio_marks()));
				cell = row.createCell(cellNUm++);
				cell.setCellValue(String.valueOf(dto.getEnglish_marks()));
				cell = row.createCell(cellNUm++);
				cell.setCellValue(String.valueOf(dto.getOutOf()));
				cell = row.createCell(cellNUm++);
				cell.setCellValue(String.valueOf(dto.getPercentage()));
				cell = row.createCell(cellNUm++);
				
				workbook.write(response.getOutputStream());
				return;
			}
			
			// let write to file

			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
