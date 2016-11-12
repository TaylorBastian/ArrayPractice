
public abstract class test {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };

		ArrayMethods test = new ArrayMethods(a);

		test.swapFirstAndLast();

		test.shiftRight();

		test.replaceEven();

		test.replaceLargest();

		test.removeMiddle();

		test.moveEvenToFront();

		System.out.println(test.returnSecondLargest());

		System.out.println(test.testIfSorted());

		System.out.println(test.testIfAdjacentDuplicate());

		System.out.println(test.testIfDuplicate());

		test.printarray();

	}

}
