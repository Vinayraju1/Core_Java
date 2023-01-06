package objectsCalling;

class FootBallPlayer {
    int goals, penalties;
    String country;
    double jump;
}

    class CricketPlayer {
        int centuries;
        double average;
        char firstLetter;
        float height;
    }

        public class GreatestPlayers_classes {
            public static void main(String[] args) {

                System.out.println("Let us see the stats of two greatest players, one from football and another from cricket");
                FootBallPlayer ronaldo = new FootBallPlayer();
                ronaldo.goals = 150;
                ronaldo.penalties = 25;
                ronaldo.country = "Portugal";
                ronaldo.jump = 2.93;

                System.out.println("Let's first see the stats of a Football player named: Ronaldo");
                System.out.println("number of goals: " + ronaldo.goals);
                System.out.println("number of penalties: " + ronaldo.penalties);
                System.out.println("Player for Country: " + ronaldo.country);
                System.out.println("Highest jump for a goal in metres: " + ronaldo.jump);

                CricketPlayer kohli = new CricketPlayer();
                kohli.centuries = 72;
                kohli.average = 53.4;
                kohli.firstLetter = 'K';
                kohli.height = 5.9f;

                System.out.println("Let's now see the stats of a inheritance.Cricket player named: Kohli");
                System.out.println("number of centuries: " + kohli.centuries);
                System.out.println("Average score: " + kohli.average);
                System.out.println("First letter of the name: " + kohli.firstLetter);
                System.out.println("Height in feet: " + kohli.height);

            }
        }


