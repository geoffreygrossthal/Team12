import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ASU_Student {

	private int student_ID;
	private String student_email;
	
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
	
	public static boolean verifyASUID (int asuID)
	{
		// check from ASUID.txt
		try {
			File file = new File("ASUID.txt");
			try (Scanner infile = new Scanner(file)) {
				int id;
				while (infile.hasNext())
				{
					id = infile.nextInt();
					if (id == asuID){
						return true;
					}
				}
			}

			return false;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}


	public String toString() {
		
		return String.format("%s\\s%s", student_ID, student_email);
	}

}
