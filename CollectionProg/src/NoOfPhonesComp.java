import java.util.Comparator;


public class NoOfPhonesComp implements Comparator {

	public int compare(Object o1,Object o2)
	{
		if( o1 instanceof Person && o2 instanceof Person)
		{
			Person p1 = (Person)o1;
			Person p2 = (Person)o2;
			return p1.noOfPhones-p2.noOfPhones;
		}
		else
				throw new IllegalArgumentException("Cannot Compare non Person");
	}
}
