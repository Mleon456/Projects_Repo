package example.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import example.model.Users;
import example.service.UsersService;
import example.service.UsersServiceImpl;

public class LoginController {

	public static void login(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String myPath = null;

		/*
		 * rout guarding:
		 * 
		 * you may do stuff like:
		 * "check if the user has an admin token in their session" OR
		 * "check if they are using the correct http method" OR something to that
		 * effect.
		 */
		if (!req.getMethod().equals("POST")) {
			myPath = "/index.html";
			req.getRequestDispatcher(myPath).forward(req, res);
			return;
		}

		UsersService userServ = new UsersServiceImpl();

		// extracting the form data
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		int userId = userServ.findUserId(new Users(username));

		System.out.println("hey heres my user id: " + userId);

		// check to see if the user has the correct username & password
		// you'll actually go to the database to get the user's username and password
		if (!(userServ.findUser(new Users(username, password)) == true)) {
			myPath = "/forwarding/incorrectcredentials";
			req.getRequestDispatcher(myPath).forward(req, res);
			return;
		} else {
			/*
			 * you probably will have a user object that you put into the session that
			 * contains the username & password and some other information....THIS is just
			 * an example
			 */
			req.getSession().setAttribute("loggedInUserId", userId);
			req.getSession().setAttribute("loggedInPassword", password);
			req.getSession().setAttribute("loggedInUsername", username);

			int user_role = userServ.findUserRole(new Users(username));

			System.out.println(user_role);
			
			if (user_role == 2) {
				myPath = "/forwarding/ReimbursementHome";
				req.getRequestDispatcher(myPath).forward(req, res);
				return;
			} else {

				myPath = "/forwarding/home";
				req.getRequestDispatcher(myPath).forward(req, res);
				return;
			}
		}

	}

}
