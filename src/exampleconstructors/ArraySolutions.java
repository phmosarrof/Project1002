package exampleconstructors;
// Java program to illustrate creating an array of
// objects

class Student
{
	public int roll_no;
	public String name;
	public int mark;
	Student(int roll_no, String name, int mark)
	{
		this.roll_no = roll_no;
		this.name = name;
		this.mark = mark;
	}
}
// Elements of array are objects of a class Student.

public class ArraySolutions
{
	public static void main (String[] args)
	{
		//Student[] arr; 							 			// declares an Array of integers.
		// arr = new Student[5]; 					 			// allocating memory for 5 objects of type Student.

		Student [] arr = new Student[6];			

		arr[1] = new Student(1,"Arman -"+"Mark-",92); 			 // initialize the first elements of the array
		arr[2] = new Student(2,"Robi  -"+" Mark-",90);				 // initialize the second elements of the array
		arr[3] = new Student(3,"Shikar-"+" Mark-",80);  			 // so on...
		arr[4] = new Student(4,"Ruben -"+" Mark-",78);
		arr[5] = new Student(5,"Mohit -"+" Mark-",70);

		for (int i = 1; i <arr.length; i++)	           			// accessing the elements of the specified array
			System.out.println("Serial No " + i + " : Roll - " +
					arr[i].roll_no +" "+ arr[i].name+ ""+arr[i].mark);
	}
}
