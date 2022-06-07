package arraytwodimentional;

public class Twodimentionalarray2 {

	public static void main(String[] args) {

		int a[][] = { { 10, 20, 30 }, { 35, 40, 50 }, { 55, 60, 65 }, { 70, 75, 80 }, { 85, 90, 100 } };

		for (int i[] : a) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
