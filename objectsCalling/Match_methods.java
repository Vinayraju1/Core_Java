package objectsCalling;

class Player{
   void toss(){
           System.out.println("Options are 1.Heads 2.Tails");  }
   void selection(String result){
   System.out.println("Kohli selected " + result + " for toss");
       }
   String decision(String a, String b){
       System.out.println("Kohli "+a+" the toss");
       return "batting";
       }
   String openers(){
           return ("rohith & dhawan");
       }
}
public class Match_methods {
    public static void main(String[] args){
        Player kohli = new Player();
        kohli.toss();
        kohli.selection("Heads");
        System.out.println("The decision took by Kohli is: " + kohli.decision("Won","lose"));
        System.out.println("Kohli sent " + kohli.openers()+" as the openers");
    }
}
