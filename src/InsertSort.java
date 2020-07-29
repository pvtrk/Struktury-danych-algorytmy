import java.util.Arrays;

public class InsertSort {

        public static void main(String[] args) {
            int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

            insertionSort(intArray, 1);

            System.out.println(Arrays.toString(intArray));

            for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
                 firstUnsortedIndex++) {
                int newElement = intArray[firstUnsortedIndex];

                int i;

                for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                    intArray[i] = intArray[i - 1];
                }

                intArray[i] = newElement;
            }

            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        }

        public static void insertionSort(int[] input, int firstUnsoretedIndex) {
            if(firstUnsoretedIndex >= input.length) {
                return;
            }

            int newElement = input[firstUnsoretedIndex];

            int i = firstUnsoretedIndex;

            while(i >= 1 && i < input.length && input[i - 1] > newElement ) {
                input[i] = input[i - 1];
                i--;
            }

            input[i] = newElement;

            insertionSort(input, ++firstUnsoretedIndex);
        }

}
