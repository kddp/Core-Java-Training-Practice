import java.util.*;


public class TestPerson {

	public static void main(String[] args) {

		Person p1 = new Person("Salman",5);
		Person p2 = new Person("Shahruk",4);
		Person p3 = new Person("Amitab",10);
		Person p4 = new Person("John",14);
		Person p5 = new Person("Amir",8);
		Person p6 = new Person("Sallu",105);
		Person p7 = new Person("HoneySingh",264);
		Person p8 = new Person("Aftab",101);
		Person p9 = new Person("MilkhSingh",143);
		Person p10 = new Person("Sahir",80);
		String s1 = "abcd";
		String s2 = "efgh";
		String s3 = "raja";
		String s4 = "raju";
		
		NoOfPhonesComp npc = new NoOfPhonesComp();
		Collection col = new TreeSet(npc);
			
		col.add(p1);
		col.add(p2);
		col.add(p3);
		col.add(p4);
		col.add(p5);
		col.add(p6);
		col.add(p7);
		col.add(p8);
		col.add(p9);
		col.add(p10);
		
	/*	col.add(s1);
		col.add(s2);
		col.add(s3);
		col.add(s4); */
		
		//Person p6 = new Person("Salman",5);
		//String s5 = "cd";
		
		//col1.addAll(col);
		
		System.out.println("Collection col => "+col);
	//	System.out.println("Members of Collection col1 => "+col1);
	//	System.out.println("Checking Person "+p4+" their in col => "+col.contains(p6));
	//	System.out.println("Checking String "+s5+" their in col => "+col.contains(s5));
		
		
		
	/*	StrLengthComp slc = new StrLengthComp();
		Collection col = new TreeSet(slc);
		
		/*String s1 = "Dabangg";
		String s2 = "Dabangg2";
		String s3 = "Don";
		String s4 = "Agneepath";
		String s5 = "Game";
		
		Collect c1 = new Collect("Hello",5,10);
		Collect c2 = new Collect("Hi",2,11);
		Collect c3 = new Collect("Shayam",25,199);
		Collect c4 = new Collect("Rama",8,26);
		Collect c5 = new Collect("Laxman",1,130);
		Collect c6 = new Collect("Geeta",9,100);
		
		
		col.add(s1);
		col.add(s2);
		col.add(s3);
		col.add(s4);
		col.add(s5);
		col.add(c1);
		col.add(c2);
		col.add(c3);
		col.add(c4);
		col.add(c5);
		
		System.out.println(col);
	//	String s6 = "Don";
	//	System.out.println("is "+s6+" their in col => "+col.contains(s6));
		
		Collect c7 = new Collect("Rama",8,26);
		
	//	int num = c4.hashCode();
	//	int num1 = c7.hashCode();
		System.out.println("is "+c7+" their in col => "+col.contains(c7));
	//	System.out.println("hashcode of c4 => "+num);
	//	System.out.println("hashcode of c7 => "+num1);
		
		*/
		
	}

}
