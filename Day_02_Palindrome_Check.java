/*
--------------------------------------------------
Problem: Palindrome Check

Write a program to check if a given string is 
a palindrome. A palindrome is a word, phrase, 
number, or other sequence of characters that 
reads the same backward as forward.

Example:
Input: madam
Output: true

Input: hello
Output: false
--------------------------------------------------

------------------- Python Solution -------------------
s = input("Enter a string: ")

reversed_str = s[::-1]

if s == reversed_str:
    print("Palindrome: True")
else:
    print("Palindrome: False")
--------------------------------------------------
*/

// ------------------- Java Solution -------------------
import java.util.Scanner;

public class Day_02_Palindrome_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("Palindrome: True");
        } else {
            System.out.println("Palindrome: False");
        }

        sc.close();
    }
}
