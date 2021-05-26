import java.util.Scanner;

public class program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,i,j,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		for(i=2;i<=n;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					flag =1;
					break;
					
				}
				if(flag==0)
					System.out.println("Prime numbers ");
	                System.out.println(i);	
	                break;
			}
		}
	}

}
