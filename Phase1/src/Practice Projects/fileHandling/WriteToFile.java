package fileHandling;
import java.io.*;
public class WriteToFile {
	 public static void main(String[] args){
	 try
	 {
		 FileWriter f = new FileWriter("C://Users//HP//java workspace//Phase1//src//program//files//day2.txt");
	 try
	 {
		 f.write("Welcome to Java!!");
	 }
	 finally
	 {
		 f.close();
	 }
	 System.out.println("Successfully Written..!! ");
	 }
	 catch(IOException i)
	 {
		 System.out.println(i);
	 } 
	 
	 }

}
