package com.example.demo;

public class MySolution {
    public String largestSubStringLength(String s){
        String l = "";
        String temp = "";
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int index = temp.indexOf(arr[i]);
            if(index==-1){
                temp = temp + arr[i];
                if(l.length()<temp.length()){
                    l = temp;
                }
            }else{
                //System.out.println("-------");
                //System.out.println(temp);
                //System.out.println(index);
                temp = temp.substring(index+1, temp.length())+arr[i];
                //System.out.println(temp);
            }
        }
        return l;
    }
    public static void main(String[] args){
        MySolution mySolution = new MySolution();
        System.out.println(mySolution.largestSubStringLength("abcabcbb"));
        System.out.println(mySolution.largestSubStringLength("pwwkew"));
    }
}
/*
"^\\([+-]?((90(\\.0+)?)|([1-8][0-9](\\.[0-9]+)?)|([0-9](\\.[0-9]+)?)),\\s*[+-]?(((([1-9][0-9])|([0-9]))(\\.[0-9]+)?)|(1((80(\\.0+)?)|([0-7][0-9](\\.[0-9]+)?))))\\)$";*/
