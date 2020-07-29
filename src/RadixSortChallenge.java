import java.util.HashMap;
import java.util.Map;

public class RadixSortChallenge {
    public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb", "bbbbc", "bbbbd"};

        // do radix sort

        radixSort(stringsArray, 9, 5);

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    public static void radixSort(String[] input, int radix, int width) {
        Map<Character, Integer> valueMap = new HashMap<>();
        valueMap.put('a', 0);
        valueMap.put('b', 1);
        valueMap.put('c', 2);
        valueMap.put('d', 3);
        valueMap.put('e', 4);
        valueMap.put('f', 5);
        valueMap.put('m', 6);
        valueMap.put('o', 7);
        valueMap.put('q', 8);

        for(int i = width - 1; i >= 0; i--) {
            singleSort(input, i, valueMap);
        }
    }

    private static void singleSort(String[] input, int position, Map<Character, Integer> valueMap) {
        int numItems = input.length;


        int[] countArray = new int[valueMap.size()];

        for(String value : input) {
            countArray[getDigit(value, position, valueMap)]++; // wyznacza wartosc badanego znaku
        }

        for(int j = 1; j < countArray.length; j++) {
            countArray[j] += countArray[j - 1];
        }
        String[] temp = new String[numItems];

        // { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb", "bbbbc", "bbbbd"}
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(input[tempIndex], position, valueMap)]] =
                    input[tempIndex];
        }


        for(int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    private static int getDigit(String value, int position, Map<Character, Integer> valueMap) {
        char a = value.charAt(position);
        return valueMap.get(a);
    }
}
