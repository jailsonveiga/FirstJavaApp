package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello GitHub");

        System.out.println(getFirstElement(new int[] {3,1,4}));

        System.out.println(addition(70));
    }
//Return the First Element in an Array
    public static int getFirstElement(int[] arr){
        return arr[0];
    }
//Return the Next Number from the Integer Passed
    public static int addition(int num){
        return num + 1;
    }
}
