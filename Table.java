import java.util.Scanner;

public class Table {
    public static void play(Player player) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("You come to the table and see a burger on the table. Energy: " + player.getEnergy());

            while (true) {
                System.out.println("Enter your choice of action (go/grab/open): ");
                String choice = scanner.nextLine().toLowerCase();

                if ("grab".equals(choice)) {
                    player.grab();
                    player.increaseEnergy(5);
                    System.out.println("You eat the burger. Energy increases by 5! Energy: " + player.getEnergy());
                    Stairs.play(player);
                } else if ("go".equals(choice)) {
                    player.go();
                    Stairs.play(player);
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}


