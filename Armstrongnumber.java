import java.util.Scanner;
public class Armstrongnumber {
	public static void main(String[]args)
	{int i,n,r,sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	n =s.nextInt();
	i=n;
	while(n!=0)
	{
		r =n%10;
		n =n/10;
		sum =sum +(r*r*r);
	}
	if(i==sum)
	{System.out.println("given number is Armstrong number");
	}
	else
	{System.out.println("given number is not Armstring number");}

}
}