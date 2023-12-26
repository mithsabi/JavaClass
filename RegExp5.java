package JavaPackage;
import java.util.regex.*;

public class RegExp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // meta characters
		// small d- means Digit
		// cap D- means not Digit
		System.out.println(Pattern.matches("\\d", "abc"));// false - not a digit
		System.out.println(Pattern.matches("\\d", "1"));// true - it is a digit
		System.out.println(Pattern.matches("\\d", "443"));// false - not a digit more than once
		System.out.println(Pattern.matches("\\d", "don342"));//false- not a digit
		
		System.out.println(Pattern.matches("\\D", "abc"));// false - not a digit
		System.out.println(Pattern.matches("\\D", "1"));// true - it is a digit
		System.out.println(Pattern.matches("\\D", "443"));// false - not a digit more than once
		System.out.println(Pattern.matches("\\D", "a"));//false- not a digit
		
		System.out.println(Pattern.matches("\\D*", "mak"));// true
	}
	
	
	
	
	}


