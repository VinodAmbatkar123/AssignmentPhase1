package projectmain;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class FileHandlingProject 
{
	private String path = "C:\\vinood\\ankush\\";
	public File[] displayFiles()
	{
		File fp = new File(path);
		
//		List lst = new ArrayList(Arrays.asList(fp.list()));
//		for(String s:fp.list())
//			lst.add(s);
		File[] lst = fp.listFiles();
		Arrays.sort(lst);
		
		return lst;
	}
	public boolean addFile(String filename)
	{
		try 
		{
			return new File(path+filename).createNewFile();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteFile(String filename)
	{
		return new File(path+filename).delete();
	}
	
	public boolean searchFile(String filename)
	{
		return new File(path+filename).exists();
	}
	
	public static void main(String[] args) 
	{
		do
		{
			System.out.println("_______MENU_________");
			System.out.println("1)Show all the file in current directory");
			System.out.println("2)Other Operations");
			System.out.println("3)Exit");
			int ch = new Scanner(System.in).nextInt();
			switch(ch)
			{
				case 1:
					int i=0;
					System.out.println("File Present in current directory");
					for(File s:new FileHandlingProject().displayFiles())
						System.out.println("\t"+(++i)+")"+s.getName());
					break;
				case 2:
					boolean b = true;
					do
					{
						System.out.println("_______Operations_________");
						System.out.println("1)Create New File");
						System.out.println("2)Delete Existing File");
						System.out.println("3)Search Existing File");
						System.out.println("4)Back to Main Menu");
						int ch1 = new Scanner(System.in).nextInt();
						switch(ch1)
						{
							case 1:
								System.out.println("Enter Name to create file");
								if(new FileHandlingProject().addFile(new Scanner(System.in).nextLine()))
									System.out.println("File Created sucsseccfully");
								else
									System.out.println("Exception Occured During File Creation");
								
								break;
							case 2:
								System.out.println("Enter Name of file to Delete");
								if(new FileHandlingProject().deleteFile(new Scanner(System.in).nextLine()))
									System.out.println("File deleted sucsseccfully");
								else
									System.out.println("File Not Found");
								
								break;
							case 3:
								System.out.println("Enter Name of file to Search");
								if(new FileHandlingProject().searchFile(new Scanner(System.in).nextLine()))
									System.out.println("File Found");
								else
									System.out.println("File Not Found");
								break;
							case 4:
								b = false;
								break;
						}
					}while(b);
					break;
					
				case 3:
					System.exit(-1);
			}
		}while(true);
	}
}