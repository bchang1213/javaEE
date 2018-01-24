package com.brianchang.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.brianchang.web.models.Roster;
import com.brianchang.web.models.Team;

/**
 * Servlet implementation class create
 */
@WebServlet("/create")
public class create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public create() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Create session
		HttpSession session = request.getSession();
		//If roster already exists, great. If not, create a new roster.
		Roster newRoster = (Roster) session.getAttribute("roster");
		
		if(newRoster == null) {
			newRoster = new Roster();
			session.setAttribute("roster", newRoster);
		}
		
		//Create a new team, based on the user input
		Team newTeam = new Team();
		String newname = request.getParameter("name");
		newTeam.setTeam_name(newname);
		
		//Add said team to the roster.
		newRoster.addtoRoster(newTeam);

		//Redirect
		response.sendRedirect("home");
	}

}
