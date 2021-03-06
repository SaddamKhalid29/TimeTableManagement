package edu.uog.student;

import java.io.BufferedReader;


import java.io.FileWriter;

import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;

import java.util.List;

import edu.uog.campus.Semester;
import edu.uog.course.CourseData;
import edu.uog.course.Course;
public class StudentCourseData {
	@SuppressWarnings("resource")
	public List<StudentCourse > findAll()  {
		List<StudentCourse > studentcourses = new ArrayList<StudentCourse >();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(StudentCourse .csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				StudentCourse studentcourse= new StudentCourse();
				
				
				String[] studentcourseRow = line.split(",");
				
				studentcourse.setSTUDENTCOURSE_ID(Integer.parseInt(studentcourseRow[0]));
				studentcourse.setCOURSE_ID(CourseData.findOne(Integer.parseInt(studentcourseRow[1])));
				
				studentcourses.add(studentcourse);
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return studentcourses;
	}


	
	
	public float calculateSemesterCreditHourByStudent(Student student_ID, Semester semester_ID) {

		return 1;
	}
	
}
