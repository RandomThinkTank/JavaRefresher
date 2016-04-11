package moreMethodsAndClasses;

public class CallByValue {
	public static void main(String args[]) {
		int a = 15, b = 20;
		passByValueDemo passValue = new passByValueDemo();
		
		System.out.println("Value of a and b before call to noChanges: a:" +a + " b:"+b );
		passValue.noChanges(a, b);
		
		System.out.println("Value of a and b after call to noChanges: a:" + a + " b:"+ b);
		
	}
}
