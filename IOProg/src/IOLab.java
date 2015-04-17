import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class IOLab 
{
	public static void main(String[] args) 
	{
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Enter the source file path  => ");
		String inPath = sc1.nextLine();
		
		System.out.println("Enter the destination file path => ");
		String outPath = sc2.nextLine();
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		String str;
		
		File f = new File(inPath);
		if(!f.exists())
		{
			System.out.println("File doesnot exist provide correct path..!!!!!");
		}
		else
		{
			try
			{
				br = new BufferedReader(new FileReader(inPath));
				bw = new BufferedWriter(new FileWriter(outPath,true));
				
				while((str=br.readLine())!=null)
				{
					System.out.println(str);
					bw.write(str);
					bw.newLine();
					
					
				}
				
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if(br!=null)	
						br.close();
					if(bw!=null)
						bw.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}

		}
		
	}

}
