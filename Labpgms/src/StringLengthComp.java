import java.util.Collection;
import java.util.Comparator;

public class StringLengthComp implements Comparator
{
	public int compare(Object o1 , Object o2) 
	{
		if(o1 instanceof String && o2 instanceof String)
		{
			String s1 = (String)o1;
			String s2 = (String)o2;
			if(s1.length()==s2.length())
			{
				return (s1.compareTo(s2));
			}
			else
				return s1.length()-s2.length();
		}
		else throw new IllegalArgumentException("Cannot compare non string");
		
	}

}
