package JavaPackage;

public class Children extends Family{
	Family fmy=new Family();
void  child()
{
	System.out.println("karthikeya1");
	System.out.println("karthikeya2");
	System.out.println("karthikeya3");
	
	
}
public static void main(String[] args) {
	Children chd=new Children();
	System.out.println("parents name");
	chd.fmy.parents();
	System.out.println("childrens name");
	chd.child();
	
}


}
