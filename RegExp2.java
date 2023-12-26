package JavaPackage;

import java.util.regex.Pattern;

public class RegExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//. dot represents single character
		System.out.println(Pattern.matches(".s", "as"));//true- 2nd char is s
		System.out.println(Pattern.matches(".s", "mk"));// false - 2nd char is not s
		System.out.println(Pattern.matches(".s", "mst"));//false -has more tha 3 chars
		System.out.println(Pattern.matches("..s", "pvs"));// true -
	}

}
