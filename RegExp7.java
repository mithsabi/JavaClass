package JavaPackage;
import java.util.regex.*;

public class RegExp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // create a regular expression- that accepts 10 digits numeric charcs only
		// start with 7 or 8 or 9 - not repetative
		
		System.out.println(Pattern.matches("[0-9]{10}", "9876543210"));
		System.out.println(Pattern.matches("[789]{3}[0-9]{10}", "9355654021"));
		
		System.out.println(Pattern.matches("[0-9]{10}", "9876543210"));
		System.out.println(Pattern.matches("[0-9]{10}", "9876543210"));
		System.out.println(Pattern.matches("[0-9]{10}", "9876543210"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
