package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {1,2,3};
        BinarySearch bs = new BinarySearch(arr, 2);
        System.out.println(bs.find());
    }
}
