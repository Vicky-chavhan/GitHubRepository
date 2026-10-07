package top.operator;

public class Relational_comparison {
	
	public static void main(String args[]) {
		
		
		int a = 4;
		int b = 8;
		int c = 12;
		
		
    	System.out.println("equals equals " + " a " + " + "+ " b " + " = " +(a==b && b==c));
		System.out.println("not equals " + " a " + " + "+ " b " + " = " +(a!=b && b==c));
		System.out.println("greater than " + " a " + " + "+ " b " + " = " +(a>b && b==c));
		System.out.println("less than " + " a " + " + "+ " b " + " = " +(a<b && b==c));
		System.out.println("greater than equals " + " a " + " + "+ " b " + " = " +(a>=b && b==c));
		System.out.println("less than equals " + " a " + " + "+ " b " + " = " +(a<=b && b==c));		
		
		
		System.out.println("equals equals " + " a " + " + "+ " b " + " = " +(a==c));
		System.out.println("not equals " + " a " + " + "+ " b " + " = " +(a!=c));
		System.out.println("greater than " + " a " + " + "+ " b " + " = " +(a>c));
		System.out.println("less than " + " a " + " + "+ " b " + " = " +(a<c));
		System.out.println("greater than equals " + " a " + " + "+ " b " + " = " +(a>=c));
		System.out.println("less than equals " + " a " + " + "+ " b " + " = " +(a<=c));
		
		
		
	}
	
	

}
