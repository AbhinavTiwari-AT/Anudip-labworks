/*
 Java program to create a base class Vehicle with methods startEngine() and stopEngine(). 
 Create two subclasses Car and  Motorcycle. 
 Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.
 */

package methodoveriding_module12;

class Vehicle
{
	public void startEngine()
	{
		System.out.println("the Engine starts");
	}
	public void stopEngine()
	{
		System.out.println("the Engine Stops");
	}
}
class Car extends Vehicle           //inheriting  
{
	@Override               //  method overriding
	public void startEngine()
	{
		System.out.println("the car Engine can Starting");
	}
	@Override                //  method overriding
	public void stopEngine()
	{
		System.out.println("the car Engine can Stoping");
	}
}
class MotorCycle extends Vehicle       ////inheriting  
{
	@Override                 //  method overriding
	public void startEngine()
	{
		System.out.println("the MotorCycle Engine can starting");
	}
	@Override                //  method overriding
	public void stopEngine()
	{
		System.out.println("the MotorCycle Engine can Stoping");
	}
}

public class MainVehicle {
	public static void main(String[] args)
	{
		Vehicle V=new Vehicle();         //object declararion
		Vehicle C=new Car();
		Vehicle M=new MotorCycle();
		
	    V.startEngine();        // calling methods
	    V.stopEngine();
	    C.startEngine();
	    C.stopEngine();
	    M.startEngine();
	    M.stopEngine();
	   	
	}

}

/*  OUTPUT :-
 
 the Engine starts
the Engine Stops
the car Engine can Starting
the car Engine can Stoping
the MotorCycle Engine can starting
the MotorCycle Engine can Stoping

*/
