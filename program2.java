
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,b,c;
     String x,y,z;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any two number");
     a=sc.nextInt();
     b=sc.nextInt();
     c=a+b;
     System.out.println("Addition="+c);
     System.out.println("Enter any two character:");
     x=sc.next();
     y=sc.next();
     System.out.println(""+x+y);
	}

}
