package question_3;
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of passengers");
		int numberOfPassenger= scanner.nextInt();
		
		System.out.println("Enter and number of kms");
		int numberOfKms = scanner.nextInt();
		//Write logic to get numberOfPassenger and numberOfKms

		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is"+ res);
		}
	
}
