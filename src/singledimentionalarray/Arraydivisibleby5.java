package singledimentionalarray;

public class Arraydivisibleby5 {

	public static void main(String[] args) {

		int a[] = { 3, 5, 12, 15, 18, 25, 65, 72, 94, 105 };

		System.out.println("Length of an array is:" + a.length);

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] % 5 != 0) {

				System.out.println(a[i]);
			}

		}
		
		/*int a[] = { 3, 5, 12, 15, 18, 25, 65, 72, 94, 105 };

		System.out.println("Length of an array is:" + a.length);

		for (int i = 0; i <= a.length - 1; i++) {

			if (a[i] % 5 == 0) {

				System.out.println(a[i]);
			}

		}*/


	}
}
