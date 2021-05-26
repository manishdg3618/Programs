import java.util.Scanner;

public class program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println("Greatest="+a);
		}
		else
		{
		
			if(b>c)
				System.out.println("Greatest:"+b);
			else
				System.out.println("Greatest:"+c);
		}
	}

}
