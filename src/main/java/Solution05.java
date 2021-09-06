import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Diego Figueroa
 */
/*
print: What is the first number?
save into int variable first
print: What is the second number?
save into int variable second
 */
public class Solution05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("What is the first number? ");
        int first = sc.nextInt();
        System.out.printf("What is the second number? ");
        int second = sc.nextInt();
        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d",
                first, second, first + second, first, second, first-second,
                first, second, first*second, first, second, first/ second);
    }
}
