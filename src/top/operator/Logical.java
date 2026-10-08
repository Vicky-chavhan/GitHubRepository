package top.operator;

public class Logical {
	
public static void main(String args[]) {
	

/*	//AND OPERATOR
	
       System.out.println(true && true);
       System.out.println(true  && false);
       System.out.println(false && false);
       System.out.println(false && true);

    //OR OPERATOR
       
       System.out.println(true || true);
       System.out.println(true  || false);
       System.out.println(false || false);)
       System.out.println(false || true);

     // NOT operator
       
       System.out.println(!true);
       System.out.println(!false);

*/
	
	
/*	System.out.println("Ram" != "ram");
    System.out.println(15 == 15);
    System.out.println("A" == "a");
    System.out.println(20 <= 28);
    System.out.println(20 >= 28); */
   
	boolean check = 10 >= 9;
    
    System.out.println(check || true && 4>7 || !("ram" == "Ram"));
    System.out.println(56 != 52 && check || 5>5 && (!( true)));
    System.out.println(! check && true || false || 2>=4 && true && 3<=5 );
    System.out.println(!(12>= 12.9) || false && 4.0<=4.0 || 34>=2.7);
    System.out.println(!(12>= 12.9) || !false && 4.0<=4.0 || check);
    System.out.println("A" != "a"|| check && 5>6 && true ||  check != 2>4);
    
    

	
	
}
	
	

}
