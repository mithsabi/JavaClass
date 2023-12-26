package JavaPackage;

public class Constructors {
	int x,y;
	public Constructors()
	{
		x=5;
		y=8;
	}
	public static void main(String[] args) {
		
		Constructors myObj=new Constructors();
		int val1=myObj.x;
		int val2=myObj.y;
		System.out.println(val1);
		System.out.println(val2);
		
	}

}
