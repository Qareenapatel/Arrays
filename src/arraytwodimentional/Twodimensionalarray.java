package arraytwodimentional;

public class Twodimensionalarray {

	public static void main(String[] args) {

		/*int a[][] = new int[3][2];

		// storing elements/values into array
		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;*/

		// or

		int a[][]= { {100,200},{300,400},{500,600} };

		 System.out.println("Number of rows:" + a.length);
		System.out.println("Number of columns:" + a[0].length);

		
		
		
		// classic for loop
		
		  for (int i=0;i<=2;i++) // for incrementing rows
			  { 
			  for (int j=0;j<=1;j++) //for increamenting the columns for each row 
				  {
		  
		  System.out.print(a[i][j] + " ");
		  } 
			  System.out.println(); 
			  }
		 

		
		
		
		// for each loop

		for (int i[] : a) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

/*
 * for (int i = 0; i < a.length; i++)// outer loop { for (int j = 0; j
 * <a[i].length; j++)// inner loop { System.out.println(a[i][j]); }
 */
