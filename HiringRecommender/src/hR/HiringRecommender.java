package hR;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/*
 * 1. What criteria did you select? Why?
 * - I picked candidates based on their GPA, Languages that they can use, and their major.
 * - I am looking for candidates who have at least 3.7 GPA, know how to use java, and majoring in CIS, CS, or IT.
 * 2. What sorts of candidates do we miss when we automate hiring decisions in this way?
 * - My program picks a candidate based on the order of list so, if my program pick the first 10 candidates, it does not compare other candidates.
 */
public class HiringRecommender {
	public static void main(String ares[]) throws IOException {
		System.out.println(Arrays.toString(importfile()));	
	}
	
	public static String[] importfile() throws IOException {
		// read the file
		Scanner readfile = new Scanner(new File("applicant_data.csv"));
		Path path = Paths.get("applicant_data.csv");
		int count = (int)Files.lines(path).count() -1;
		// candidates
		String[] candidates = new String[10];
		
		//fields
		String[]names = new String[count];
		float[] gpa = new float[count];
		String[] languages = new String[count];
		String[] major	 = new String[count];
		
		while (readfile.hasNextLine()) {
			String line = readfile.nextLine();
			
			
			for(int i = 0; i < count;i++) {
				line = readfile.nextLine();
				//separate the string to sort the info into separate fields.
				String[] info = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
				
				names[i] = info[0] + " "+ info[1];
				
				
				gpa[i] = Float.parseFloat(info[8]);
				
				languages[i] = info[7];
				
				major[i] = info[9];
				
			}
			
		}
		// check whether the candidate satisfy the criteria
		int j = 0;
		for (int i = 0; i < count ; i++) {
			if(j<10) {
				// CIS, CS, and IT majors
				if(checkGPA(gpa, i) && checkMajor(major, i) && checkLanguage(languages,i)) {
					//If a candidate is majoring in CIS, CS, or IT, I prefer him to know at least 2 languages including java.
					int numLang = languages[i].split(" ").length;
					if (numLang > 2) {
						
						candidates[j] = names[i];
						j++;
						
					}
					//Non- CIS, CS, or IT major
				} else if(checkGPA(gpa, i) && checkLanguage(languages,i)) {
					// If a candidate is not majoring in CIS, CS< or IT, I do not require him know more language more than java
						candidates[j] = names[i];
						j++;	
				} 
			}
			
		}
		return candidates;	
		
	}
	//Check whether the candidate has 3.7 or above GPA
	public static boolean checkGPA(float[] gpa,int i) {
		if(3.7 <= gpa[i]) {
			return true;
		} else {
			return false;
		}
		
	}
	//Check whether the candidate is majoring in CIS, CS, or IT
	public static boolean checkMajor(String[] major, int i) {
		if (major[i].equals("CIS") || major[i].equals("CS") || major[i].equals("IT")) {
			return true;
		}
		return false;
	}
	//Check whether the candidate know about java
	public static boolean checkLanguage(String[] lan, int i) {
		String[] language = lan[i].split(" ");
		for(int j =0; j< language.length;j++) {
			if (language[j].equals("Java")) {
				return true;
			}
		}
		return false;
	}
	
}

