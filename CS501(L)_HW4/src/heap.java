import java.util.Arrays;

public class heap {
	public static int Sizeofheap;

	public static void maxHeapify(int array[], int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = -1;
		if (left < Sizeofheap && array[left] > array[i]) {
			largest = left;
		} else {
			largest = i;
		}
		if (right < Sizeofheap && array[right] > array[largest]) {
			largest = right;
		}
		if (largest != i) {
			// swap the ith element with the largest element
			int temp = array[i];
			array[i] = array[largest];
			array[largest] = temp;
			maxHeapify(array, largest);
		}
	}

	public static void buildMaxHeap(int array[]) {
		Sizeofheap = array.length;
		for (int i = array.length / 2; i >= 0; i--) {
			maxHeapify(array, i);
		}
	}

	public static void heapSort(int array[]) {
		buildMaxHeap(array);
		System.out.println("The array after buildMaxHeap has completed:"
				+ Arrays.toString(array));
		for (int i = array.length - 1; i >= 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			Sizeofheap = Sizeofheap - 1;
			maxHeapify(array, 0);
		}
	}

	public static void main(String[] args) {
		int[] array = { 10, 15, 8, 12, 5, 2, 20, 7, 18 };
		System.out.println("Original input array : " + Arrays.toString(array));
		
		
		System.out.println("This is to check git pull");
		heapSort(array);
		System.out
				.println("The final sorted array after performing the Heapsort algorithm : "
						+ Arrays.toString(array));
	}

}
