import java.util.Scanner;
class s
{
	public static void main(String args[])
	{ 
		Scanner sc =new Scanner(System.in);
 		System.out.print("String 1:");
		String s1 =sc.next();
		System.out.print("String 2:");
		String s2 =sc.next();
		int l1 = s1.length();
		int l2 = s2.length();
                String l2f2 = s2.substring(l2-2,l2);
		String l2f1 = s1.substring(l1-2,l1);
		String f2f2 = s2.substring(0,2);
		String f2f1 = s1.substring(0,2);
		String r1 = l2f2 + s1.substring(2,l1-2)+f2f2;
		String r2 = l2f1 + s2.substring(2,l2-2)+f2f1;
		System.out.println("String 1 :"+r1);
		System.out.println("String 2 :"+r2);
	}
}