import java.util.Scanner;

public class program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		a=sc.nextInt();
		for(i=1;i<=a;i++)
		{
			sum = sum +i;
		}
		System.out.println("Addition of numbers : "+sum);
	}

}

