public class Car
{
	int fuelQty;
	int maxFuel;
	String name;
	boolean isStarted;

	public void start()
	{
		if(fuelQty>0)
		{
			System.out.println("Car with name "+name+" is started");
			isStarted=true;
		}
		else
			System.out.println("Car has no fuel and cannot be started");
	}


	public void drive()
	{
		if(isStarted)
		{
			if(fuelQty>0)
				{
					System.out.println("Car with name "+name+" is been driven and remaining fuel quantity is "+fuelQty);
					fuelQty--;
				}
				if (fuelQty==0)
				stop();
		}
		else
		System.out.println("First Start the Car and then drive");


	}

	public void stop()
	{
		if(isStarted)
		{
			System.out.println("Car with name "+name+" is stop");
			isStarted=false;
		}
		else
		{
			System.out.println("How to Stop a stopped car");
		}
	}


	public void addFuel(int f)
		{
			fuelQty=fuelQty+f;

		}
}