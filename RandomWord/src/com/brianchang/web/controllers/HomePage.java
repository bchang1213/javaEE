package com.brianchang.web.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.brianchang.web.models.RandomWord;

/**
 * Servlet implementation class HomePage
 */
@WebServlet("/HomePage")
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		//Create a variable that stores the random word of 10 letters, imported from a model, RandomWord.
		String randomtenletters = RandomWord.generateRandomWord(10);
	
		//Set the session "word" to the value of randomtenletters.
		session.setAttribute("word", randomtenletters);
		
		//Create a variable to count how many times a word is generated.
		//Set the integer to the attribute called sessioncount.
		Integer count = (Integer) session.getAttribute("sessioncount");
		//If the count has JUST been created, ie: the page is visted for the first time,
		//the count WILL be null.
		if(count == null) {
			session.setAttribute("sessioncount", 0); //thus, if the page is freshly visited and a new word has never been generated, set the count to 0.
		}
		else {
			Integer increasecount = (Integer) session.getAttribute("sessioncount");
			increasecount ++;
			session.setAttribute("sessioncount", increasecount); //sessioncount will be increased due to the variable increasecount every time that the button is clicked.
		}
		//Create Time stamp.
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		//Save it in a session for "timestamp".
		session.setAttribute("timestamp", timeStamp);
		
		//RENDERING THE VIEW FILE
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/HomePage.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
