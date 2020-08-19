import java.util.Scanner;
class oddeven
{	public static void main(String args[])
	{Scanner sc=new Scanner(System.in);
	 System.out.print("Number :");
	 long s1 = sc.nextLong();
	
	 long k=0,d=0,l=0;
         while(s1!=0)
	 {d=s1%10;
	 if(d%2==0)
	 {k++;}
	 else
         {l++;}
	 s1=s1/10;}
	System.out.println("Odd digit : "+l);
	System.out.println("Even digit : "+k);
	
	}
}