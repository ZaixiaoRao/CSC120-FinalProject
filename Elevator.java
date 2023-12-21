import java.util.Scanner;

public class Elevator {
    public static void play(Player player) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("You are now in the elevator. There are 4 floor buttons on the wall. Beside each bottom there is a sticker.");
            System.out.println("Sticker beside Floor 1 says: \"Stay with me and don't go anywhere! You'll find what you want.\"");
            System.out.println("Sticker beside Floor 2 says: \"When in doubt, go to the second floor.\"");
            System.out.println("Sticker beside Floor 3 says: \"Either me or the first floor will be the best choice.\"");
            System.out.println("Sticker beside Floor 4 says: \"You may trust the third floor but definitely not the second floor.\"");
            System.out.println("Only one of them tells exactly the truth.");
            System.out.println("REMEMBER: You have ONLY ONE CHANCE this time! Please choose wisely.");
            
            while (true) {
                System.out.println("Enter the correct floor number (1-4): ");
                String choice = scanner.nextLine();

                try {int floorNumber = Integer.parseInt(choice);
                    if (floorNumber == 2) {
                        System.out.println("You go to the second floor safely. ");
                        ReadingRoom.play(player);
                        break;
                    } else if (floorNumber == 1 || floorNumber == 3 || floorNumber == 4) {
                        System.out.println("Wrong floor! The elevator explodes.");
                        System.exit(0);
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number (1-4).");
                }
            }
        }
    }
}
