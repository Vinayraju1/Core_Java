package inheritance;

import java.util.Scanner;
class Exam1 {
    double marks1 = 90;
    void result1() {
        System.out.println("Sum of scores as of now: "+marks1);
    }
}
class Exam2 extends Exam1 {
    double marks2 = 90;;
    void result2() {
        System.out.println("Sum of scores as of now: " + (marks1+marks2));
    }
}
class Quiz extends Exam2{
    double marks3 = 90;;
    void result3(){
        System.out.println("Sum of scores as of now: " + (marks1+marks2+marks3));
        }
}
class FinalScore_Inheritance{
    double final_score;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exam1 A = new Exam1();
        Exam2 B = new Exam2();
        Quiz C = new Quiz();
        A.result1();
        B.result2();
        C.result3();
    }
}











