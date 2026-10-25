public class PhysicalDamage implements DamageStrategy {
    @Override
    public int calculateDamage(int attack, int armor) {
        return Math.max(0, attack - armor);
    }
}
