package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling3 {
	public static void main(String[] args) {
		String path="C:\\Users\\W10\\Desktop\\Ram\\Filehandling\\demotest.txt";
		String text="i am in trainng at simplilearn";
		
		
		try {
			FileWriter f=new FileWriter(path,true);
				f.write(text);
				f.close();
			System.out.println(" append sucessfully Written");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
