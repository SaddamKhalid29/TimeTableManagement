package edu.uog;

import edu.uog.*;
import edu.uog.Room.Room;
import edu.uog.Room.RoomData;
import edu.uog.campus.*;
import edu.uog.course.*;
import edu.uog.person.Person;
import edu.uog.person.PersonData;
import edu.uog.student.Student;
import edu.uog.student.StudentData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimeTableManagement {

	public static void main(String[] args) {

		/*
		 * // Room room = new Room(); // room.setROOM_ID(1); // //
		 * room.setROOM_NAME("CR-01"); // room.setROOM_FLOUR(1); // //
		 * room.setROOM_CAPACITY(60); // room.setROOM_TYPE("Class Room"); // //
		 * System.out.println(room.toString()); RoomData roomdata = new RoomData();
		 * System.out.println("===============================");
		 * System.out.println("***Room Data***");
		 * System.out.println("===============================");
		 * System.out.println("***Find One***"); Room room = roomdata.findOne(3);
		 * System.out.println(room.toString());
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***Find All***");
		 * 
		 * List<Room> rooms = roomdata.findAll(); for (int i = 0; i < rooms.size(); i++)
		 * { System.out.println(rooms.get(i).toString()); }
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***Search***"); rooms = roomdata.search("LR-03"); for
		 * (int i = 0; i < rooms.size(); i++) {
		 * System.out.println(rooms.get(i).toString()); }
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***Save***"); room.setROOM_NAME("LR-07");
		 * room.setROOM_FLOUR(1); room.setROOM_CAPACITY(40);
		 * room.setROOM_TYPE("Lab Room"); room = roomdata.Save(room);
		 * System.out.println(room.toString());
		 * System.out.println("Data of room is Saved");
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***After Saving All Data"); rooms = roomdata.findAll();
		 * for (int i = 0; i < rooms.size(); i++) {
		 * System.out.println(rooms.get(i).toString()); }
		 * 
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 */

		/*
		 * System.out.println("***Course Menu***");
		 * System.out.println("===============================");
		 * System.out.println("==============================="); // CourseData
		 * coursedata=new CourseData();
		 * 
		 * 
		 * System.out.println("***Find One***"); Course course=coursedata.findOne(2);
		 * System.out.println(course.toString());
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***Find All***");
		 * 
		 * List<Course> courses=coursedata.findAll(); for(int i=0;i<courses.size();i++)
		 * { System.out.println(courses.get(i).toString()); } //
		 * System.out.println("==============================="); //
		 * System.out.println("==============================="); //
		 * System.out.println("***Search***"); // courses=coursedata.search("CS-102");
		 * // for(int i=0;i<courses.size();i++) { //
		 * System.out.println(courses.get(i).toString()); // }
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***Save***"); course.setCOURSE_CODE("PKS-100");
		 * course.setCOURSE_TITLE("Pak Studies");
		 * course.setCOURSE_DESC("Pakistan Studies"); course.setCOURSE_CREDITHOURS(2);
		 * course.setCOURSEPRERQUISt_ID(null); course=coursedata.Save(course);
		 * System.out.println(course.toString());
		 * System.out.println("Data of Course is successfully saved");
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***After Saving All Data***");
		 * courses=coursedata.findAll(); for(int i=0;i<courses.size();i++) {
		 * System.out.println(courses.get(i).toString()); }
		 * 
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***Person Data***");
		 * System.out.println("==============================="); PersonData
		 * persondata=new PersonData(); System.out.println("***Find One***"); Person
		 * person=persondata.findOne(1); System.out.println(person.toString());
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***Find All***"); List<Person>
		 * persons=persondata.findAll(); for(int i=0;i<persons.size();i++) {
		 * System.out.println(persons.get(i).toString());
		 * 
		 * } System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***Search***"); persons=persondata.search("Dr."); for(int
		 * i=0;i<persons.size();i++) { System.out.println(persons.get(i).toString()); }
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***Save***"); person.setTITLE("Fishman");
		 * person.setFORE_NAME("Arslan"); person.setSUR_NAME("Asfar");
		 * person.setAGE(22); person.setGENDER("M"); person.setADDRESS("Kotla");
		 * person=persondata.Save(person); System.out.println(person.toString());
		 * System.out.println("Data of Person is Saved");
		 * System.out.println("===============================");
		 * System.out.println("===============================");
		 * System.out.println("***After Saving All Data"); persons=persondata.findAll();
		 * for(int i=0;i<persons.size();i++) {
		 * System.out.println(persons.get(i).toString()); }
		 * 
		 */
		StudentData studentdata = new StudentData();
		System.out.println("===============================");
		System.out.println("***Student Data***");
		System.out.println("===============================");
		System.out.println("***Find One***");
		Student student = studentdata.findOne(5);
		System.out.println(student.toString());
		System.out.println("===============================");
		System.out.println("===============================");
		System.out.println("***Find All***");
		List<Student> students = studentdata.findAll();
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());

		}
		System.out.println("===============================");
		System.out.println("===============================");
		System.out.println("***Search***");
		students = studentdata.search("Shiza");
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
		System.out.println("===============================");
		System.out.println("===============================");
		System.out.println("***Save***");
		student.setSTUDENT_ID(11);
		student.setPERSON_ID(11);
		student.setFORE_NAME("ALi");
		student.setSUR_NAME("Hassan");
		student.setSTUDENT_ROLLNO("17307-321");
		student.setSTUDY_PROGRAM("BS-CS");
		student.setSTUDY_YEAR("2017");
		student.setAGE(20);
		student.setGENDER("Male");
		student = studentdata.Save(student);
		System.out.println(student.toString());
		System.out.println("Data of student is Saved");
		System.out.println("===============================");
		System.out.println("===============================");
		System.out.println("***After Saving All Data");
		students = studentdata.findAll();
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).toString());

		}

	}

}
