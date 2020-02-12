package com.codersbay.wagner;

import java.util.Scanner;

public class TranslatingGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade (1 to 5) to get a word representation: ");
        int grade = scan.nextInt();
        System.out.println("grade "+grade);
        switch (grade) {
            case 1:
                System.out.println("Very good");
                break;
            case 2:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Satisfactory");
                break;
            case 4:
                System.out.println("Sufficient");
                break;
            case 5:
                System.out.println("Not Sufficient");
                break;
            default:
                System.out.println("The number is out of range!");
        }
    }
}
