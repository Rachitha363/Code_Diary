/*
--------------------------------------------------
Problem: Factorial of a Number

Write a program to calculate the factorial 
of a given number n.

The factorial of n (denoted as n!) is the 
product of all positive integers less than 
or equal to n.

Example:
Input: 5
Output: 120   (5 * 4 * 3 * 2 * 1 = 120)
--------------------------------------------------

------------------- Python Solution -------------------
n = int(input("Enter a number: "))

fact = 1
for i in range(1, n + 1):
    fact *= i

print("Factorial:", fact)
--------------------------------------------------
*/

// ------------------- Java Solution -------------------
import java.util.Scanner;

public class Day_03_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);

        sc.close();
    }
}
