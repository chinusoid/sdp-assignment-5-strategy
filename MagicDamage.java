public class MagicDamage implements DamageStrategy {
    @Override
    public int calculateDamage(int attack, int armor) {
        return attack;
    }
}
