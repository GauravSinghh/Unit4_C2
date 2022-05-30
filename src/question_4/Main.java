package question_4;
import java.util.*;
public class Main {

	public static Person generatePerson(Person person) {
		Scanner scan = new Scanner(System.in);
		if(person instanceof Student)
		{
			
			Person s1 = new Student();
			Student s =(Student)s1;
			System.out.println("Enter Student name");
			s.name=scan.next();
			
			System.out.println("Enter course");
			s.courseEnrolled=scan.next();
			
			System.out.println("Enter student Id");
			
			s.studentId=scan.nextInt();
			
			System.out.println("Enter course fee");
			s.courseFee=scan.nextInt();
			
			System.out.println("Enter gender");
			s.gender=scan.next();
			s.getAddress();
			return s;
		}
		else if(person instanceof Teacher)
		{
			Person t1 = new Teacher();
			Teacher t =(Teacher)t1;
			System.out.println("Enter name");
			t.name=scan.next();
			
			System.out.println("Enter id");
			t.instructorId=scan.nextInt();
			
			System.out.println("Enter salary");
			t.salary=scan.nextInt();
			System.out.println("Enter gender");
			t.gender=scan.next();
			
		
			t.getAddress();
			return t;
		}
		else
		{
			return null;
		}
	}
	public static void main(String[] args) {

		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Teacher());

		System.out.println(newStudent);
		System.out.println(newTeacher);
		}
}

//Sample OutPut:
//Student [studentId=1, courseFee=300000, courseEnrolled=JA111, address=Address
//[city=Chennai, state=TN, pincode=60001]]
//
//Instructor [instructorId =456, salary=45612, address=Address [city=Chennai,
//state=TN, pinCode=60001]]
