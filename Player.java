public class Player {
    private int energy;

    public Player() {
        this.energy = 10;
    }

    public int getEnergy() {
        return energy;
    }

    public void decreaseEnergy(int amount) {
        energy -= amount;
        if (energy < 1) {
            System.out.println("You have run out of energy. Game over!");
            System.exit(0);
        }
    }

    public void increaseEnergy(int amount) {
        energy += amount;
    }

    public void go() {
        System.out.println("You chose to go. Energy decreases by 2.");
        decreaseEnergy(2);
    }

    public void grab() {
        System.out.println("You chose to grab. Energy decreases by 1.");
        decreaseEnergy(1);
    }

    public void open() {
        System.out.println("You chose to open. Energy decreases by 1.");
        decreaseEnergy(1);
    }
}
