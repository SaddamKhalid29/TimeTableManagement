package edu.uog.student;
import edu.uog.person.*;
import edu.uog.campus.Semester;
import edu.uog.course.Course;

public class StudentCourse {
	public static String csvFile = "D:\\StudentCourses.csv";

	 private int STUDENTCOURSE_ID;
	 private Course COURSE_ID;
	 private Student STUDENT_ID;
	 private Semester SEMESTER_ID;
	 private String SECTION;
	
	/**
	 * @return the sTUDENTCOURSE_ID
	 */
	public int getSTUDENTCOURSE_ID() {
		return STUDENTCOURSE_ID;
	}
	/**
	 * @param sTUDENTCOURSE_ID the sTUDENTCOURSE_ID to set
	 */
	public void setSTUDENTCOURSE_ID(int sTUDENTCOURSE_ID) {
		STUDENTCOURSE_ID = sTUDENTCOURSE_ID;
	}
	/**
	 * @return the cOURSE_ID
	 */
	public Course getCOURSE_ID() {
		return COURSE_ID;
	}
	/**
	 * @param cOURSE_ID the cOURSE_ID to set
	 */
	public void setCOURSE_ID(Course cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}
	/**
	 * @return the sTUDENT_ID
	 */
	public Student getSTUDENT_ID() {
		return STUDENT_ID;
	}
	/**
	 * @param sTUDENT_ID the sTUDENT_ID to set
	 */
	public void setSTUDENT_ID(Student sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}
	
	/**
	 * @return the sEMESTER_ID
	 */
	public Semester getSEMESTER_ID() {
		return SEMESTER_ID;
	}
	/**
	 * @param sEMESTER_ID the sEMESTER_ID to set
	 */
	public void setSEMESTER_ID(Semester sEMESTER_ID) {
		SEMESTER_ID = sEMESTER_ID;
	}
	/**
	 * @return the sECTION
	 */
	public String getSECTION() {
		return SECTION;
	}
	/**
	 * @param sECTION the sECTION to set
	 */
	public void setSECTION(String sECTION) {
		SECTION = sECTION;
	}
	public String toString() {
		String str = null;
		
		str = this.STUDENTCOURSE_ID
				+ "," + this.SEMESTER_ID.getSemester_ID()
				+ "," + this.COURSE_ID.getCourse_ID()
				+ "," + this.STUDENT_ID.getPERSON_ID()
				+ "," + this.SECTION;
		
		return str;
	}
}
