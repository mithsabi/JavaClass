package JavaPackage;

public class GrandChildren extends Children{
Children cd=new Children();
void grandchildren()
{
	System.out.println("karthikeyavarma1");
	System.out.println("karthikeyavarma2");
	System.out.println("karthikeyavarma3");
	System.out.println("karthikeyavarma4");
}
	public static void main(String[] args) {
		GrandChildren gcd=new GrandChildren();
		System.out.println("*****Parents****");
		gcd.cd.fmy.parents();
		System.out.println("*****childrens****");
		gcd.cd.child();
		System.out.println("*****grand childrens****");
		gcd.grandchildren();
		
	}

}
