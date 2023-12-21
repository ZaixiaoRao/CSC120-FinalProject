import java.util.Scanner;

public class ReadingRoom {
    public static void play(Player player) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.println("You are in the reading room now and see a bookcase in the room. Energy: " + player.getEnergy());

        while (true) {
            System.out.println("Enter your choice of action (go/grab/open): ");
            String choice = scanner.nextLine().toLowerCase();

            if ("go".equals(choice)) {
                player.go();
                BookCase.play(player);
            } else {
                System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}

