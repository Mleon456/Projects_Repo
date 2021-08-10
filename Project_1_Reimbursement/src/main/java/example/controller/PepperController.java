package example.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PepperController {
	
	public static void pepperFinder(HttpServletRequest req, HttpServletResponse res)
			throws IOException, JsonProcessingException {
		
		/*
		 * THIS IS WHERE YOU'D GO TO THE DATABASE TO GET THE OBJECTS TO SEND TO THE CLIENT
		 */
		
//		SuperVillain pepper = new SuperVillain("Pepper Jupiter", "Drowsy Fist", 120_000);
		
		PrintWriter printer = res.getWriter();
//		printer.write(new ObjectMapper().writeValueAsString(pepper));
	}
}
