package Loops;

import java.util.Scanner;

public class Result_if_else {
    public static void main(String[] args) {
        System.out.println("Enter the candidate's GPA:");
        Scanner input = new Scanner(System.in);
        double GPA = input.nextDouble();

        if (GPA >= 3 && GPA < 4)  {
            System.out.println("The Candidate is eligible for Graduation");
        } else  if (GPA == 4) {
            System.out.println("The candidate is Graduating with highest grade");
        } else {
            System.out.println("The candidate is not eligible to graduation");
        }

    }
}