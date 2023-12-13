package com.example.demo;

public class BitOperation {
    public static boolean getBit(int num, int i){;
        int result = num & (1<<i);
        System.out.println(result);
        if(result == 0)
            return false;
        return true;
    }

    public static void main(String [] args){
        System.out.println(""+getBit(100, 2));
        System.out.println(1000 & 100);
    }
}
