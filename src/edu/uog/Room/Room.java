package edu.uog.Room;

public class Room {

	 public static String csvFile="D:\\Rooms.csv";
	 private int ROOM_ID;
	 private String ROOM_NAME;
	 private int ROOM_FLOUR;
	 private int ROOM_CAPACITY;
	 private String ROOM_TYPE;

	/**
	 * @return the rOOM_ID
	 */
	public int getROOM_ID() {
		return ROOM_ID;
	}
	/**
	 * @param rOOM_ID the rOOM_ID to set
	 */
	public void setROOM_ID(int rOOM_ID) {
		ROOM_ID = rOOM_ID;
	}

	/**
	 * @return the rOOM_NAME
	 */
	public String getROOM_NAME() {
		return ROOM_NAME;
	}
	/**
	 * @param rOOM_NAME the rOOM_NAME to set
	 */
	public void setROOM_NAME(String rOOM_NAME) {
		ROOM_NAME = rOOM_NAME;
	}
	/**
	 * @return the rOOM_FLOUR
	 */
	public int getROOM_FLOUR() {
		return ROOM_FLOUR;
	}
	/**
	 * @param rOOM_FLOUR the rOOM_FLOUR to set
	 */
	public void setROOM_FLOUR(int rOOM_FLOUR) {
		ROOM_FLOUR = rOOM_FLOUR;
	}
	/**
	 * @return the rOOM_CAPACITY
	 */
	public int getROOM_CAPACITY() {
		return ROOM_CAPACITY;
	}
	/**
	 * @param rOOM_CAPACITY the rOOM_CAPACITY to set
	 */
	public void setROOM_CAPACITY(int rOOM_CAPACITY) {
		ROOM_CAPACITY = rOOM_CAPACITY;
	}

	/**
	 * @return the rOOM_TYPE
	 */
	public String getROOM_TYPE() {
		return ROOM_TYPE;
	}
	/**
	 * @param rOOM_TYPE the rOOM_TYPE to set
	 */
	public void setROOM_TYPE(String rOOM_TYPE) {
		ROOM_TYPE = rOOM_TYPE;
	}
	public String toString() {
		String str=null;
		str=this.ROOM_ID
				+","+this.ROOM_NAME
				+","+this.ROOM_FLOUR
				+","+this.ROOM_CAPACITY
				+","+this.ROOM_TYPE;
		return str;
		
	}
	public String getFilepath() {
		return null;
		
	}
	
	
	
}
