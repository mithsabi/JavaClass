package JavaPackage;

public class Except {

	public static void main(String[] args) {
		try
		{
			int[] mynums= {1,2,3,4};
			System.out.println(mynums[13]);
 		}
		catch(Exception e)
		{
			System.out.println("something wrong");
			System.out.println(e);
		}
	}

}
