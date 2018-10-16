package exampleconstructors;
class multiDimensional
{
	public static void main(String args[])

	{
		// declaring and initializing 2D array

		int arr[][] = { {2,7,9,8,8},{3,6,1,9,8},{2,7,9,8},{2,7,9,8,9}};

		// printing 2D array

		for (int i=0; i< 4 ; i++)
		{
			for (int j=0; j < 4 ; j++)

				System.out.print(arr[i][j] + " ");

			System.out.println();
		}
	}
}
