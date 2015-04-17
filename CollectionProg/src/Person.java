
public class Person implements Comparable {
	
	String name;
	int noOfPhones;
	
	public int compareTo(Object o)
	{
		if (o instanceof Person)
		{
			Person p = (Person)o;
			return this.name.compareTo(p.name);			
		}
		else
			throw new IllegalArgumentException("Cannot compare non Person");
	}
	
	
	public int hashCode()
	{
		return (name+noOfPhones).hashCode();
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Person)
		{
			Person p = (Person)o;
			if(this.name.equals(p.name) && (this.noOfPhones==p.noOfPhones))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	
	public String toString()
	{
		return "("+name+","+noOfPhones+")";	
	}

	public Person(String s , int n)
	{
		name = s;
		noOfPhones = n;
		validate();
	}
	
	private void validate()
	{
		if(name == null)
			throw new IllegalArgumentException("Name cannot be null");
		if(noOfPhones < 0)
			throw new IllegalArgumentException("No of phones cannot be less than 0");
	}

	
	

}
