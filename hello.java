package hello;
import 	java.util.Scanner;
import java.lang.Math;
public class hello {
    static int pv;
    static  double fv;
    static final double interest=0.05;
    static int interval;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�JPV:");
	    pv=sc.nextInt();
		System.out.print("�п�Jinterval:");
	    interval=sc.nextInt();
	    fv=pv*Math.pow((1+interest),interval);
	    System.out.println("My pv is "+pv+" and after "+interval+"year it would be "+fv);
	    
	    
	    
		
		
	}

}
