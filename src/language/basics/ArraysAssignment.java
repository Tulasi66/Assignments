package language.basics;

public class ArraysAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						
		//sem1
		//subjects = {"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."}
		//marks = {"Pass(78)","Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)"}
		
		//sem2
		//subjects = {"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"} 
		//marks = {"Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)"}
		
		//sem3
		//subjects = {"Data Structures","Discrete Mathematics","Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."}
		//marks = {"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)"}
		
		//sem4
		//subjects = {"Algorithms","Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"}
		//marks = {"Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)"}
		
		//sem5
		//subjects = {"Probability & Stats", "Machine Learning", "Compiler Design" ,"Theory of Computation", "Embedded Systems", "Computer Graphics"}
		//marks = {"Pass(86)", "Pass(88)", "Pass(84)","Pass(95)", "Pass(73)","Pass(90)"} 
		
	
	//5semesters, 6 subjects and marks in each semester, and 2rows for actual values - one row for subjects and one for marks
		String sem[][][] = new String[5][6][2];

		// Seme 1 //0
		sem[0][0][0] = "Mathematics I";       sem[0][0][1] = "Pass(78)";
		sem[0][1][0] = "Physics";             sem[0][1][1] = "Pass(85)";
		sem[0][2][0] = "Chemistry";           sem[0][2][1] = "Fail(21)";
		sem[0][3][0] = "Computer Programming";sem[0][3][1] = "Pass(74)";
		sem[0][4][0] = "Engineering Drawing"; sem[0][4][1] = "Pass(88)";
		sem[0][5][0] = "Basic Electrical Eng.";sem[0][5][1] = "Pass(79)";

		// Sem 2 //1
		sem[1][0][0] = "Mathematics II";      sem[1][0][1] = "Pass(82)";
		sem[1][1][0] = "Mechanics";           sem[1][1][1] = "Pass(77)";
		sem[1][2][0] = "Environmental Sci.";  sem[1][2][1] = "Pass(93)";
		sem[1][3][0] = "Basic Electronics";   sem[1][3][1] = "Fail(19)";
		sem[1][4][0] = "Engineering Physics"; sem[1][4][1] = "Fail(24)";
		sem[1][5][0] = "Engineering Graphics";sem[1][5][1] = "Pass(90)";
 
		// Seme 3   //2
		sem[2][0][0] = "Data Structures";     sem[2][0][1] = "Pass(88)";
		sem[2][1][0] = "Discrete Mathematics";sem[2][1][1] = "Pass(81)";
		sem[2][2][0] = "Digital Electronics"; sem[2][2][1] = "Pass(76)";
		sem[2][3][0] = "Operating Systems";   sem[2][3][1] = "Fail(32)";
		sem[2][4][0] = "Signals and Systems"; sem[2][4][1] = "Pass(85)";
		sem[2][5][0] = "Object-Oriented Prog.";sem[2][5][1] = "Pass(78)";

		// Sem 4    //3
		sem[3][0][0] = "Algorithms";          sem[3][0][1] = "Pass(91)";
		sem[3][1][0] = "Computer Networks";   sem[3][1][1] = "Pass(73)";
		sem[3][2][0] = "Database Systems";    sem[3][2][1] = "Fail(19)";
		sem[3][3][0] = "Microprocessors";     sem[3][3][1] = "Pass(80)";
		sem[3][4][0] = "Communication Eng.";  sem[3][4][1] = "Pass(76)";
		sem[3][5][0] = "Software Engineering";sem[3][5][1] = "Pass(87)";

		// Sem 5     //4
		sem[4][0][0] = "Probability & Stats"; sem[4][0][1] = "Pass(86)";
		sem[4][1][0] = "Machine Learning";    sem[4][1][1] = "Pass(88)";
		sem[4][2][0] = "Compiler Design";     sem[4][2][1] = "Pass(84)";
		sem[4][3][0] = "Theory of Computation";sem[4][3][1] = "Pass(95)";
		sem[4][4][0] = "Embedded Systems";    sem[4][4][1] = "Pass(73)";
		sem[4][5][0] = "Computer Graphics";   sem[4][5][1] = "Pass(90)";
		
		
		
		
	   //Print Semester 2 Subject 4 and Subject 5 names. 
		System.out.println("Semester 2 Subject 4 :"+sem[1][3][0]);
		System.out.println("Semester 2 Subject 5 :"+sem[1][4][0]);
		
		
	  //Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Status/Marks of Semester 4 Subject 3 :"+sem[3][2][1]);
		System.out.println("Status/Marks of Semester 4 Subject 6 :"+sem[3][5][1]);

	}

}
