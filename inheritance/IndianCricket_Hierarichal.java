package inheritance;

class Cricket{
    String country = "India";
    void country(){
        System.out.println("Lets see details of two cricket players");
    }
    void message(String x){
        System.out.println("Thanks for the contribution to the country, "+ x);
    }
}
class Batsman extends Cricket{
    String Batsman = "Kohli";
    void name(String a){
        System.out.println("inheritance.Batsman Name: "+ a);
        System.out.println("The Nation the player is representing is: "+country);
    }
}
class Bowler extends Cricket{
    void name(String b){
        System.out.println("inheritance.Bowler Name: "+b);
        System.out.println("The Nation the player is representing is: "+country);
    }
}
public class IndianCricket_Hierarichal {
    public static void main(String[] args){
        Cricket game = new Cricket();
        Batsman A = new Batsman();
        Bowler B = new Bowler();
        game.country();
        A.name("Kohli");
        A.message("Kohli");
        B.name("Bumrah");
        B.message("Bumrah");
    }
}
