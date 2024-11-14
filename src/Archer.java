public class Archer extends Hero {


    public Archer(String name, int health) {
        super(name, health);
    }
    public void specialAbility(Enemy enemy){
        if (isAlive()) {
            if (enemy.isAlive()) {
                System.out.println("Лучник " + getName() + " натягивает тетиву посильнее... ");
                if (Math.random() > 0.5){
                    enemy.takeDamage(15);
                    System.out.println("И попадает в голову!");
                    return;
                }
                System.out.println("Он промахивается!");
                return;
            }
            System.out.println("Невозможно атаковать врага, он убит");
            return;
        }
        System.out.println("Лучник не может атаковать, он мертв!");
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        if (isAlive()) {
            if (enemy.isAlive()) {
                System.out.println("Лучник " + getName() + " атакует с лука");
                enemy.takeDamage(2);
                return;
            }
            System.out.println("Невозможно атаковать врага, он убит");
            return;
        }
        System.out.println("Лучник не может атаковать, он мертв!");
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        System.out.println("Лучник " + getName() + " получил урон: " + damage + "\n" + "Осталось здоровья у " + getName() + ": " + getHealth());
        if (!isAlive()) {
            System.out.println("Лучник " + getName() + " погиб!");
        }
    }
}
