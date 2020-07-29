import java.util.Arrays;

public class MergeSortDesc {
    public static void main(String[] args) {
        int[] newArray = {5, 19, -20, 1, 18, 19, 2, -4};
        mergeSort(newArray, 0, newArray.length);

        System.out.println(Arrays.toString(newArray));
    }

    public static void mergeSort(int[] input, int start, int end) {
        if((end - start) < 2) {
            return;
        }

        int mid = (end + start) / 2;

        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        sort(input, start, mid, end);
    }

    private static void sort(int[] input, int start, int mid, int end) {
        if(input[mid - 1] >= input[mid]) {
            return;
        }

        int[] tempArray = new int[end-start];
        int tempIndex = 0;
        int i = start;
        int j = mid;

        while(i < mid && j < end) {
            tempArray[tempIndex++] = input[i] > input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i); // tab z ktorej kopiujemy wartosci, index od ktorego zaczynamy, tab do ktorej kopiujemy, index poczatkowy, ilosc obiektow
        System.arraycopy(tempArray, 0, input, start, tempIndex);
    }
}
