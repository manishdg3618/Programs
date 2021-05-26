import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m,n,swap;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A:");
		m=sc.nextInt();
		System.out.println("Enter value of B:");
		n=sc.nextInt();
		swap=m;
		m=n;
		n=swap;
		System.out.println("Value of A:"+m);
		System.out.println("Value of B:"+n);
		
	}

}
