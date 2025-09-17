/*
--------------------------------------------------
Problem: Fibonacci Sequence

Write a program to print the first n terms 
of the Fibonacci sequence.

The Fibonacci sequence is:
0, 1, 1, 2, 3, 5, 8, ...

Each number is the sum of the two preceding ones:
F(n) = F(n-1) + F(n-2)

Example:
Input: 7
Output: 0 1 1 2 3 5 8
--------------------------------------------------

------------------- Python Solution -------------------
n = int(input("Enter number of terms: "))

a, b = 0, 1
print("Fibonacci sequence:", end=" ")
for i in range(n):
    print(a, end=" ")
    a, b = b, a + b
--------------------------------------------------
*/

// ------------------- Java Solution -------------------
import java.util.Scanner;

public class Day_04_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}
