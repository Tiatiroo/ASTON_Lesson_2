public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        if (isAlive()) {
            if (hero.isAlive()) {
                System.out.println("Зомби атакует");
                hero.takeDamage(5);
                return;
            }
            System.out.println("Невозможно атаковать, герой убит");
        }
        System.out.println("Враг не может атаковать, он мертв!");
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        System.out.println("Зомби получил урон: " + damage + "\n" + "Осталось здоровья: " + getHealth());
        if (!isAlive()) {
            if (Math.random() < 0.1) {
                setHealth(getHealth() + damage + 10);
                System.out.println("Зомби погиб! Но стоп, он восстал из мертвых!" + "\n" + "Осталось здоровья: " + getHealth());
                return;
            }
            System.out.println("Зомби погиб!");
        }
    }
}
