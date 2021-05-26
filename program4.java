import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int m,n,power=1,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number and its power");
     m=sc.nextInt();
     n=sc.nextInt();
     for(i=1;i<=n;i++)
     {
    	 power=power*m;
     }
     System.out.println("Answer:"+power);
	}

}
