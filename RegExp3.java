package JavaPackage;
import java.util.regex.*;
public class RegExp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
	System.out.println(Pattern.matches("[amn]","amn"));//false
	System.out.println(Pattern.matches("[amn]","m"));//true-a only once
	System.out.println(Pattern.matches("[amn]","ammna"));//false- m&a are coming more than once
	

	}

}
