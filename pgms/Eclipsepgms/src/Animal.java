
public class Animal {
	String name;
	int size;
	public void eat()
	{
		System.out.println("I am an animal with name "+getName()+" eating munch munch....");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int s) {
		size = s;
	}
	
}
