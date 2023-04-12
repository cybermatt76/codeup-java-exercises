package rpg;

public class RPG {

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.name = "Arata";
        fighter1.hitPoints = 17;
        fighter1.maxDamage = 14;
        fighter1.printStats();

        Fighter fighter2 = new Fighter();
        fighter2.name = "The Dude";
        fighter2.hitPoints = 25;
        fighter2.maxDamage = 23;
        fighter2.printStats();
    }
}
