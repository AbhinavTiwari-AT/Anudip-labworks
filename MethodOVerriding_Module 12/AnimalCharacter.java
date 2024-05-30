// program to create a base class Animal with methods move() and makeSound().
//Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe how each animal moves. 
//Also, override the makeSound() method in each subclass to make a specific sound for each animal.

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
	@Override                 // method overriding
	public void move()
	{
		System.out.println("Birds can fly");
	}
	@Override               // method overriding
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
		Animal C=new Animal();         //object declaration
		Animal B=new Birds();          
		Animal P=new Panther();
        C.move();            // calling method move
        C.makesound();       // calling method makesound
		B.move();
		B.makesound();
		P.move();
		P.makesound();
		
	}

}

/*  Output :-

Animals can move
Animals can make sound
Birds can fly
Birds can make sound
Panther can walk and run
Panther can make sound
*/
