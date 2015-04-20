public class Animal
{
	String name;
	int size;

	public Animal(String n,int num)
	{
		name = n;
		size = num;
		validate();
	}

	private void validate()
	{
		if(name==null)
			throw new IllegalArgumentException("Name cannot be null");
		if(size<=0)
			throw new IllegalArgumentException("Size cannot be <=0");
	}

	public boolean equals(Object o)
	{
		if(o instanceof Animal)
		{
			Animal a = (Animal)o;
				if(this.name.equals(a.name) && this.size==a.size)
					return true;
				else
					return false;
		}
		return false;

	}


}