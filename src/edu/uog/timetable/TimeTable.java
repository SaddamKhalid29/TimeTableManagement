package edu.uog.timetable;
import edu.uog.teacher.*;
import edu.uog.Room.*;
public class TimeTable {

	 public static String csvFile="D:\\TimTable.csv";
	 private int TimeTable_ID;
	 private TeacherCourse TeacherCourse_ID;
	 private TimeSlot TimeSlot_ID;
	 private Room Room_ID;
	/**
	 * @return the timeTable_ID
	 */
	public int getTimeTable_ID() {
		return TimeTable_ID;
	}
	/**
	 * @param timeTable_ID the timeTable_ID to set
	 */
	public void setTimeTable_ID(int timeTable_ID) {
		TimeTable_ID = timeTable_ID;
	}
	/**
	 * @return the teacherCourse_ID
	 */
	public TeacherCourse getTeacherCourse_ID() {
		return TeacherCourse_ID;
	}
	/**
	 * @param teacherCourse_ID the teacherCourse_ID to set
	 */
	public void setTeacherCourse_ID(TeacherCourse teacherCourse_ID) {
		TeacherCourse_ID = teacherCourse_ID;
	}
	/**
	 * @return the timeSlot_ID
	 */
	public TimeSlot getTimeSlot_ID() {
		return TimeSlot_ID;
	}
	/**
	 * @param timeSlot_ID the timeSlot_ID to set
	 */
	public void setTimeSlot_ID(TimeSlot timeSlot_ID) {
		TimeSlot_ID = timeSlot_ID;
	}
	/**
	 * @return the room_ID
	 */
	public Room getRoom_ID() {
		return Room_ID;
	}
	/**
	 * @param room_ID the room_ID to set
	 */
	public void setRoom_ID(Room room_ID) {
		Room_ID = room_ID;
	}
	public void setROOM_TYPE(String rOOM_TYPE) {
		ROOM_TYPE = rOOM_TYPE;
	}
	public String toString() {
		String str=null;
		str=this.TimeTable_ID
				+","+this.TeacherCourse_ID.getTEACHERCOURSE_ID()
				+","+this.TimeSlot_ID.getTIMESLOT_ID()
				+","+this.Room_ID.getROOM_ID()
				
		return str;
		
	}
		
}
