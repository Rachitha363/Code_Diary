/*
--------------------------------------------------
Problem: Prime Number Check

Write a program to check if a given number 
is a prime number or not.

A prime number is greater than 1 and has 
no divisors other than 1 and itself.

Example:
Input: 7
Output: 7 is a Prime Number

Input: 10
Output: 10 is NOT a Prime Number
--------------------------------------------------

------------------- Python Solution -------------------
n = int(input("Enter a number: "))

if n > 1:
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            print(n, "is NOT a Prime Number")
            break
    else:
        print(n, "is a Prime Number")
else:
    print(n, "is NOT a Prime Number")
--------------------------------------------------
*/

// ------------------- Java Solution -------------------
import java.util.Scanner;

public class Day_05_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is NOT a Prime Number");

        sc.close();
    }
}
