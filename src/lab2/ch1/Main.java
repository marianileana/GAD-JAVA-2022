package lab2.ch1;

public class Main {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter(100, 10,"Dark fighter");
        Fighter fighter2 = new Fighter(120, 8,"White fighter");
        BoxingMatch bm = new BoxingMatch(fighter1, fighter2);

        Fighter winner = bm.fight();
        System.out.print("Winner = " + winner.getName());

    }
}
