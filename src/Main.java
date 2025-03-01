import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int yourRand = rand.nextInt(19) + 2;
        System.out.println("Your hand = "+ yourRand);
        int dealerRand = rand.nextInt(19) + 2;
        System.out.println("Dealer hand = "+ dealerRand);
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hit or stand?");
            if (!scanner.next().contains("h")) { // If user stands
                while(dealerRand < 17 || (dealerRand < yourRand)) {
                    dealerRand = dealerRand + rand.nextInt(9) + 1;
                    System.out.println("Dealer hit and has " + dealerRand + " points.");
                }
                if(dealerRand > 21) {
                    System.out.println("Bust!");
                    System.out.println("You win with " + yourRand + " points!");
                } else if (dealerRand > yourRand) {
                    System.out.println("You lose with "+ yourRand + " points! Dealer had " + dealerRand + " points.");
                } else {
                    System.out.println("You tied the dealer! Both had " + yourRand + " points.");
                }
                break;
            } else { //If user hits
                yourRand = yourRand + rand.nextInt(9) + 1;
                System.out.println("Your hand = " + yourRand);
                System.out.println("Dealer hand = "+ dealerRand);
                if(yourRand > 21) {
                    System.out.println("Bust!");
                    System.out.println("You lose with "+ yourRand + " points!");
                    break;
                }
            }

        }
    }
}