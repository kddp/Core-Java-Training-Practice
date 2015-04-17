
public class TestVehicle {

	public static void main(String[] args) {
			
		Vehicle v1 = new Car();
		v1.name="tata";
		v1.drive();
		
		Vehicle v2 = new Bus();
		v2.name = "volvo";
		v2.drive();	
		
		Vehicle c = new Car();
		c.name="abc";
		c.drive();
		
		Vehicle b  = new Bus();
		b.name="cde";
		b.drive();
	}

}
