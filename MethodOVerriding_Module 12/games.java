/*
  program to create a base class Sports with a method called play(). 
 Create three subclasses: Football, Basketball, and Rugby.
  Override the play() method in each subclass to play a specific statement for each sport.
 */


package methodoveriding_module12;

class sports{
	
	public void play()
	{
		System.out.println("playing sports");	
	}
}
class Football extends sports    
{
	@Override                   //  method overriding
	public void play()
	{
		System.out.println("playing Football");
	}
}
class Basketball extends sports
{
	@Override                //  method overriding
	public void play()
	{
		System.out.println("playing basketball");
	}
}
class Rugby extends sports{
	@Override                  //  method overriding
	public void play()
	{
		System.out.println("playing rugby");
	}
}
public class games {
	public static void main(String[] args)
	{
	      sports f=new Football();     //object declaration
	      sports b=new Basketball();
	      sports r=new Rugby();
	      f.play();              // calling method 
	      b.play();
	      r.play();
	}

}

/* Output :-

playing Football
playing basketball
playing rugby

*/
