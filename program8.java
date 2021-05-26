import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a,i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		a=sc.nextInt();
		for(i=2;i<=a;i++)
		{
			if(a%i==0)
				flag=1;
			break;
		}
	if(flag==0) 
	System.out.println("Given number is prime number");
	else
   System.out.println("Given number is not prime number");
			}
	

}
