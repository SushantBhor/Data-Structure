//package pages;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.time.LocalDate;
//import java.time.Period;
//
//import javax.servlet.ServletConfig;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import Dao.Playerdaoimpl;
//import Dao.TeamDaoImpl;
//import pojo.IplPlayer;
//import pojo.Teams;
//
//@WebServlet("/CSK")
//public class CSKServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//	public void init(ServletConfig config) throws ServletException {
//		
//	}
//	public void destroy() {
//		
//	}
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try (PrintWriter pw =response.getWriter()){
//			HttpSession hs=request.getSession();
//			IplPlayer player=(IplPlayer)hs.getAttribute("Player");
//			TeamDaoImpl Tdao=(TeamDaoImpl)hs.getAttribute("Teamdao");
//			Teams T=Tdao.GetTeamInfo(player);
//			LocalDate d=player.getDob().toLocalDate();
//			LocalDate d1=LocalDate.now();
//			int age=Period.between(d, d1).getYears();
//			if(age>=T.getMax_age()||player.getBatting_avg()>T.getBatting_avg()||player.getWickets_taken()>=T.getBatting_avg())
//			{
//				//if(pdao.InsertPlayer(player))
//				{
//					pw.print("<h1 align='center'><b> Welcome "+player.getPlayer_Name()+" YOU SELECTED IN  CSK </b></h1>");
//				}
//				//else
//				{
//					pw.print("<h1 align='center'>INSERT ERROR</h1>");
//				}
//			}else
//			{
//				pw.print("<h1 align='center'>SORRY NO VACANCY AVAILABLE IN CSK</h1>");
//			}
//		} catch (Exception e) {
//			throw new ServletException(" ERROR ",e);
//		}
//	}
//
//}
