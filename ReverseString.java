package com.akshay.reversestring.main;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String string = scanner.next();
        String reverse = "";


        for (int i = string.length()-1; i >=0; i--){
            reverse = reverse + string.charAt(i);
        }
        System.out.println(reverse);
    }
}
