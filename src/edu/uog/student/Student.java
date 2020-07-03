package edu.uog.student;

import edu.uog.person.*;;

public class Student extends Person {
	public static String csvFile="D:\\Students.csv" ;
	 private int STUDENT_ID;

	 private String STUDENT_ROLLNO;
	 private String STUDY_PROGRAM;
	 private String STUDY_YEAR;
	
	/**
	 * @return the sTUDENT_ID
	 */
	public int getSTUDENT_ID() {
		return STUDENT_ID;
	}
	/**
	 * @param sTUDENT_ID the sTUDENT_ID to set
	 */
	public void setSTUDENT_ID(int sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}
	
	
	
	/**
	 * @return the sTUDENT_ROLLNO
	 */
	public String getSTUDENT_ROLLNO() {
		return STUDENT_ROLLNO;
	}
	/**
	 * @param sTUDENT_ROLLNO the sTUDENT_ROLLNO to set
	 */
	public void setSTUDENT_ROLLNO(String sTUDENT_ROLLNO) {
		STUDENT_ROLLNO = sTUDENT_ROLLNO;
	}
	/**
	 * @return the sTUDY_PROGRAM
	 */
	public String getSTUDY_PROGRAM() {
		return STUDY_PROGRAM;
	}
	/**
	 * @param sTUDY_PROGRAM the sTUDY_PROGRAM to set
	 */
	public void setSTUDY_PROGRAM(String sTUDY_PROGRAM) {
		STUDY_PROGRAM = sTUDY_PROGRAM;
	}
	/**
	 * @return the sTUDY_YEAR
	 */
	public String getSTUDY_YEAR() {
		return STUDY_YEAR;
	}
	/**
	 * @param sTUDY_YEAR the sTUDY_YEAR to set
	 */
	public void setSTUDY_YEAR(String sTUDY_YEAR) {
		STUDY_YEAR = sTUDY_YEAR;
	}
	public String toString() {
		String str=null;
		str = this.STUDENT_ID
				+","+this.getPERSON_ID()
				+","+this.getFORE_NAME()
				+","+this.getSUR_NAME()
				+ "," + this.STUDENT_ROLLNO
				+ "," + this.STUDY_PROGRAM
				+ "," + this.STUDY_YEAR
				+","+this.getAGE()
				+","+this.getGENDER();
		
		return str;
	}
	
}
