package Loops;

import java.util.Scanner;

public class Score_For {
    public static void main(String[] args){
        System.out.println("You will get 2 marks extra if you score 90 in any of the subjects, enter number of subjects");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int total = 0;

            for (int i=1; i<n+1; i++) {
                System.out.println("Please enter your individual score for the subject: "+i);
                int score = input.nextInt();
                if (score >= 90){
                    score = score +2;
                }
                total = total + score;
            }
        System.out.println("The total is " + total);
    }
}