/**
 * Created by shihasun on 7/4/16.
 */
public class Excercise {
//    https://www.youtube.com/watch?v=50miLglyGJQ
    // Replace temp with Query ; using final to ensure that the temp only used once
    public void printPlayerInfo() {

        // Prints the titles

        /* Print titles */

        printTitle();

//        Cycle through all the players

        for (FootballPlayer player : players) {

            printEachPlayer(player);

        }

    }

    private void printEachPlayer(FootballPlayer player) {
        System.out.printf("%-19s", player.getName());


        System.out.printf("%1$.2f", getAvg40YdTime());

        System.out.println();
    }

    private double getAvg40YdTime() {
        return getTotal40YdDashTimes() / player.get40YardDashTimes().length;
    }

    private double getTotal40YdDashTimes() {
        double total40YdDashTimes = 0.0;

        for (int i = 0; i < player.get40YardDashTimes().length; i++) {

            total40YdDashTimes += fortyYardDashTimes[i];

        }
        return total40YdDashTimes;
    }

    private void printTitle() {
        System.out.printf("%-15s %15s", "Name", "Avg 40 Time\n");

        // Print dashes under titles

        for (int i = 0; i < 30; i++) {
            System.out.print("_");
        }

        System.out.println();
    }
}
