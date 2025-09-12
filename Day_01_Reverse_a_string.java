/*
--------------------------------------------------
Problem: Reverse a String

Write a program that takes a string as input 
and prints the string in reverse order.

Example:
Input: hello
Output: olleh
--------------------------------------------------

------------------- Python Solution -------------------
s = input("Enter a string: ")

reversed_str = ""
for i in range(len(s) - 1, -1, -1):
    reversed_str += s[i]

print("Reversed string:", reversed_str)
--------------------------------------------------
*/

// ------------------- Java Solution -------------------
import java.util.Scanner;

public class Day_01_Reverse_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
// PS C:\Users\rachi\OneDrive\Documents\CodeDiary\Day_1> javac Day_01_Reverse_a_string.java
// >> java Day_01_Reverse_a_string
// >>
// >> java Day_01_Reverse_a_string
// >>
// Enter a string: hi
// Enter a string: hi
// Reversed string: ih