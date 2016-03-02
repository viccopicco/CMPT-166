/**
 * Lab 1
 * 
 * @author Ere Santos <ere.santos@twu.ca>
 * Date: January 27, 2016
 * 
 * Input: User name
 * Output: Augmentation on the User name
 *
 */
import java.util.Scanner;
import java.io.*;

public class lab1 {
	public static void main(String args[]) throws IOException{
		// This is the input from the user.
		Scanner usr_inpt = new Scanner(System.in);
		// Text file separator
		String file_read;
		System.out.println("Do you have a file to read from?");
		file_read = usr_inpt.next();
		// This is an exception catcher.
		int xpt_ctch = 0;
		if  (file_read.length() >= 3){
			String txt_lne = null;
			// I will now take the name of the file.
			String usr_fle;
			System.out.println("What is the name of your file?");
			usr_fle = usr_inpt.next();
			// This is the head end of my exception catcher.
			do{
			try{
				FileReader fle_rdr = new FileReader("src/"+usr_fle+".txt");
				FileWriter fle_wrtr = new FileWriter("src/outputText.txt");
				BufferedReader bffr_rdr = new BufferedReader(fle_rdr);
				BufferedWriter bffr_wrtr = new BufferedWriter(fle_wrtr);
				while((txt_lne = bffr_rdr.readLine()) != null) {
					// Print upper case name
					 bffr_wrtr.write("Oh, well hello "+txt_lne.toUpperCase()+". Really nice to meet you!");
					 bffr_wrtr.newLine();
					// Print lower case name
					 bffr_wrtr.write("So "+txt_lne.toLowerCase()+", isn't it fascinating how we can misspell names?");
					 bffr_wrtr.newLine();
					// Print name downward
					 bffr_wrtr.write("Anyway, ");
					 bffr_wrtr.newLine();
					int nme_lngth = txt_lne.length();
					for (int indx = 0; indx < (nme_lngth); indx++){
						bffr_wrtr.write(txt_lne.substring(indx, (indx+1)));
						bffr_wrtr.newLine();
						}
				}
					bffr_wrtr.write("Goodbye!");
					bffr_rdr.close();
					bffr_wrtr.close();
				xpt_ctch = 1;
			}
			catch(FileNotFoundException ex){
				System.out.println("I can't seem to find '"+usr_fle+"' in the directory");
			}
			}
			// This is the tail end of my exception catcher.
			while(xpt_ctch==0);
		}
			
		
		else{
			// This is a greeting
			String usr_nme0;
			System.out.println("Alrighty! Hey you! Can you Tell me your name? ");
			usr_nme0 = usr_inpt.next();
			// Print upper case name
			System.out.println("Oh, well hello "+usr_nme0.toUpperCase()+". Really nice to meet you!");
			// Print lower case name
			System.out.println("So "+usr_nme0.toLowerCase()+", isn't it fascinating how we can mispell names?");
			// Print name downward
			System.out.println("Anyway, ");
			int nme_lngth = usr_nme0.length();
			
			for (int indx = 0; indx < (nme_lngth); indx++){
				System.out.println(usr_nme0.substring(indx, (indx+1)));
			}		
			System.out.println("Goodbye!");
		}
	}
}
