package exampleconstructors;
//Parent class or Superclass or base class
class Superclass
{
	int num = 100;
}
//Child class or subclass or derived class

class Subclass extends Superclass
{
	/* The same variable num is declared in the Subclass
	 * which is already present in the Superclass
	 */
	int num = 110;

void printNumber(){
	/* Note that instead of writing num we are
	 * writing super.num in the print statement
	 * this refers to the num variable of Superclass
	 */
	System.out.println(super.num);
}
public static void main(String args[]){
	Subclass obj= new Subclass();
	obj.printNumber();
}
}