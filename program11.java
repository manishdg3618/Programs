import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,sum1=0,sum2=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				sum1=sum1+i;
			}
			else
			{
				sum2=sum2+i;
			}
		}

		System.out.println("Sum of all even numbers upto"+n +" is "+sum1);
		System.out.println("Sum of all odd numbers upto"+n +" is "+sum2);
		sc.close();
	}

}
