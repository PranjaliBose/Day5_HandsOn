import java.util.Random;
abstract class Instrument
{
	abstract void play();
}
class Piano extends Instrument
{
	void play()
	{
		System.out.println("Piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument
{
	void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
	
}
class Guitar extends Instrument
{
	void play()
	{
		System.out.println("Guitar is playing tin tin tin");
	}
	
}
public class TestInstrument 
{
	public static void main(String[] args) 
	{
		Instrument[] in=new Instrument[10];
		Random ran=new Random();
		for(int i=0;i<10;i++)
		{
			int random=ran.nextInt((3-1)+1)+1;
			if(random==1)
			{
				in[i]=new Piano();
				
			}
			else if(random==1)
			{
				in[i]=new Flute();
				
			}
			else if(random==1)
			{
				in[i]=new Guitar();
				
			}
		}
		for(int i=0;i<10;i++)
		{
			if(in[i] instanceof Piano)  
				System.out.print("Instrument " + i + " is of type Piano, ");  
			if(in[i] instanceof Flute)  
				System.out.print("Instrument " + i + " is of type Flute, ");  
		    if(in[i] instanceof Guitar)  
				System.out.print("Instrument "+ i + " is of type Guitar, ");  
		    in[i].play(); 		
		}
		

	}

}
