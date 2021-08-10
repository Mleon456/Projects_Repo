package example.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReimbursementHomeController {

	public static void home(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		String myPath = "/resources/html/UpdateReimbursement.html";
		
		req.getRequestDispatcher(myPath).forward(req, res);
	}
}
