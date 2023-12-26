package JavaPackage;
import java.util.regex.*;

public class RegExp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ? ,+,*
		
		System.out.println(Pattern.matches("[amn]?", "a"));// true
		System.out.println(Pattern.matches("[amn]?", "aazzte"));// false
		System.out.println(Pattern.matches("[amn]?", "am"));// false
		

		System.out.println(Pattern.matches("[amn]+", "mm"));// true
		System.out.println(Pattern.matches("[amn]+", "amm"));// true
		System.out.println(Pattern.matches("[amn]+", "aaa"));// true
		
		System.out.println(Pattern.matches("[amn]*", "ammna"));// true
		System.out.println(Pattern.matches("[amn]*", "ammd"));// true
		System.out.println(Pattern.matches("[amn]*", "aaammnnnnnaaa"));// true
		
		
	
		
	}

}
