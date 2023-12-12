package com.example.demo;

public class StairAccess {
    public static int fc(int n){
        if(n <= 2) return n;
        int x = fc(n-1) + fc(n -  2);
        System.out.println("int x = fc( "+n+" -1) + fc("+n+" -  2) = "+x);
        return x;
    }
    public static int nonRecFibonocci(int n){
        if(n <= 2)
            return n;
        int first = 1;
        int second = 2;
        int third = 0;

        for(int i=3;i<=n;i++){
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }
    public static void main(String[] args){
        System.out.println("Stair access: "+fc(4));
        System.out.println(nonRecFibonocci(4));
    }


}
