package exampleconstructors;

public class ConstructorExample {

	//private int id;
	int id;
	String empName;  
	public ConstructorExample(int id , String name) {

		//this.id = 79990;
		//this.id = 7790;
this.id = id;
empName = name;
	}
void info() {
	System.out.println("Employee Name :"+empName+" , Emplyee Id :"+id);
	
}
	public static void main(String[] args) {

		ConstructorExample Obj1 = new ConstructorExample(7990," Robin");
		ConstructorExample Obj2 = new ConstructorExample(7991, " Avi");
		
		//System.out.println("Emplyee Id : "+Obj1.id+ " Employee Name :" +Obj1.empName);
		//System.out.println("Emplyee Id : "+Obj2.id+ " Employee Name :" +Obj2.empName);
		
		Obj1.info();
		Obj2.info();


	}

}
