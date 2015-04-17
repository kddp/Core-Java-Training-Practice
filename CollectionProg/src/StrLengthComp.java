import java.util.Comparator;


public class StrLengthComp implements Comparator 

{
	public int compare(Object o1,Object o2)
	{
		if(o1 instanceof Collect && o2 instanceof Collect)
		{
			Collect s1 = (Collect)o1;
			Collect s2 = (Collect)o2;
			return s1.size-s2.size;
		}
		throw new IllegalArgumentException("Cannot compare non size");	
	}
		
}
