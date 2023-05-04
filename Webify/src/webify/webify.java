package webify;
import java.util.*;
import java.io.*;

public class webify {
	public static void main(String[] args) throws FileNotFoundException {
		importFile();
	}
	
	public static void importFile() throws FileNotFoundException {
		
		// Create a Scanner
		Scanner keyborad = new Scanner(System.in);
		System.out.print("Please type the file name with '.txt':" );
		
		// Get a file name from the user
		String file_name = keyborad.next();
		Scanner readfile = new Scanner(new File("/Users/jihyelee/Desktop/" + file_name));
		
		// Change the file name with html
		String fileTXT = file_name.substring(0, file_name.length() - 3);
		String fileConv = "html";
		String fileHTML = fileTXT + fileConv;
		System.out.println(fileHTML);
		PrintStream output = new PrintStream(new File(fileHTML));
		
		System.out.println();
		// Start the html file with <body> and <head>
		output.println("<html>");
		output.println("<body>");
		
		while (readfile.hasNextLine()) {
			String line = readfile.nextLine(); 
			
			// Check whether the line is blank or not.
			if (line.length() > 0) {
				
				// If the line starts with '_' print <h1>
				if (line.substring(0,1).equals("_")) {
					int length = line.length();
					line = "<h1>" + line.substring(1,length-1) + "</h1>";
					output.println(line);
					// If a line is a form of a list then prints <ul> and <li>
				} else if(line.substring(0,1).equals("-")) {
					output.println("<ul>");
					
					while (line.substring(0,1).equals("-") != false) {
						output.println("<li>" + line.substring(1)+"</li>");
						line = readfile.nextLine();
						
						// Print </ul> to end the list form
						if (line.length() == 0 || line.substring(0,1).equals("-") == false) {
							output.println("</ul>");
							break;
						}
					}
					// For extra credit print ordered list <ol> when the string starts with *
				} else if(line.substring(0,1).equals("*")) {
						output.println("<ol>");
						
						while (line.substring(0,1).equals("*") != false) {
							output.println("<li>" + line.substring(1)+"</li>");
							line = readfile.nextLine();
							
							// Print </ol> to end the list form
							if (line.length() == 0 || line.substring(0,1).equals("*") == false) {
								output.println("</ol>");
								break;
							}
						}
				// If the line is a empty line then print <p>
				} else if (line.length() == 0) {
				output.println("<p>");
				
				// For the next line print <br />
				} else  {
					output.println(line + "<br />");
				}
			}	
		}
		
		// Hyper Link
		
		output.println("<a href='http://www.cis.temple.edu/~jfiore/2023/spring/1068'> Class </a> ");
		
		// Print </body> and </html> to end the file.
		output.println("</body>");
		output.println("</html>");
		
		
	}
}
			

