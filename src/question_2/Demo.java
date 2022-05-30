package question_2;

import java.util.*;
public class Demo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of students");
		int l= scan.nextInt();
		Student [] students = new Student[l];
		
		for(int i =0;i<l;i++) {
			System.out.println("Enter details of Student :"+(i+1));
			System.out.println("Enter student roll :");
			int sroll= scan.nextInt();
			
			System.out.println("Enter Student name");
			String sName= scan.next();
			
			System.out.println("Enter Student Address");
			String sAdd= scan.next();
			
			System.out.println("Enter student marks");
			int sMarks= scan.nextInt();
			
			Student s= new Student(sroll, sName, sAdd, sMarks);
			students[i]=s;
			System.out.println("-------");
		}
		float sum=0;
		for(int i = 0;i<l;i++)
		{
			System.out.println("Details of Student "+(i+1));
			System.out.println("Student roll no :"+students[i].getRoll());
			System.out.println("Student Name :"+students[i].getName());
			System.out.println("Student Address :"+students[i].getAddress());
			System.out.println("Student marks :"+students[i].getMarks());
			sum+=students[i].getMarks();
			System.out.println("----------");
		}
		System.out.println("Average of marks of all students"+(sum/l));

	}

}
