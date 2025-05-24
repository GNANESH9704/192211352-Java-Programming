package java_class;

public class frequency {
	public static void main(String[] args) {
		int[] array = {1, 2, 8, 3, 2, 2, 2, 5, 1};
		System.out.println("Element | Frequency");
		for (int i = 0; i < array.length; i++) {
			boolean alreadyCounted = false;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					alreadyCounted = true;
					break;
				}
			}
			if (alreadyCounted) {
				continue;
			}
			int count = 0;
			for (int k = 0; k < array.length; k++) {
				if (array[k] == array[i]) {
					count++;
				}
			}
			System.out.println(array[i] + " | " + count);
		}
	}
}