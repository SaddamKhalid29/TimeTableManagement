package edu.uog.course;

import edu.uog.student.StudentCourse;

public class Course {
   
  public static String csvFile="D:\\Courses.csv";
   private int Course_ID;
   private String COURSE_CODE;
   private String COURSE_TITLE;
   private String COURSE_DESC;
   private int COURSE_CREDITHOURS;
   private  Course COURSEPRERQUIST_ID;
    
	
	/**
	 * @return the course_ID
	 */
	public int getCourse_ID() {
		return Course_ID;
	}
	/**
	 * @param course_ID the course_ID to set
	 */
	public void setCourse_ID(int course_ID) {
		Course_ID = course_ID;
	}
	/**
	 * @return the cOURSE_CODE
	 */
	public String getCOURSE_CODE() {
		return COURSE_CODE;
	}
	/**
	 * @param cOURSE_CODE the cOURSE_CODE to set
	 */
	public void setCOURSE_CODE(String cOURSE_CODE) {
		COURSE_CODE = cOURSE_CODE;
	}
	/**
	 * @return the cOURSE_TITLE
	 */
	public String getCOURSE_TITLE() {
		return COURSE_TITLE;
	}
	/**
	 * @param cOURSE_TITLE the cOURSE_TITLE to set
	 */
	public void setCOURSE_TITLE(String cOURSE_TITLE) {
		COURSE_TITLE = cOURSE_TITLE;
	}
	/**
	 * @return the cOURSE_DESC
	 */
	public String getCOURSE_DESC() {
		return COURSE_DESC;
	}
	/**
	 * @param cOURSE_DESC the cOURSE_DESC to set
	 */
	public void setCOURSE_DESC(String cOURSE_DESC) {
		COURSE_DESC = cOURSE_DESC;
	}
	/**
	 * @return the cOURSE_CREDITHOURS
	 */
	public int getCOURSE_CREDITHOURS() {
		return COURSE_CREDITHOURS;
	}
	/**
	 * @param cOURSE_CREDITHOURS the cOURSE_CREDITHOURS to set
	 */
	public void setCOURSE_CREDITHOURS(int cOURSE_CREDITHOURS) {
		COURSE_CREDITHOURS = cOURSE_CREDITHOURS;
	}
	/**
	 * @return the cOURSEPRERQUIST_ID
	 */
	public StudentCourse getCOURSEPRERQUISt_ID() {
		return COURSEPRERQUIST_ID;
	}
	/**
	 * @param prerequistcourse the cOURSEPRERQUIST_ID to set
	 */
	public void setCOURSEPRERQUISt_ID(Course prerequistcourse) {
		COURSEPRERQUIST_ID = prerequistcourse;
	}
	public String toString() {
		String str=null;
		str=this.Course_ID
				+","+this.COURSE_CODE
				+","+this.COURSE_TITLE
				+","+this.COURSE_DESC
				+","+this.COURSE_CREDITHOURS
				+","+this.COURSEPRERQUIST_ID;
		return str;
		
	}
	
    
	
}