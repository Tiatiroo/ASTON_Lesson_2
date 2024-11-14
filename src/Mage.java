public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name,health);
    }
    public void specialAbility(Hero hero){
        if( isAlive()) {
            if (hero.isAlive()) {
                System.out.println("Маг не воскрешает живых!");
                return;
            }
            hero.setHealth(10);
            System.out.println("Произнеся заклинание маг воскрешает " + hero.getName());
            return;
        }
        System.out.println("Маг не может произносить заклинание, он мертв!");
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            if (enemy.isAlive()) {
                System.out.println("Маг " + getName() + " атакует заклинанием");
                enemy.takeDamage(2);
                return;
            }
            System.out.println("Невозможно атаковать врага, он убит");
            return;
        }
        System.out.println("Маг не может атаковать, он мертв!");
    }
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        System.out.println("Маг " + getName() + " получил урон: " + damage + "\n" + "Осталось здоровья у " + getName() + ": " + getHealth());
        if (!isAlive()) {
            System.out.println("Маг " + getName() + " погиб!");
        }
    }
}
