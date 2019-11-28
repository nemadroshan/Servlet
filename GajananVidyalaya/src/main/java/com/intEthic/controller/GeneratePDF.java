package com.intEthic.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.intEthic.dto.StudentDTO;
import com.intEthic.service.StudentService;
import com.intEthic.service.StudentServiceImpl;
import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;



/**
 * Servlet implementation class GeneratePDF
 */
@WebServlet("/StudentPDF")
public class GeneratePDF extends HttpServlet {
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    StudentService service  = new StudentServiceImpl();
		    List<StudentDTO> allStudent = null;
		    int sr =0;
			ServletOutputStream os = response.getOutputStream();
			  //set the response content type to PDF
			  response.setContentType("application/pdf"); 
			  //create a new document
			  Document doc = new Document();
			 
			  //create some special styles and font sizes
	
			  
			  try {
				PdfWriter instance = PdfWriter.getInstance(doc, os);
				//document header
				doc.addAuthor("Roshan");
				doc.addCreationDate();
				doc.addProducer();
				doc.addCreator("TechNrn.com");
				doc.addTitle("DemoPdf");
				doc.setPageSize(PageSize.A4);
				doc.open();
				
				//add a new paragraph
				Paragraph p = new Paragraph("Student List");
				p.setAlignment("center");
				doc.add(p);
				Paragraph p1 = new Paragraph();
				doc.add(p1);
				allStudent = service.getAllStudent();
				Table table = new Table(10, 1);
				table.setConvert2pdfptable(true);
				table.setSpaceInsideCell(30);
				Cell cell = new Cell("Physics");
				cell.setWidth(40);
				table.addCell("sr No");table.addCell("name");table.addCell("Fname");table.addCell(cell);table.addCell("physics");table.addCell("Chemistry");table.addCell("English");table.addCell("Biology");table.addCell("out of");table.addCell("Percentage ");
				for(StudentDTO dto : allStudent) {
					
					table.setOffset(2);
					table.setPadding(3);
					table.addCell(String.valueOf(++sr));
					table.addCell(dto.getName());table.addCell(dto.getFname());
					table.addCell(String.valueOf(dto.getRollNum()));
					table.addCell(String.valueOf(dto.getPhysics_marks()));
					table.addCell(String.valueOf(dto.getChemistry_mark()));
					table.addCell(String.valueOf(dto.getEnglish_marks()));
					table.addCell(String.valueOf(dto.getBio_marks()));
					table.addCell(String.valueOf(dto.getOutOf()));
					table.addCell(String.valueOf(dto.getPercentage()));
				}
				doc.add(table);
				doc.close();
			}
			  catch (DocumentException de) {
				// TODO Auto-generated catch block
				de.printStackTrace();
			}
			  catch (Exception e) {
					e.printStackTrace();
				}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
