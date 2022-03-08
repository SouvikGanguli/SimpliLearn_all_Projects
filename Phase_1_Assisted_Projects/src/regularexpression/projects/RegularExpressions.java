package regularexpression.projects;

import java.util.regex.*;

public class RegularExpressions {

	public static void main(String[] args) {
		String regexstr  = ".[0-9][a-z].";
		Pattern pattern = Pattern.compile(regexstr);
		Matcher matcher = pattern.matcher("123536371iskdkfnk");
		boolean matchfound = matcher.find();
		if(matchfound) {
			System.out.println("Match Found");
		}else {
			System.out.println("Match not Found");
		}
		

	}

}
