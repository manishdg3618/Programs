import java.util.Scanner;

public class program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m,n,b,arm=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		m=sc.nextInt();
		n=m;
		while(n>0)
		{
			i=n%10;
			b=i*i*i;
			arm=arm+b;
			n=n/10;
		
		}
		
		if(arm==m)
		System.out.println("Given number is Armstrong");
		else
			System.out.println("Given number is not Armstrong");
		sc.close();
	}

}
