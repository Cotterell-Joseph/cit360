import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    //Display the 3 most recent BSU games
    public static void main(String[] args) {
        Queue games = new LinkedList();

        //First three games are added 9-15-18
        games.add("BSU (56) vs Troy (20)");
        games.add("BSU (62) vs UConn (7)");
        games.add("BSU (21) vs OKST (44)");

        //Games on or before 9-15
        System.out.println("Three most recent games on or before 9-15:");
        displayGames(games);

        //Wyoming game 9-29-18
        games.remove();
        games.add("BSU (34) vs WYO (14)");

        //Games on or before 9-29
        System.out.println("\nThree most recent games on or before 9-29:");
        displayGames(games);

        //San Diego State game 10-6-18
        games.remove();
        games.add("BSU (13) vs SDSU (19)");

        //Games on or before 10-6
        System.out.println("\nThree most recent games on or before 10-6:");
        displayGames(games);

        //Nevada game 10-13-18
        games.remove();
        games.add("BSU (31) vs NEV (27)");

        //Games on or before 10-13
        System.out.println("\nThree most recent games on or before 10-13:");
        displayGames(games);

        //Colorado State game 10-19-18
        games.remove();
        games.add("BSU (56) vs CSU (28)");

        //Games on or before 10-19
        System.out.println("\nThree most recent games on or before 10-19:");
        displayGames(games);

        //Air Force game 10-27-18
        games.remove();
        games.add("BSU (48) vs AFA (38)");

        //Games on or before 10-27
        System.out.println("\nThree most recent games on or before 10-27:");
        displayGames(games);

        //BYU game 11-3-18
        games.remove();
        games.add("BSU (21) vs BYU (16)");

        //Games on or before 11-3
        System.out.println("\nThree most recent games on or before 11-3:");
        displayGames(games);

    }
    //Display the games
    private static void displayGames(Queue games) {
        for (Object g : games) {
            System.out.println(g);
        }
    }
}
