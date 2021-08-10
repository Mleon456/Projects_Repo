package example.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import example.model.Reimbursement;
import example.service.ReimbursementService;
import example.service.ReimbursementServiceImpl;

public class AddReimbursementController {

	public static void addReimbursement(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

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
			myPath = "/resources/html/AddReimbursement.html";
			req.getRequestDispatcher(myPath).forward(req, res);
			return;
		}
		
		HttpSession session =  req.getSession();
		int name =  (int)(session.getAttribute("loggedInUserId"));
		System.out.println("This is my user_id" + name);
		

		// extracting the form data
		String description = req.getParameter("description");
		int amount = Integer.parseInt(req.getParameter("amount"));
		int type = Integer.parseInt(req.getParameter("Type"));

		System.out.println(description);
		System.out.println(amount);
		System.out.println(type);
		
		ReimbursementService reimbServ = new ReimbursementServiceImpl();
		reimbServ.addReimbursement(new Reimbursement(amount, description, name, type));
		
		System.out.println(reimbServ.addReimbursement(new Reimbursement(amount, description, name, type)));

			
		myPath = "/forwarding/home";
		req.getRequestDispatcher(myPath).forward(req, res);
		return;
	}

}
