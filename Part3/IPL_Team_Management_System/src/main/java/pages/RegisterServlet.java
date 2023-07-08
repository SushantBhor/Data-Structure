package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Playerdaoimpl;
import Dao.TeamDaoImpl;
import pojo.IplPlayer;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Playerdaoimpl Pdao;
	private TeamDaoImpl Tdao;

	public void init(ServletConfig config) throws ServletException {
		try {
			Pdao = new Playerdaoimpl();
			Tdao = new TeamDaoImpl();
		} catch (Exception e) {
			throw new ServletException("Connection error ", e);
		}
	}

	public void destroy() {
		try {
			Pdao.closeconnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try (PrintWriter pw = response.getWriter()) {
			pw.print("<!DOCTYPE html>\r\n<html>\r\n<head>\r\n<meta charset=\"ISO-8859-1\">\r\n<title>Insert title here</title>\r\n <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\r\n</head>\r\n<h1 align='center'>IPL TEAM REGISTRATION FORM</h1><br>\r\n<form action=\"Check\" method='post'>\r\n<select class=\"custom-select custom-select-lg mb-3\" name=\"team\"><option selected><b>Select The Team</b></option>");
			try {
				for(Map.Entry<Integer, String> m:Tdao.GetTeamDetails().entrySet())
				{
					pw.print(" <option value='"+m.getKey()+"'>"+m.getValue()+"</option>");
					}
				pw.print("\r\n"
						+ "</select><div class=\"form-row\"><div class=\"form-group col-md-6\"><label for=\"fname\">FNAME</label><input type=\"text\" class=\"form-control\" name=\"fname\" id=\"fname\"</div></div><div class=\"form-group\"><label for=\"Lname\">LNAME</label><input type=\"text\" class=\"form-control\" id=\"Lname\" name=\"Lname\"></div><br><div><div class=\\\"form-group col-md-6\\\"><label for=\\\"dob\\\">Date Of Birth</label><input type='date'class=\\\"form-control\\\" name='dob' id='dob'></div></div><br><div class=\"form-row\"><div class=\"form-group col-md-6\"><label for=\"avg\">Batting Average</label><input type=\"text\" class=\"form-control\" name=\"avg\" id=\"avg\"></div><div class=\"form-group\"><label for=\"wicket\">Wickets Taken</label><input type=\"text\" class=\"form-control\" id=\"wicket\" name=\"wicket\"></div><br><div><button type=\"submit\" class=\"btn btn-primary\">Register</button>&nbsp;&nbsp<button type=\"reset\" class=\"btn btn-primary\">Cancel</button></form></div></html>");
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

}
