package methodoveriding_module12;

class sports{
	
	public void play()
	{
		System.out.println("playing sports");	
	}
}
class Football extends sports
{
	@Override
	public void play()
	{
		System.out.println("playing Football");
	}
}
class Basketball extends sports
{
	@Override
	public void play()
	{
		System.out.println("playing basketball");
	}
}
class Rugby extends sports{
	@Override
	public void play()
	{
		System.out.println("playing rugby");
	}
}
public class games {
	public static void main(String[] args)
	{
	      sports f=new Football();
	      sports b=new Basketball();
	      sports r=new Rugby();
	      f.play();
	      b.play();
	      r.play();
	}

}
