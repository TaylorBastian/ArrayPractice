import java.util.Arrays;

public class ArrayMethods {
	private int values[];

	public ArrayMethods(int initialValues[]) {
		values = initialValues;
	}

	public void printarray() {
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

	public void swapFirstAndLast() {
		int first = values[0];
		int last = (values[values.length - 1]);

		values[0] = last;
		values[values.length - 1] = first;
	}

	public void shiftRight() {
		int tobefirst = values[values.length - 1];

		for (int y = values.length - 1; 0 < y; y--) {
			values[y] = values[y - 1];
		}

		values[0] = tobefirst;
	}

	public void replaceEven() {
		for (int u = 0; u < values.length - 1; u++) {
			if (values[u] % 2 == 0) {
				values[u] = 0;
			}
		}
	}

	public void replaceLargest() {
		for (int o = 1; o < values.length - 1; o++) {
			if (o - 1 < o + 1) {
				values[o] = values[o + 1];
			}
			if (o + 1 < o - 1) {
				values[o] = values[o - 1];
			}
		}
	}

	public void removeMiddle() {
		if (values.length % 2 == 0) {
			values[(values.length) / 2] = 0;
			values[((values.length) / 2) - 1] = 0;
		}
		if (values.length % 2 == 1) {
			values[(values.length - 1) / 2] = 0;
		}
	}

	public void moveEvenToFront() {
		int newOrder[] = new int[values.length];
		int w = 0;
		for (int r = 0; r < values.length; r++) {
			if (values[r] % 2 == 0) {
				newOrder[w] = values[r];
				w++;
			}
		}
		for (int q = 0; q < values.length; q++) {
			if (values[q] % 2 == 1) {
				newOrder[w] = values[q];
				w++;
			}
		}
		values = newOrder;
	}

	public int returnSecondLargest() {
		Arrays.sort(values);

		return values[values.length - 2];
	}

	public boolean testIfSorted() {
		boolean issorted = true;
		for (int i = 1; i < values.length; i++) {
			if (values[i] < values[i - 1]) {
				issorted = false;
			}
		}
		return issorted;
	}

	public boolean testIfAdjacentDuplicate() {
		boolean isduplicate = false;
		for (int i = 1; i < values.length; i++) {
			if (values[i] == values[i - 1]) {
				isduplicate = true;
			}
		}
		return isduplicate;
	}

	public boolean testIfDuplicate() {
		int i;
		boolean isduplicate = false;
		for (int r = 0; r < values.length; r++) {
			for (i = r + 1; i < values.length; i++) {
				if (values[r] == values[i]) {
					isduplicate = true;
				}
			}
			i = 0;
		}
		return isduplicate;
	}
}
