/*
 Check if two strings are valid anagrams.
Given an string str1 and str2, check if they both are anagrams or not.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Input Format:

Input consists of a 2 lines of String str1 and String str2.

Output Format:

Print "Yes" if they both are valid anagrams else print "No".

EXAMPLE 1:

Input:

anagram
grmaana
Output::

Yes
 */

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();
        // Convert into character array
        // char[] arr1 = str1.toCharArray();
        // char[] arr2 = str2.toCharArray();

        // //Sort Array
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // //convert back to string
        // str1= new String(arr1);
        // str2 = new String(arr2);

        // if(str1.equals(str2)== true){
        // System.out.print("Yes");
        // }
        // else{
        // System.out.print("No");
        // }

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            freq1[ch - 'a'] += 1;
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            freq2[ch - 'a'] += 1;
        }

        boolean flag = true;
        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] != freq2[i]) {
                flag = false;
            }

        }

        if (flag == true) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}