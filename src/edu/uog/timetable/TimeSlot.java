package edu.uog.timetable;

public class TimeSlot {
    private int TIMESLOT_ID;
    private WeekDay WEEKDAY_ID;
    private String TIMESLOT_START;
    private String TIMESLOT_END;
    public TimeSlot(int TIMESLOT_ID, WeekDay WEEKDAY_ID,String TIMESLOT_START,String TIMESLOT_END ) {
    	this.TIMESLOT_ID=TIMESLOT_ID;
    	this.WEEKDAY_ID=WEEKDAY_ID;
    	this.TIMESLOT_START=TIMESLOT_START;
    	this.TIMESLOT_END=TIMESLOT_END;
    }
	/**
	 * @return the tIMESLOT_ID
	 */
	public int getTIMESLOT_ID() {
		return TIMESLOT_ID;
	}
	/**
	 * @param tIMESLOT_ID the tIMESLOT_ID to set
	 */
	public void setTIMESLOT_ID(int tIMESLOT_ID) {
		TIMESLOT_ID = tIMESLOT_ID;
	}
	/**
	 * @return the wEEKDAY_ID
	 */
	public WeekDay getWEEKDAY_ID() {
		return WEEKDAY_ID;
	}
	/**
	 * @param wEEKDAY_ID the wEEKDAY_ID to set
	 */
	public void setWEEKDAY_ID(WeekDay wEEKDAY_ID) {
		WEEKDAY_ID = wEEKDAY_ID;
	}
	/**
	 * @return the tIMESLOT_START
	 */
	public String getTIMESLOT_START() {
		return TIMESLOT_START;
	}
	/**
	 * @param tIMESLOT_START the tIMESLOT_START to set
	 */
	public void setTIMESLOT_START(String tIMESLOT_START) {
		TIMESLOT_START = tIMESLOT_START;
	}
	/**
	 * @return the tIMESLOT_END
	 */
	public String getTIMESLOT_END() {
		return TIMESLOT_END;
	}
	/**
	 * @param tIMESLOT_END the tIMESLOT_END to set
	 */
	public void setTIMESLOT_END(String tIMESLOT_END) {
		TIMESLOT_END = tIMESLOT_END;
	}
	public String toString() {
		String str = null;
		
		str = this.TIMESLOT_ID+","
		+this.WEEKDAY_ID.getWEEKDAY_ID()
				+","+this.TIMESLOT_START
				+","+this.TIMESLOT_END;
		
		return str;
	}
	
}
