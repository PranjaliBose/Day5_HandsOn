import java.util.Random;
abstract class Compartment
{
	public abstract String notice();
	
}
class FirstClass extends Compartment
{
	public String notice()
	{
		return " This is First Class . ";
	}
}
class Ladies extends Compartment
{
	public String notice()
	{
		return " This is Ladies Class . ";
	}
}
class General extends Compartment
{
	public String notice()
	{
		return " This is General Class . ";
	}
}
class Luggage extends Compartment
{
	public String notice()
	{
		return " This is Luggage Class . ";
	}
}
public class TestCompartment 
{

	public static void main(String[] args) 
	{
		Compartment[] c=new Compartment[10];
		Random ran=new Random();
		for(int i=0;i<10;i++)
		{
			int random=ran.nextInt((4-1)+1)+1;
			if(random==1)
			{
				c[i]=new Luggage();
			}
			else if(random==2)
			{
				c[i]=new Ladies();
			}
			else if(random==3)
			{
				c[i]=new General();
				
			}
			else if(random==4)
			{
				c[i]=new FirstClass();
			}
			System.out.println(c[i].notice());
		}
		
		
	}

}
