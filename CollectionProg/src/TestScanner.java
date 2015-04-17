import java.util.Scanner;


public class TestScanner {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter the sentence =>");
		String str = sc1.nextLine();
		System.out.println(str);
		System.out.println("Please enter the number =>");
		int num = sc1.nextInt();
		System.out.println(num);

	}

}
