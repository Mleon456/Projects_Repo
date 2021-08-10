package example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import example.model.Reimbursement;
import example.service.ReimbursementService;
import example.service.ReimbursementServiceImpl;

public class UpdateReimbursementController2 {
	
	public static void allFinder(HttpServletRequest req, HttpServletResponse res)
			throws IOException, JsonProcessingException {
		
		/*
		 * THIS IS WHERE YOU'D GO TO THE DATABASE TO GET THE OBJECTS TO SEND TO THE CLIENT
		 */
		
		HttpSession session =  req.getSession();
		String name =  (String)(session.getAttribute("loggedInUsername"));

		System.out.println("This is my username: " + name);
		
		ReimbursementService myServ = new ReimbursementServiceImpl();
		List<Reimbursement> myReimbList = myServ.selectAllReimbursements();
		System.out.println("here is the list: " + myReimbList);
		
		/*
		 * 
		 */
		
		PrintWriter printer = res.getWriter();
		printer.write(new ObjectMapper().writeValueAsString(myReimbList));
		
		int reimbursementID = Integer.parseInt(req.getParameter("reimbursementID"));
		int type = Integer.parseInt(req.getParameter("Type"));
		
		System.out.println("This is my reimbursementID: " + reimbursementID);
		System.out.println("This is my reimbursement type: " + type);

		myServ.updateReimbursement(new Reimbursement(reimbursementID, type));
	}

}
