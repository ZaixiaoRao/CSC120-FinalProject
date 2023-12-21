import java.util.Scanner;

public class BookCase {
    public static void play(Player player) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("You go to the bookcase and find out it has 6 cases. One of them contains a magic key. Energy: " + player.getEnergy());
            System.out.println("There's a piece of paper on the bookcase. Here's what it reads:");
            System.out.println("Case 1 says: \"I have something special compared to others.\"");
            System.out.println("Case 2 says: \"You may find it in drawer 3.\"");
            System.out.println("Case 3 says: \"To be magical is to be odd.\"");
            System.out.println("Case 4 says: \"I don't have what you want.\"");
            System.out.println("Case 5 says: \"Not in my case!\"");
            System.out.println("Case 6 says: \"Not all of them are telling the truth.\"");
            System.out.println("Only one of them is NOT telling the truth! Still, you have multiple trials but pay for each move you make!");

            while (true) {
                System.out.println("Enter the correct case number (1-6): ");
                String choice = scanner.nextLine();

                try {int caseNumber = Integer.parseInt(choice);
                    if (caseNumber == 1) {
                        System.out.println("You open the correct case that contains the key. Energy decreases by 1. Energy: " + player.getEnergy());
                        System.out.println("You find the key in case number 1!");
                        System.out.println("The magic key is giving 1 of your energy back. Energy: " + player.getEnergy());
                        player.increaseEnergy(1);
                        System.out.println("A secret hidden door appears on the wall.");
                        System.out.println("Enter your choice of action (go/grab/open): ");
                        String secretDoor = scanner.nextLine().toLowerCase();
                        if ("open".equals(secretDoor)) {
                            player.open();
                            if (player.getEnergy() > 0) {
                                System.out.println("Congratulations! You have successfully escaped!");
                            }
                            System.exit(0);
                        } else {
                            System.out.println("Invalid choice. Try again.");
                        }
                    } else if (caseNumber == 1 || caseNumber == 3 || caseNumber == 4 || caseNumber == 5 || caseNumber == 6) {
                        player.decreaseEnergy(1);
                        System.out.println("You open a case with only books inside. Energy decreases by 1. Please try again. Energy: " + player.getEnergy());
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number (1-6).");
                }
            }
        }
    }
}
