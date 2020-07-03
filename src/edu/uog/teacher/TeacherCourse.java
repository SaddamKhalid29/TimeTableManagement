package edu.uog.teacher;

import edu.uog.course.Course;

public class TeacherCourse {
	public static String csvFile = "D:\\TeacherCourses.csv";
	 private  int TEACHERCOURSE_ID;
	 private Course COURSE_ID;
	 private Teacher TEACHER_ID;
	 private String SECTION;
	 
	/**
	 * @return the TEACHERCOURSE_ID
	 */
	public int getTEACHERCOURSE_ID() {
		return TEACHERCOURSE_ID;
	}
	/**
	 * @param TEACHERCOURSE_ID the TEACHERCOURSE_ID to set
	 */
	public void setTEACHERCOURSE_ID(int TEACHERCOURSE_ID) {
		TEACHERCOURSE_ID = TEACHERCOURSE_ID;
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
	 * @return the tEACHER_ID
	 */
	public Teacher getTEACHER_ID() {
		return TEACHER_ID;
	}
	/**
	 * @param tEACHER_ID the tEACHER_ID to set
	 */
	public void setTEACHER_ID(Teacher tEACHER_ID) {
		TEACHER_ID = tEACHER_ID;
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
		
		str = this.TEACHERCOURSE_ID
				
				+ "," + this.COURSE_ID.getCourse_ID()
				+ "," + this.TEACHER_ID.getPERSON_ID()
				+ "," + this.SECTION;
		
		return str;
	}
	
}
