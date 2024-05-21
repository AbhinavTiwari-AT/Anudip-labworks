package methodoveriding_module12;

class Animal
{
	public void move()
	{
		System.out.println("Animals can move");
	}
	public void makesound()
	{
		System.out.println("Animals can make sound");
	}
}
class Birds extends Animal
{
	@Override
	public void move()
	{
		System.out.println("Birds can fly");
	}
	@Override
	public void makesound()
	{
		System.out.println("Birds can make sound");
	}
}
class Panther extends Animal{
	@Override
	public void move()
	{
		System.out.println("Panther can walk and run");
	}
	@Override
	public void makesound()
	{
		System.out.println("Panther can make sound");
	}
}
public class AnimalCharacter {
	public static void main(String[] args)
	{
		Animal C=new Animal();
		Animal B=new Birds();
		Animal P=new Panther();
        C.move();
        C.makesound();
		B.move();
		B.makesound();
		P.move();
		P.makesound();
		
	}

}
