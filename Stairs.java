import java.util.Scanner;

public class Stairs {
    public static void play(Player player) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.println("After eating the burger, you see stairs in front of you.");

        while (true) {
            System.out.println("Enter your choice of action (go/grab/open): ");
            String choice = scanner.nextLine().toLowerCase();

            if ("go".equals(choice)) {
                player.go();
                Basement.play(player);
            } else {
                System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}


