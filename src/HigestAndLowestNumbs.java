
public class HigestAndLowestNumbs {

	public static void main(String[] args) {

		int[] arr = { 5, 8, 6, 4, 2, 7 };
		int hig = 0, low = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Add comments in Git");
			if (arr[i] > hig)
				hig = arr[i];
			else if (arr[i] < low)
				low = arr[i];

		}
		System.out.println(hig + "        " + low);

	}

}
