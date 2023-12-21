import java.util.Scanner;

public class Basement {
    public static void play(Player player) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.println("You are in the basement. It's dark and you need a lighter. Energy: " + player.getEnergy());
        System.out.println("The only thing you see is the locker in front of you.");
        Locker.play(player);
        }   
    }
}
