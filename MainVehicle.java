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
class Car extends Vehicle
{
	@Override
	public void startEngine()
	{
		System.out.println("the car Engine can Starting");
	}
	@Override
	public void stopEngine()
	{
		System.out.println("the car Engine can Stoping");
	}
}
class MotorCycle extends Vehicle
{
	@Override
	public void startEngine()
	{
		System.out.println("the MotorCycle Engine can starting");
	}
	@Override
	public void stopEngine()
	{
		System.out.println("the MotorCycle Engine can Stoping");
	}
}

public class MainVehicle {
	public static void main(String[] args)
	{
		Vehicle V=new Vehicle();
		Vehicle C=new Car();
		Vehicle M=new MotorCycle();
		
	    V.startEngine();
	    V.stopEngine();
	    C.startEngine();
	    C.stopEngine();
	    M.startEngine();
	    M.stopEngine();
	    
	    
		
	}

}
