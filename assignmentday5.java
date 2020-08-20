import java.util.Scanner;
class abc{
public static void main(String args[])
{	int i=0,n=0,j=0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Number 1: ");
	n = sc.nextInt();
	for(i=0;i<n;i++)
	{	for(j=0;j<=i;j++)
		{System.out.print("*");}
		System.out.println();
	}
	
	for(i=n;i>0;i--)
	{for(j=0;j<i;j++)
		{System.out.print("*");}
		System.out.println();
	}
}}
