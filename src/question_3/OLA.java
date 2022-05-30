package question_3;

public class OLA {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
	
		if(numberOfPassenger<=3)
		{
			HatchBack h1 = new HatchBack();
			h1.setNumberOfKms(numberOfKMs);
			h1.setNumberOfPassenger(numberOfPassenger);
			
			return h1;
		}
		else
		{
			Sedan s1 = new Sedan();
			s1.setNumberOfKms(numberOfKMs);
			s1.setNumberOfPassenger(numberOfPassenger);
			
			return s1;
		}
	}
	
	public int calculateBill(Car car) {
		if(car instanceof HatchBack)
		{
			System.out.println("inside hatch");
			HatchBack h =(HatchBack)car;
			int fare=car.getNumberOfKms()*h.farePerKm;
			return fare;
		}
		else
		{
			System.out.println("inside sedan");
			Sedan s = (Sedan)car;
			int fare = car.getNumberOfKms()*s.farePerKm;
			return fare;
		}
		
	}

}
