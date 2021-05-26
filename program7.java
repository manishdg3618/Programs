import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number and its power");
		double m=sc.nextInt();
		double n=sc.nextInt();
		double power;
		power=Math.pow(m,n);
		System.out.println("Value="+power);
		
	}

}
