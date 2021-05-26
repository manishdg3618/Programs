import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to find its factorial:");
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			b=b*i;
		}
		System.out.println("Factorial of given number:"+b);
		
		}

}
