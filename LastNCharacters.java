import java.util.Scanner;
public class LastNCharacters {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String s=sc.next();
		System.out.println("Enter number of turns : ");
		int n=sc.nextInt();
		String res="";
		for(int i=0;i<s.length() && i<n;i++)
		{
			res=res+s.substring(s.length()-n);
		}
		System.out.println(res);

	}

}
