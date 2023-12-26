package JavaPackage;

public class Methods {
static int MethodOverloading_Int(int x,int y)
{
	return x+y;
}
static double MethodOverloading_Double(double x,double y)
{
	return x+y;
}
public static void main(String[] args) {
	/*static void myMethod(String fname)
	{
	System.out.println(fname+"rajasagi");
	}
	public static void main(String[] args) {
		myMethod("pavan");
	} 

	//java methods with parameters
	static void myMethod(String fname,String lastname)
	{
	System.out.println(fname+","+lastname);
	}
	public static void main(String[] args) {
		myMethod("pavan","rajasagi");
		myMethod("harish","rajasagi");
		myMethod("chitti","rajasagi");
	} */
	
	//java method overloading
int myIntval=MethodOverloading_Int(5,4);
double myDoubleval=MethodOverloading_Double(2.3,6.25);

System.out.println(myIntval);
System.out.println(myDoubleval);
}	
}
