import java.util.Arrays;

public class MergeSortAlg {
    public static void main(String[] args) {
        int[] newArray = {5, 19, -20, 1, 18, 19, 2, -4};
        mergeSort(newArray, 0, newArray.length);

        Arrays.toString(newArray);
    }

    public static void mergeSort(int[] input,int start,int end) {
        if(end - start < 2) {
            return;
        }
        int mid = (start+end)/2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        sort(input, start, mid, end);


    }

    private static void sort(int[] input, int start, int mid, int end) {
        if (input[mid - 1] < input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while( i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
