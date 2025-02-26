package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
           int j = i - 1;
           int num = elements[i];
           while (j >= 0 && elements[j] > num) {
            elements[j+1] = elements[j];
            j--;
           }
           elements[j+1] = num;
        }
        return elements;
    }

    public static int[] insertionSortt(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
           int j = i - 1;
           int num = elements[i];
           while (j >= 0 && elements[j] > num) {
            elements[j+1] = elements[j];
            j--;
           }
           elements[j+1] = num;
        }
        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int idx = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[idx]) {
                    idx = j;
                }
            }
            int minimum = elements[idx];
            elements[idx] = elements[i];
            elements[i] = minimum;
        }
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for (int i = 1; i < words.size(); i++) {
            int j = i - 1;
            String word = words.get(i);
            while (j >= 0 && words.get(j).compareTo(word) > 0) {
                words.set(j+1, words.get(j));
                j--;
            }
            words.set(j+1,word);
        }
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            int idx = i;
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(idx)) < 0) {
                    idx = j;
                }
            }
            String minimum = words.get(idx);
            words.set(idx, words.get(i));
            words.set(i, minimum);
        }
 
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

    public static void main(String[] args) {
        int[] arrA = {19,3,44,99,7,91,75,14,85,43,98,77,39,16,67,50,21,54,89,94,32,58,79,69,45,33,1,63,5,36,27,60,28,48,93,83,68,80,64,20,62,90,97,40,37,59,55,56,15,11};
InsertionSort.selectionSort(arrA);
System.out.println(Arrays.toString(arrA));
System.out.println();
int[] arrB = {19,3,44,99,7,91,75,14,85,43,98,77,39,16,67,50,21,54,89,94,32,58,79,69,45,33,1,63,5,36,27,60,28,48,93,83,68,80,64,20,62,90,97,40,37,59,55,56,15,11};
InsertionSort.insertionSortt(arrB);
System.out.println(Arrays.toString(arrB));

    }

}