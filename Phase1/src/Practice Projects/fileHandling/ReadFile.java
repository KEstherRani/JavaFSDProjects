package fileHandling;
import java.io.*;
public class ReadFile {
	 public static void main(String[] args){
	 //Reading an Existing file
	 try
	 {
	 FileReader r = new FileReader("C://Users//HP//java workspace//Phase1//src//program//files//day2.txt");
	 try
	 {
	 int i;
	 System.out.println("The Contents of File are:\n");
	while((i=r.read())!=-1)
	 {
	 System.out.print((char)i);
	 }
	 }
	 finally
	 {
	 r.close();
	 System.out.print("\n");
	 System.out.print("File Closed successfully.");
	 }
	 }
	 catch(IOException e)
	 {
	 System.out.println("Exception handled..");
	 }
	 } 

}
