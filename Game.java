public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to the Escaping Room! Let's find a way out.");
        System.out.println("——-——-——");
        System.out.println("Your total INITIAL energy: 10");
        System.out.println("You have THREE options of actions. When you select:");
        System.out.println("-Go: Energy decreases by 2.");
        System.out.println("-Grab: Energy decreases by 1.");
        System.out.println("-Open: Energy decreases by 1.");
        System.out.println("Remember NOT to let your energy go BELOW 1!");
        System.out.println("——-——-——");
        System.out.println("Let's begin!");
        Player player = new Player();
        LivingRoom.play(player);
    }
}