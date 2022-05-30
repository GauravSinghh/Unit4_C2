package question_4;

public class Teacher extends Person {

	int instructorId;
	int salary;
	@Override
	public String toString() {
		return "Teacher [instructorId=" + instructorId + ", salary=" + salary + getAddress() +"]";
	}
	

}
