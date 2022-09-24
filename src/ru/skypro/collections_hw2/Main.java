package ru.skypro.collections_hw2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums1 = new ArrayList<>(List.of(10, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        List<String> words = new ArrayList<>(List.of("collection", "list", "set", "set", "map", "list", "set", "map", "list", "list"));

        printOddNumbers(nums);
        printEvenNonRepetitionAscending(nums1);

        printUniqueWords(words);
        printNumberOfDuplicates(words);
    }

    public static void printOddNumbers(List<Integer> nums) {
        List<Integer> oddNums = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 != 0) {
                oddNums.add(num);
            }
        }
        System.out.println(oddNums);
    }

    public static void printEvenNonRepetitionAscending(List<Integer> nums) {
        Set<Integer> evenNumbers = new HashSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        System.out.println(evenNumbers);
    }

    public static void printUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void printNumberOfDuplicates(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        int valueCounter;
        for (String word : words) {
            valueCounter = map.getOrDefault(word, 0) + 1;
            map.put(word, valueCounter);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() > 1) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }

    }
}
