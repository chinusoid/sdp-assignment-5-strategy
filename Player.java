public class Player {
    private DamageStrategy damageStrategy;

    public Player(DamageStrategy damageStrategy) {
        this.damageStrategy = damageStrategy;
    }

    public void setDamageStrategy(DamageStrategy damageStrategy) {
        this.damageStrategy = damageStrategy;
    }

    public int attack(int damage, int armor) {
        return damageStrategy.calculateDamage(damage, armor);
    }
}
