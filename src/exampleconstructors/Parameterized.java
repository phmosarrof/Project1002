package exampleconstructors;

public class Parameterized {
	
	 int car;
	//default constructor
	Parameterized(){
		
		car = 10000;
	}
	//parameterized constructor

	public Parameterized(int car)
	{
		this.car = car;
	}
	public int Value()
	{
	return car;
	}
	public static void main(String[] args) {
		
		Parameterized obj = new Parameterized();
		Parameterized obj2 = new Parameterized(20000);
		
		System.out.println("Car New  is: "+obj.car);
		System.out.println("Car Old is: "+obj2.car);
		System.out.println("Car New  value from value method : "+obj2.Value());
		System.out.println("Car old car value from value method : "+obj.Value());

	}

}
