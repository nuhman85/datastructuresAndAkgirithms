package com.example.demo;

public class Palindrome {

    public static String longestPalindrome(String s){
        int maxPalinLength = 0;
        String longestPalindrome = null;

        int length = s.length();
         for(int i = 0; i < length; i++){
             for(int j= i + 1; j < length; j++){
                 int len = j - i;
                 String curr = s.substring(i , j+1);
                 if(isPalindrome(curr)){
                   if(len > maxPalinLength) {
                        longestPalindrome = curr;
                        maxPalinLength = len;
                   }
                 }
             }
         }
         return longestPalindrome;
    }

    private static boolean isPalindrome(String curr) {
        for(int i = 0; i < curr.length() - 1; i++){
            if(curr.charAt(i) != curr.charAt(curr.length() - 1 - i)){
                return false;
            }

        }
        return true;
    }

    public static void main(String [] args){
        System.out.println(longestPalindrome("MALAYALAM"));

        System.out.println(longestPalindrome("KKKMALAYALAMDGFT"));
        System.out.println(longestPalindrome("KKghtjdyui"));
        palindrome2("tests");
    }

    public static String palindrome2(String s){
        if(s == null || s.length()<=1)
            return s;
        int maxLen = 0;
        String longestStr = null;
        int length = s.length();

        int[][] table = new int[length][length];

        for(int i =0; i< length; i++){
            table[i][i] = 1;
        }
        printTable(table);

        for(int i=0;i <length - 2; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                table[i][i+1] = 1;
                longestStr = s.substring(i, i+2);
            }
        }
        printTable(table);


        return longestStr;
    }


    public static void printTable(int[][] xy){
        for(int[] x: xy){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println("-------");
    }
}
