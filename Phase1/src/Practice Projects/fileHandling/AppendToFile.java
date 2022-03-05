package fileHandling;
import java.io.*;

public class AppendToFile {
	 public static void main(String[] args){
	 // Append text to Existing File.
	 String path = "C://Users//HP//java workspace//Phase1//src//program//files//day2.txt";
	 String text = "You are Learning Core Java";
	 try
	 {
	 FileWriter f = new FileWriter(path,true);
	 f.write(text);
	 f.close();
	 System.out.println("Successfully Appended to File..!!");
	 }
	 catch(IOException e){
	 System.out.println(e);
	 } 
	 }

}
