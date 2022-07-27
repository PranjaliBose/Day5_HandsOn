import java.util.Scanner;
public class NewStringCombo1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String []k=s.split(",");
		String x=k[0];
		String y=k[1];
		String n="";
		for(int i=0;i<=x.length()-y.length();i++)
		{
			String tem=x.substring(i,y.length()+i);
			if(tem.equals(y)) 
			{
				if(i>0 && i<x.length()-1)
				{
					n+=x.charAt(i-1);
				}
				if(i>=0 && y.length()+i<x.length())
				{
					n+=x.charAt(y.length()+i);
				}
				
			}
		}
		System.out.println(n);

	}

}
