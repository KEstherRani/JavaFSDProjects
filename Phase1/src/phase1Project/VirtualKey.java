package phase1Project;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;

public class VirtualKey {
	public static void main(String[] args) throws IOException{
		String ch,Path;
		char y;
		Scanner sc=new Scanner(System.in);
		System.out.println("****************************************************************************************\n");
		System.out.println("--------------------------------WELCOME TO LockedME.com---------------------------------\n");
		System.out.println("****************************************************************************************\n");
		System.out.println("--Developer Deatils:--");
		System.out.println("Name: Koreboina Esther Rani");
		System.out.println("Associate Software Engineer at Mphasis");
		System.out.println("Employee Id: 2501758");
		System.out.println("Email-id: koreboina.rani@mphasis.com\n");
		
	do{
		
		System.out.println("Application Options are:");
		System.out.println("1.\t Current File Name in Ascending Order:");
		System.out.println("2.\t Details of User Interface:");
		System.out.println("\t2.1\t Add a file to a Existing Directory:");
		System.out.println("\t2.2\t Delete a Specified File From Existing Directory List:");
		System.out.println("\t2.3\t Serach a File From Specified Directory:");
		System.out.println("3.\t Exit Application:");
		ch=sc.nextLine();
		switch(ch)
		{
		case "1":
			try{
				File fin=new File("C://Users//HP//java workspace//Phase1//src//assesment1");
				File[] listOfFiles = fin.listFiles();

				for (int i = 0; i < listOfFiles.length; i++) {
				  if (listOfFiles[i].isFile())
				  {
				    System.out.println("File " + listOfFiles[i].getName());
				  } else if (listOfFiles[i].isDirectory())
				  {System.out.println("Directory " + listOfFiles[i].getName());}
				}
				}
				catch(Exception e)
				{
					System.out.println("Folder Doesnot Exits");
				}
			break;
		case "2.1":
			System.out.println("Enter the File Name to be Created in Existing Directory: ");
			Scanner snr=new Scanner(System.in);
			String Filename=snr.nextLine();
			createFileUsingFileClass(Filename);
			break;
		case "2.2":
			try
	        { 
				System.out.println("Enter the File Name to be Created in Existing Directory: ");
				Scanner r=new Scanner(System.in);
				String dfile=r.nextLine();
				String fn="C://Users//HP//java workspace//Phase1//src//assesment1//";
		    	Path=fn.concat(dfile);
	            Files.deleteIfExists(Paths.get(Path)); 
	        } 
	        catch(NoSuchFileException e) 
	        { 
	            System.out.println("Exception: File Not Found (FNF)"); 
	        } 
	        catch(DirectoryNotEmptyException e) 
	        { 
	            System.out.println("Directory is not empty."); 
	        } 
	        catch(IOException e) 
	        { 
	            System.out.println("Invalid permissions."); 
	        } 
	          
	        System.out.println("Deletion successful.");
	        break;
		case "2.3":
			System.out.println("Enter the Name of File be Searched in Current Directory: ");
			Scanner r1=new Scanner(System.in);
			String fn=r1.nextLine();
			 String nfn=fn.toLowerCase();
		      File directory = new File("C://Users//HP//java workspace//Phase1//src//assesment1//");
		        MyFilenameFilter filter= new MyFilenameFilter(nfn);
		        String[] flist = directory.list(filter);
		  
		        // Empty array
		        if (flist == null) {
		            System.out.println("Empty directory or directory does not exists.");
		        }
		        else {

		            for (int i = 0; i < flist.length; i++) {
		                System.out.println(flist[i]+" found in Current Directory!!");
		            }
		        }
		        break;
		case "3":
			System.exit(0);
	    default:
	    	System.out.println("Invalid Option Try again!!");
		
		}
        System.out.println("\nDo you want to continue (Type y or n) \n");
        Scanner s=new Scanner(System.in);
        y = s.next().charAt(0);

    } while (y == 'Y'|| y == 'y');;
	}
	
    private static void createFileUsingFileClass( String fn) throws IOException
    {
    	String Path;
    	String s1="C://Users//HP//java workspace//Phase1//src//assesment1//";
    	Path=s1.concat(fn);
          File file = new File(Path);
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Hello, Welcome to LockedMe.com. Thankyou for Creating the File.");
          writer.close();
    }	
}
class MyFilenameFilter implements FilenameFilter {
    
    String initials;
    public MyFilenameFilter(String initials)
    {
        this.initials = initials;
    }
    
    public boolean accept(File dir, String name)
    {
        return name.startsWith(initials);
    }
}

