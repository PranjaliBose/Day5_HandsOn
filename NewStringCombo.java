import java.util.Scanner;
public class NewStringCombo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string : ");
		String a=sc.next();
		System.out.println("Enter second string : ");
		String b=sc.next();
		String res="";
		int len=0;
		if(a.length()>=b.length())
		{
			len=a.length();
		}
		else
		{
			len=b.length();
		}
		for(int i=0;i<len;i++)
		{
			if(i<a.length())
			{
				res=res+a.charAt(i);
			}
			if(i<b.length())
			{
				res=res+b.charAt(i);
			}
		}
		System.out.println(res);
			
		

	}

}
