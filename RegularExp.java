package JavaPackage;
import java.util.regex.*;
public class RegularExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pattern and matches classes provides the facility of java Reg.expression
		boolean bol=Pattern.matches(".s","as");
		
		System.out.println(bol);
		boolean bol1=Pattern.matches(".s","ab");
		System.out.println(bol1);
		

	}

}
