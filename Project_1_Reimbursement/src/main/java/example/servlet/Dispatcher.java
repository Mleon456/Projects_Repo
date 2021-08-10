package example.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;

import example.controller.AddReimbursementController;
//import example.controller.AppleController;
import example.controller.HomeController;
import example.controller.LoginController;
import example.controller.ReimbursementController;
import example.controller.ReimbursementHomeController;
import example.controller.UpdateReimbursementController;
import example.controller.UpdateReimbursementController2;
//import example.controller.PepperController;

public class Dispatcher {

	public static void myVirtualRouter(HttpServletRequest req, HttpServletResponse res)
			throws JsonProcessingException, IOException, ServletException {
		
		System.out.println("\n\n\t\tIn MyDispatcher (myVirtualRouter())");
		System.out.println("Current URL: "+ req.getRequestURL());
		System.out.println("Current URI: "+ req.getRequestURI());
//		"/Project_1_Reimbursement/forwarding/addReimbursement"
		
		
		switch(req.getRequestURI()) {
		case "/Project_1_Reimbursement/forwarding/login":
			System.out.println("case 1");
			LoginController.login(req, res);
			break;
		case "/Project_1_Reimbursement/forwarding/home":
			System.out.println("case 2");
			HomeController.home(req, res);
			break;
		case "/Project_1_Reimbursement/json/allReimbs":
			System.out.println("case 3");
			ReimbursementController.allFinder(req, res);
			break;
		case "/Project_1_Reimbursement/forwarding/addReimbursement":
			System.out.println("case 4");
			AddReimbursementController.addReimbursement(req, res);
			break;
		case "/Project_1_Reimbursement/json/updateReimbursement":
			System.out.println("case 5");
			UpdateReimbursementController.allFinder(req, res);
			break;
		case "/Project_1_Reimbursement/forwarding/ReimbursementHome":
			System.out.println("case 6");
			ReimbursementHomeController.home(req, res);
			break;
		case "/Project_1_Reimbursement/forwarding/updateReimbursement2":
			System.out.println("case 7");
			UpdateReimbursementController2.allFinder(req, res);
			break;
		case "/Project_1_Reimbursement/json/getCurrentUserObject":
			//for project 1 you'll need an endpoint that will simply fetch the user's information from their session
			/*
			 * NOW....after you login the servlet will respond with the html page that you need....
			 * THEN....that html page will IMMEDIATELY FIRE ANOTHER AJAX REQUEST to retrieve that user's session
			 * data so that you can dom manipulation it into the html home page so you can say
			 * "hello [username]". The page is now modularized.
			 */
			break;
		default:
			System.out.println("Dude, you gave me a bad URI.");
			req.getRequestDispatcher("/resources/html/badlogin.html").forward(req, res);
			return;
			
		}
	}
}
