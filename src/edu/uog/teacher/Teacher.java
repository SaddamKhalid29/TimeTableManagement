package edu.uog.teacher;
import edu.uog.person.Person;     

public class Teacher extends Person {
	 private  int TEACHER_ID;

	/**
	 * @return the tEACHER_ID
	 */
	public int getTEACHER_ID() {
		return TEACHER_ID;
	}

	/**
	 * @param tEACHER_ID the tEACHER_ID to set
	 */
	public void setTEACHER_ID(int tEACHER_ID) {
		TEACHER_ID = tEACHER_ID;
	}
	
	public String toString() {
		String str=null;
		str=""+this.TEACHER_ID;
		
		
		
		return str;
		
	}
}
