package com.cts.webdevelopment;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class WebRegister extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		PrintWriter out=resp.getWriter();
		int id= Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		  String date=req.getParameter("date");
		out.println("Employee id" + id +"<br>employee name" + name + "<br>Date" +  date + "<br>");
		LocalDate d=LocalDate.now();
		LocalDate d1=LocalDate.parse(date);
		Period p=Period.between(d1,d);
		out.println("your age is <br> " +  p  +  "<br>");
		String p1=p.toString();
		out.println(p1);
		String age=Long.toString(p.getYears()) + "years" + Long.toString(p.getMonths())+ "months" + Long.toString(p.getDays())+ "days";
		Connection con=DButil.getConnection();
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into enter1 values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDate(3, java.sql.Date.valueOf(date));
			ps.setString(4, age);
			//ps.setTimestamp(3,Timestamp.valueOf(date));
			int update=ps.executeUpdate();
			if(update>0) {
				out.println("Record saved sucessfully");
			}else {
				out.println("Try Again");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
