package com.brianchang.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.brianchang.web.models.RandomNumber;

/**
 * Servlet implementation class guess
 */
@WebServlet("/guess")
public class guess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public guess() {
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
		//Create a session
		HttpSession session = request.getSession();
		
		//Assign num to session
		Integer randnum = (Integer) session.getAttribute("randnum");
				
		//Take user's guessed number
		Integer guessedNumber = Integer.parseInt(request.getParameter("guessnumber"));
				
		//Set the user's number to session
		session.setAttribute("usernum", guessedNumber);
				
		//Evaluate if it is a correct guess
		System.out.println("This is the computer's number: " + randnum);
		System.out.println("This is your guess: " + guessedNumber);
		if(randnum == guessedNumber) {
			System.out.println("You guessed correctly");
		}
				
		// redirect
		response.sendRedirect("home");
	}

}
