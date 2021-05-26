import java.util.Scanner;

public class program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n,m,i,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		m=sc.nextInt();
		n=m;
		while(n!=0)
		{
			i=n%10;
			rev=rev*10+i;
			n=n/10;
		}
		
		if(rev==m)
		{
			System.out.println("Given number is polindrome");
		}
		else
		{
			System.out.println("Given number is not polindrome");
		}
	}

}
