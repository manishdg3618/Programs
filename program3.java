import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,a;
		double ci,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount,rate and time:");
		a=sc.nextInt();
		n=sc.nextInt();
		r=sc.nextInt();
		sc.close();
		
		 ci = a*(Math.pow((1 + r / 100), n));
		 System.out.println("Compound Interest amount:"+ci);
		
	}

}
