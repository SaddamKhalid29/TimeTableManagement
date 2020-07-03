package edu.uog.timetable;

public class WeekDay {
	 private int WEEKDAY_ID;
     private  String WEEKDAY_NAME;
     public WeekDay(int WEEKDAY_ID,String WEEKDAY_NAME) {
    	 this.WEEKDAY_ID=WEEKDAY_ID;
    	 this.WEEKDAY_NAME=WEEKDAY_NAME;
    	 
     }
		/**
		 * @return the wEEKDAY_ID
		 */
		public int getWEEKDAY_ID() {
			return WEEKDAY_ID;
		}
		/**
		 * @param wEEKDAY_ID the wEEKDAY_ID to set
		 */
		public void setWEEKDAY_ID(int wEEKDAY_ID) {
			WEEKDAY_ID = wEEKDAY_ID;
		}
		/**
		 * @return the wEEKDAY_NAME
		 */
		public String getWEEKDAY_NAME() {
			return WEEKDAY_NAME;
		}
		/**
		 * @param wEEKDAY_NAME the wEEKDAY_NAME to set
		 */
		public void setWEEKDAY_NAME(String wEEKDAY_NAME) {
			WEEKDAY_NAME = wEEKDAY_NAME;
		}
		public String toString() {
			String str = null;
			
			str = this.WEEKDAY_ID
					+ "," + this.WEEKDAY_NAME;
			
			return str;
		}
           
}
