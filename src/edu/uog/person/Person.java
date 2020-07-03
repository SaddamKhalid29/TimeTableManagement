package edu.uog.person;

public class Person {
public static String csvFile="D:\\Persons.csv";
private int PERSON_ID;

private String TITLE;

private String FORE_NAME;

private String SUR_NAME;

protected int AGE;

private String GENDER;

private String ADDRESS;

/**
 * @return the pERSON_ID
 */
public int getPERSON_ID() {
	return PERSON_ID;
}

/**
 * @param pERSON_ID the pERSON_ID to set
 */
public void setPERSON_ID(int pERSON_ID) {
	PERSON_ID = pERSON_ID;
}

/**
 * @return the tITLE
 */
public String getTITLE() {
	return TITLE;
}

/**
 * @param tITLE the tITLE to set
 */
public void setTITLE(String tITLE) {
	TITLE = tITLE;
}

/**
 * @return the fORE_NAME
 */
public String getFORE_NAME() {
	return FORE_NAME;
}

/**
 * @param fORE_NAME the fORE_NAME to set
 */
public void setFORE_NAME(String fORE_NAME) {
	FORE_NAME = fORE_NAME;
}

/**
 * @return the sUR_NAME
 */
public String getSUR_NAME() {
	return SUR_NAME;
}

/**
 * @param sUR_NAME the sUR_NAME to set
 */
public void setSUR_NAME(String sUR_NAME) {
	SUR_NAME = sUR_NAME;
}

/**
 * @return the aGE
 */
public int getAGE() {
	return AGE;
}

/**
 * @param aGE the aGE to set
 */
public void setAGE(int aGE) {
	AGE = aGE;
}

/**
 * @return the gENDER
 */
public String getGENDER() {
	return GENDER;
}

/**
 * @param gENDER the gENDER to set
 */
public void setGENDER(String gENDER) {
	GENDER = gENDER;
}

/**
 * @return the aDDRESS
 */
public String getADDRESS() {
	return ADDRESS;
}

/**
 * @param aDDRESS the aDDRESS to set
 */
public void setADDRESS(String aDDRESS) {
	ADDRESS = aDDRESS;
}

public String toString() {
	String str=null;
	str = this.PERSON_ID
			+ "," + this.FORE_NAME
			+ "," + this.SUR_NAME
			+ "," + this.AGE
			+ "," + this.GENDER
			+ "," + this.ADDRESS;
	return str;
	
	
}


}
