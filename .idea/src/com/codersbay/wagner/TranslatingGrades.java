package com.codersbay.wagner;

public class TranslatingGrades {
    public static void main(String[] args) {
        int grade = 2;
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
        }
    }
}
