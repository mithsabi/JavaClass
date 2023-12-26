package JavaPackage;

public class Strings {

	public static void main(String[] args) {
		String name="pavan kumar varma";
		String[] splitString=name.split(" ");
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		System.out.println(splitString[2]);
		String[] splitString1=name.split("kumar");
		System.out.println(splitString1[0]);
		System.out.println(splitString1[1].trim());
		/*String[] splitString2=name.split("_");
		System.out.println(splitString2[0]);
		System.out.println(splitString2[1]);
		System.out.println(splitString2[2]);*/

		
		

	}

}
