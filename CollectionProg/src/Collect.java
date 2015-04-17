
public class Collect implements Comparable
{
	
	String name;
	int size;
	int noOfPhones;
		
	//overrides hashcode
	public int hashCode()
	{
		return ((name+size+noOfPhones).hashCode());	
	}
	
	//overrides equals
	public boolean equals(Object o)
	{
		if( o instanceof Collect )
		{
			Collect c = (Collect)o;
			if( this.name.equals(c.name) && this.size == c.size && this.noOfPhones == c.noOfPhones )
				return true;
			else 
				return false;
		}
		else
			return false;
	}
	
	//overrides toString
	public String toString()
	{	
		return "("+name+","+size+","+noOfPhones+")";
	}
	
	//param constructor
	public Collect(String n,int n1,int n2)
	{
		name = n;
		size = n1;
		noOfPhones = n2;
		validate();
	}

	//validate method
	private void validate()
	{
		if(name == null)
			throw new IllegalArgumentException("Name cannot be null");
		if(size<0)
			throw new IllegalArgumentException("Size cannot be less than 0");
		if(noOfPhones <0)
			throw new IllegalArgumentException("Name cannot be less than 0");	
	}

	@Override
	public int compareTo(Object o)
	{
		if(o instanceof Collect)
		{
			Collect c = (Collect)o;
			return this.name.compareTo(c.name);
		}
		else
			throw new IllegalArgumentException("Cannot compare");
	}
	
}
