package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.Playerdaoimpl;
import Dao.TeamDaoImpl;
import pojo.IplPlayer;
import pojo.Teams;

@WebServlet("/Check")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Playerdaoimpl Pdao;
	private IplPlayer Player;
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		int team = Integer.parseInt(request.getParameter("team"));
		System.out.println(team);
		String fname = request.getParameter("fname");
		String lname = request.getParameter("Lname");
		Date dob = Date.valueOf(request.getParameter("dob"));
		double Batavg = Double.parseDouble(request.getParameter("avg"));
		int wicket = Integer.parseInt(request.getParameter("wicket"));
//		int player_id, String first_Name, String last_Name, Date dob, double batting_avg,
//		int wickets_taken, int team
		IplPlayer Player = new IplPlayer(0, fname, lname, dob, Batavg, wicket, team);
//		HttpSession hs = request.getSession();
//		hs.setAttribute("Player", Player);
//		hs.setAttribute("playerdao", Pdao);
//		hs.setAttribute("Teamdao", Tdao);
		try (PrintWriter pw=response.getWriter()){
			Teams T = Tdao.GetTeamInfo(Player);
			LocalDate d=Player.getDob().toLocalDate();
			LocalDate d1=LocalDate.now();
			int age=Period.between(d, d1).getYears();
			if(age>=T.getMax_age()&&Player.getBatting_avg()>T.getBatting_avg()&&Player.getWickets_taken()>=T.getBatting_avg())
			{
				if(Pdao.InsertPlayer(Player))
				{
					pw.print("<h1 align='center'><b> Welcome "+Player.getFirst_Name()+" "+Player.getLast_Name()+" YOU SELECTED </b></h1>");
				}else
				{
					pw.print("<h1 align='center'>INSERT ERROR</h1>");
				}
			}else
			{
				pw.print("<h1 align='center'>SORRY NO VACANCY AVAILABLE</h1>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
