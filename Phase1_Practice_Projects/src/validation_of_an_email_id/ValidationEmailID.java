package validation_of_an_email_id;

import java.util.regex.*;
import java.util.*;

public class ValidationEmailID {

	public static void main(String[] args) {	  
		
		ArrayList<String> emailId = new ArrayList<String>();
		emailId.add("souvikganguli0088@gmail.com");
		emailId.add("Shivamkumar022@gmail.com");
		emailId.add("kamal44@gmail.com");
		emailId.add("Arjun.kumar@gmail.com");
		emailId.add("lallit$88@gmail.com");
		
		emailId.add("@faruk88gmail.com");
		emailId.add("shruti.9.com");
		
		String regex = "^(.+)@(.+)$";   
        Pattern pattern = Pattern.compile(regex);  
        
        
        for(String mail : emailId){  
        	Matcher matcher = pattern.matcher(mail);
        	
        	if(matcher.matches()) {
        		System.out.println(mail+"- Valid");
        }else {
        	System.out.println(mail+"- Unvalid");
        }
             
        }  

	}

	
	}

	


