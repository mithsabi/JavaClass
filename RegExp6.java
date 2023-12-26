package JavaPackage;
import java.util.regex.*;

public class RegExp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // create a regexp that accept aiphanumeric char only-
		// length must be 6 characters long only
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Raja32"));//true
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Raja3$"));//false
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Raja323"));//false
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "Raja323"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "raja32"));//true
		
	}

}
