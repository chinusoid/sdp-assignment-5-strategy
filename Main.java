public class Main {
    public static void main(String[] args) {
        Player player = new Player(new PhysicalDamage());
        int attack = 40;
        int armor = 15;

        System.out.println("Physical attack: " + player.attack(attack, armor));

        player.setDamageStrategy(new MagicDamage());
        System.out.println("Magic attack: " + player.attack(attack, armor));

        player.setDamageStrategy(new PiercingDamage());
        System.out.println("Piercing attack: " + player.attack(attack, armor));
    }
}
