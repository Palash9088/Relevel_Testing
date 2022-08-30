public class SecondMax {
	void m1(int arr[]) {
		int max = arr[0];
		int secondMax = arr[1];
		for (int i = 2; i < arr.length; i++) {
			if ( arr[i] >secondMax)
			{
				secondMax = arr[i];
			}
			if (secondMax>max)
			{
				int temp = max;
				max = secondMax;
				secondMax = temp;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		SecondMax SecondMax = new SecondMax();

		int[] arr = {1, 2, 3, 4, 5};

		SecondMax.m1(arr);
	}
}
