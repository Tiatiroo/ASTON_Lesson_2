public abstract class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackHero(Hero hero);

    public abstract void takeDamage(int damage);

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
