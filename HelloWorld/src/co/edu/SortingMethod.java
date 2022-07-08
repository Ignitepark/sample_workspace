package co.edu;

public class SortingMethod {
	public static void main(String[] args) {

		int[] intArray = new int[20];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 100) + 1;
		}
		for (int num : intArray)
			System.out.print(num + " ");
		System.out.println();
		dnsort(intArray);
		System.out.print("내림차순 : ");
		for (int num : intArray)
			System.out.print(num + " ");
		System.out.println();
		sort(intArray);
		System.out.print("오름차순 : ");
		for (int num : intArray)
			System.out.print(num + " ");
	}

	public static int dnsort(int[] Array) {
		int a = 0;
		int temp = 0;
		while (true) {
			if (a < Array.length - 1) {
				if (Array[a] < Array[a + 1]) {
					temp = Array[a + 1];
					Array[a + 1] = Array[a];
					Array[a] = temp;
					if (a > 0) {
						a--;
					}
				} else if (Array[a] >= Array[a + 1]) {
					a++;
				}
			} else {
				break;
			}
		}
		return 0;
	}

	public static int upsort(int[] Array) {
		int a = 0;
		int temp = 0;
		while (true) {
			if (a < Array.length - 1) {
				if (Array[a] > Array[a + 1]) {
					temp = Array[a + 1];
					Array[a + 1] = Array[a];
					Array[a] = temp;
					if (a > 0) {
						a--;
					}
				} else if (Array[a] <= Array[a + 1]) {
					a++;
				}
			} else {
				break;
			}
		}
		return 0;
	}

	public static int sort(int[] Array) {
		int temp = 0;
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array.length - 1; j++) {
				if (Array[j] > Array[j + 1]) {
					temp = Array[j + 1];
					Array[j + 1] = Array[j];
					Array[j] = temp;
				}
			}
		}
		return 0;
	}

}
