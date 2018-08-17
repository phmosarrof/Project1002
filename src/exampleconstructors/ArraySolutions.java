package exampleconstructors;
// Java program to illustrate creating an array of
// objects

class Student
{
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}

												// Elements of array are objects of a class Student.

public class ArraySolutions
{
	public static void main (String[] args)
	{

		//Student[] arr; 						// declares an Array of integers.
		// arr = new Student[5]; 				// allocating memory for 5 objects of type Student.

		Student [] arr = new Student[5];			

		arr[0] = new Student(1,"Arman"); 		// initialize the first elements of the array
		arr[1] = new Student(2,"Robi");			// initialize the second elements of the array
		arr[2] = new Student(3,"Shikar");  		// so on...
		arr[3] = new Student(4,"Ruben");
		arr[4] = new Student(5,"Mohit");

		for (int i = 0; i <arr.length; i++)	           // accessing the elements of the specified array
			System.out.println("Element at " + i + " : " +
					arr[i].roll_no +" "+ arr[i].name);
	}
}
