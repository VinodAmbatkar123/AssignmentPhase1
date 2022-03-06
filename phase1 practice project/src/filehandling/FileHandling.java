package filehandling;

import java.io.FileWriter;
import java.io.IOException;


public class FileHandling {
	public static void main(String[] args) {
		try {
			FileWriter f=new FileWriter("C:\\Users\\W10\\Desktop\\Ram\\Filehandling\\Demotest.txt");
			try
			{
				f.write("i am employee of mnc");
			}
			finally {
				f.close();
			}
			System.out.println("sucessfully Written");
		}
		catch(IOException i) {
			System.out.println(i);
		}
	}

}
