import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization 
{

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		String s = "Good nite!!!! see you bye bye!!!!";
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:/out.ser"));
		out.writeObject(s);
	}

}
