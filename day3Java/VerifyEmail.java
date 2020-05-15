package day3Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyEmail {

	public static void main(String[] args) {

		String s1="naveen e@tl.com";
		 Pattern pattern;
		 Matcher matcher;

		 String EMAIL_PATTERN ="[a-zA-Z0-9._]+@[a-z0-9]+.[a-z.]{2,}";
			

			pattern = Pattern.compile(EMAIL_PATTERN);
		

			matcher = pattern.matcher(s1);
			 boolean b = matcher.matches();

		System.out.println(b);

		}
	}


