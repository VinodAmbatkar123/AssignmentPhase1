package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {
	public static void main(String[] args) {
		try {
			FileReader r=new FileReader("C:\\Users\\W10\\Desktop\\Ram\\Filehandling\\Demotest.txt");
			try
			{
				int i;
				while((i=r.read())!=-1)
						{
					System.out.print((char)i);
				}
				
			}
			finally {
				r.close();
				System.out.print("\n");
				System.out.print("file closed sucessfully");
			}
			
		}
		catch(IOException e) {
			System.out.println("Exception handled..");
		}
	}

}
