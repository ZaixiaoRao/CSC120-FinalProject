import java.util.Scanner;

public class Locker {
    public static void play(Player player) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("There is a piece of paper on the locker. Here are the words on the paper:");
            System.out.println("Drawer 1 says: \"I definitely have what you need.\"");
            System.out.println("Drawer 2 says: \"Neither drawer 1 is telling the truth nor the thing's here with me.\"");
            System.out.println("Drawer 3 says: \"Only in drawer1 you may find it.\"");
            System.out.println("Only one of them tells exactly the truth. You have multiple trials, but still gonna pay for each move you take!");
            while (true) {
                System.out.println("Enter the correct drawer number (1-3): ");
                String choice = scanner.nextLine();
            
                try {int drawerNumber = Integer.parseInt(choice);
                    if (drawerNumber == 3) {
                        player.decreaseEnergy(1);
                        System.out.println("You open the correct drawer with a lighter. Energy decreases by 1! Energy: " + player.getEnergy());
                        player.increaseEnergy(3);
                        System.out.println("The light makes you feel warmer. Energy increases by 3. With the light, you see the door of an elevator opens in front of you. Energy: " + player.getEnergy());
                        player.decreaseEnergy(3);
                        System.out.println("You go to the elevator and open the door. Energy: " + player.getEnergy());
                        Elevator.play(player);
                    } else if (drawerNumber == 1 || drawerNumber == 2) {
                        player.decreaseEnergy(1);
                        System.out.println("You open an empty drawer. Energy decreases by 1. Try again. Energy: " + player.getEnergy());
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number (1-3).");
                }
            }
        }
    }
}
