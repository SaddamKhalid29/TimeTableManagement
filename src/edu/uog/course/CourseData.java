package edu.uog.course;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.uog.Room.Room;
public class CourseData {
private static List<Course> courses;
@SuppressWarnings("resource")
public static List<Course> findAll(){
	List<Course> courses =new ArrayList<Course>();
	String line;
	try {
		BufferedReader bufferreader = new BufferedReader(new FileReader( Course.csvFile));
		while ((line = bufferreader.readLine()) != null) {
			Course course = new Course();
			Course prerequistcourse = new Course();
			String[] courseRow = line.split(",");
			
			course.setCourse_ID(Integer.parseInt(courseRow[0]));
			course.setCOURSE_CODE(courseRow[1]);
			course.setCOURSE_TITLE(courseRow[2]);
			course.setCOURSE_DESC(courseRow[3]);
			course.setCOURSE_CREDITHOURS(Integer.parseInt(courseRow[4]));
			course.setCOURSEPRERQUISt_ID(prerequistcourse);
			
			courses.add(course);

		}
		}
catch (IOException e) {
			
			e.printStackTrace();
		}

	
	return courses;
}
@SuppressWarnings("resources")
public static Course findOne(int Course_ID) {
	String line;
	try {
		BufferedReader bufferreader = new BufferedReader(new FileReader(Course.csvFile));
		while((line= bufferreader.readLine())!=null) {
			Course course= new Course();
			Course prerequistcourse = new Course();
			
			String[] courseRow= line.split(",");
			if(Integer.parseInt(courseRow[0])==Course_ID) {
				course.setCourse_ID(Integer.parseInt(courseRow[0]));
				course.setCOURSE_CODE(courseRow[1]);
				course.setCOURSE_TITLE(courseRow[2]);
				course.setCOURSE_DESC(courseRow[3]);
				course.setCOURSE_CREDITHOURS(Integer.parseInt(courseRow[4]));
				if(courseRow.length>5) {
					CourseData cdata=new CourseData();
					prerequistcourse=cdata.findOne(Integer.parseInt(courseRow[5]));
					course.setCOURSEPRERQUISt_ID(prerequistcourse);

				}
				return course;
			}

		}
	}catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	
	
}
@SuppressWarnings("resources")
public static Course findByCode(String COURSE_CODE ) {
	String line;
	try {
		BufferedReader bufferreader = new BufferedReader(new FileReader(Course.csvFile));
		while((line=bufferreader.readLine())!=null) {
			Course course =new Course();
			Course prerequistcourse= new Course();
			String[] courseRow=line.split(",");
			if(courseRow[1].contains(COURSE_CODE)) {
				course.setCourse_ID(Integer.parseInt(courseRow[0]));
				course.setCOURSE_CODE(courseRow[1]);
				course.setCOURSE_TITLE(courseRow[2]);
				course.setCOURSE_DESC(courseRow[3]);
				course.setCOURSE_CREDITHOURS(Integer.parseInt(courseRow[4]));
				
				if(courseRow.length>5) {
					CourseData cdata = new CourseData();
					
					prerequistcourse=cdata.findOne(Integer.parseInt(courseRow[5]));
					course.setCOURSEPRERQUISt_ID(prerequistcourse);
				}
				return course;
		
			}
		}
		}
	catch (IOException e) {
			
			e.printStackTrace();
		}
	
	return null;

	}
@SuppressWarnings("resource")
public static List<Course> search(String search) {
	List<Course> courses = new ArrayList<Course>();
	String line;
	try {
		BufferedReader bufferreader = new BufferedReader(new FileReader(Course.csvFile));
		while ((line = bufferreader.readLine()) != null) {
			Course course = new Course();
			String[] courseRow = line.split(",");
			if (courseRow[1].contains(search) == true) {
				course.setCourse_ID(Integer.parseInt(courseRow[1]));
				course.setCOURSE_CODE(courseRow[2]);
				course.setCOURSE_TITLE(courseRow[2]);
				course.setCOURSE_DESC(courseRow[3]);
				course.setCOURSE_CREDITHOURS(Integer.parseInt(courseRow[4]));
				
				courses.add(course);
				
			}
		}
	}
	catch (IOException e) {
		
		e.printStackTrace();
	}
	return courses;
	
}
@SuppressWarnings("resource")
public static Course Save(Course course) {
	FileWriter filewriter;
	try {
	
	filewriter = new FileWriter(Course.csvFile);
	for(int i=0;i<courses.size();i++) {
		filewriter.append(courses.get(i).toString());
		filewriter.append("\n");
	}
	if (courses.size()>0) 
		course.setCourse_ID(courses.get(courses.size()-1).getCourse_ID()+1);
	else
		course.setCourse_ID(1);
	    filewriter.append(course.toString());
	    filewriter.append("\n");
	    filewriter.flush();
	    filewriter.close(); 
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	return course;
}
	

}
