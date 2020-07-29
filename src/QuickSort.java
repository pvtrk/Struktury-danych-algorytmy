import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] newArray = {5, 19, -20, 1, 18, 19, 2, -4};
        quickSort(newArray, 0, newArray.length);

        System.out.println(Arrays.toString(newArray));

    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while( i < j) {

            while(i < j && input[--j] >= pivot);
            if(i < j) {
                input[i] = input[j];
            }

            while(i < j && input[++i] <= pivot);
            if(i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;

        return j;

    }
}
