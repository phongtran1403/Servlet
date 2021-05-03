package com.myPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.digester.DocumentProperties.Charset;

@WebServlet(urlPatterns = "/page1")
public class Main extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Main() {
		super();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset = UTF-8");

		PrintWriter out = resp.getWriter();
		
		//out.println("Phongggggggggggg Nè \n");

		List<Model> list = Service.ExportModel();

		out.println("<head>");
		out.println("<little> Kết quả</little>");
		out.println("</head>");
		out.println("<body>");
		out.println("<table border = '1'>");
		out.println("<tr>");
		for (Model md : list) {
			out.println("<td>" + md.getName1() + "</td>");
		}
		out.println("</tr>");
		out.println("<tr>");
		for (Model md : list) {
			out.println("<td>" + md.getName2() + "</td>");
		}
		out.println("</tr>");

		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
}
