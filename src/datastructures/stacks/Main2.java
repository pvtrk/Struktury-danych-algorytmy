package datastructures.stacks;

import datastructures.queues.CharacterQueue;
import datastructures.queues.CircularQueue;
import datastructures.queues.CircularQueueChar;

import java.sql.SQLOutput;

public class Main2 {

    public static void main(String[] args) {
            /*// should return true
            System.out.println(checkForPalindrome("abccba"));
            // should return true
            System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
            // should return true
            System.out.println(checkForPalindrome("I did, did I?"));
            // should return false
            System.out.println(checkForPalindrome("hello"));
            // should return true
            System.out.println(checkForPalindrome("Don't nod"));*/

            // should return true
            System.out.println(checkForPalindrome("abccba"));
            // should return true
            System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
            // should return true
            System.out.println(checkForPalindrome("I did, did I?"));
            // should return false
            System.out.println(checkForPalindrome("hello"));
            // should return true
            System.out.println(checkForPalindrome("Don't nod"));

        System.out.println(1%10);

    }

        public static boolean checkForPalindrome(String string) {
        StackForChallenge stack = new StackForChallenge();
            String input = string.toLowerCase();
            input = input.replaceAll(",","");
            input = input.replaceAll("'", "");
            input = input.replace("?","");
            input = input.replaceAll("\\s+","");

            char[] array = input.toCharArray();

            for(int i = 0; i < array.length/2; i++) {
                    stack.push(array[i]);
            }

            if((array.length) % 2 != 0) {
                stack.push(array[array.length/2]);
            }

            for(int i = array.length/2 ; i < array.length ; i++) {
                char a = stack.pop();
                if(array[i] != a) {
                    return false;
                }

            }
            return true;
        }

        public static boolean checkForPalindrome2(String string) {
            StackForChallenge stack = new StackForChallenge();
            CharacterQueue queue = new CharacterQueue(10);

            String input = string.toLowerCase();
            input = input.replaceAll(",","");
            input = input.replaceAll("'", "");
            input = input.replace("?","");
            input = input.replaceAll("\\s+","");

            char[] array = input.toCharArray();

            for(int i = 0; i < array.length/2; i++) {
                stack.push(array[i]);
            }
            if((array.length) % 2 != 0) {
                stack.push(array[array.length/2]);
            }
            for(int i = array.length/2; i < array.length; i++) {
                queue.add(array[i]);
            }

            for(int i = 0; i < array.length/2; i++) {
                if (!stack.pop().equals(queue.remove())) {
                    return false;
                }
            }
            return true;
        }
}

