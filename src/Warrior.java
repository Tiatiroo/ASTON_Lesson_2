public class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name,health);
    }

    public void specialAbility(Enemy firstEnemy, Enemy secondEnemy) {
        if (isAlive()) {
            if (firstEnemy.isAlive() && secondEnemy.isAlive()) {
                System.out.println("Воин " + getName() + " закручивается ударив топором в первый раз");
                firstEnemy.takeDamage(8);
                System.out.println("А затем второй раз");
                secondEnemy.takeDamage(8);
                return;
            }
            System.out.println("Невозможно атаковать врагов, кто то из них убит!");
            return;
        }
        System.out.println("Воин не может атаковать, он мертв!");
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            if (enemy.isAlive()) {
                System.out.println("Воин " + getName() + " атакует топором");
                enemy.takeDamage(2);
                return;
            }
            System.out.println("Невозможно атаковать врага, он убит");
            return;
        }
        System.out.println("Воин не может атаковать, он мертв!");
    }
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        System.out.println("Воин " + getName() + " получил урон: " + damage + "\n" + "Осталось здоровья у " + getName() + ": " + getHealth());
        if (!isAlive()) {
            System.out.println("Воин " + getName() + " погиб!");
        }
    }
}
