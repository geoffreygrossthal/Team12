

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ASU_Student {

	private int student_ID;
	private String student_email;
	private boolean verifyID;
	
	public ASU_Student(int id, String email) {
		
		student_ID = id;
		student_email = email;
		
	}
	
	public int getID() {
		
		return student_ID;
		
	}
	
	public String getEmail() {
		
		return student_email;
	}
	
	public boolean VerifyId() {
		
		return verifyID;
	}
	
	public void setStudentID(String id){
		//verify student ID 
		//the file should contains all of the student ID
		
		
		try {
			
			File file = new File("filename.txt");
			
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
				
				id = sc.nextLine();
				
			}
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
		
	}


	public String toString() {
		
		return String.format("%s\s%s", student_ID, student_email);
	}

}