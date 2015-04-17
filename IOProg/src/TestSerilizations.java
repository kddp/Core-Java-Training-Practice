import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class TestSerilizations 
{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:/out.ser"));
		String s = (String)in.readObject();
		System.out.println(s);
	}

}
