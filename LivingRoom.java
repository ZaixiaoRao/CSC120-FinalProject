import java.util.Scanner;

public class LivingRoom {
    public static void play(Player player) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("You are in the living room. You see a kitchen in front of you. Energy: " + player.getEnergy());

        while (true) {
            System.out.println("Enter your choice of action (go/grab/open): ");
            String choice = scanner.nextLine().toLowerCase();

            if ("go".equals(choice)) {
                player.go();
                Kitchen.play(player);
            } else {
                System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}

