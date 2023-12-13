package com.example.demo;

public class StairAccess {

    static int[] A = new int[100];
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

    public static int f3(int n){
        if(n<=2)
            A[n] = n;
        if(A[n] > 0)
            return A[n];
        else
            A[n] = f3(n-1) + f3(n-2);
        return A[n];
    }


    public static void main(String[] args){
        System.out.println("Stair access: "+fc(4));
        System.out.println(nonRecFibonocci(4));
    }


}
