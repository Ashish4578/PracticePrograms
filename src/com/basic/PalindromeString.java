package com.basic;

public class PalindromeString {

    public static void main(String[] args) {
        String str="marathi";

        String reversedString = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reversedString=reversedString+str.charAt(i);
        }

        if(str.equals(reversedString)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
