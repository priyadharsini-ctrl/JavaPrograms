package day3Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyUsername {

	public static void main(String[] args) {

		String s1="Testleaf$123";
		Pattern pattern;
		Matcher matcher;
		
		String userNamePattern="[A-Za-z0-9._$@]{8}";
		 pattern = Pattern.compile(userNamePattern);
		  matcher = pattern.matcher(s1);
		  boolean b = matcher.matches();
		  System.out.println(b);
	}

}
