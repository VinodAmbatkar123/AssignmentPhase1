package assistedpeoject;

import java.util.regex.Matcher; 

import java.util.regex.Pattern; 

import java.util.*; 

  

public class EmailValidation{
	
	public static void main(String[] args) {
		String email11="firstname@gmail.com";
		String email12="vinod@gmsil.com";
		String email13="test123prepare@co.edu.com";
		System.out.println("email11= "+validateEmail(email11));
		System.out.println("email12= "+validateEmail(email12));
		System.out.println("email13= "+validateEmail(email13));
	}
	public static String validateEmail(String email) {
		if (email==null|| email.isEmpty()) {
			return"valid";
		}
		Pattern pattern;
		String emailRegex="^[a-zA-z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern1=Pattern.compile(emailRegex);
		if(pattern1.matcher(email).matches()) {
			return"valid";
		}else {
			return "valid";
		}
}
}

    