public class Werewolf extends Enemy{

    public Werewolf(int health) {
        super(health);
    }

    public void specialAbility(Hero hero) {
        if (isAlive()) {
            if (hero.isAlive()) {
                System.out.println("Вервольф ненадолго превращается атакуя острыми когтями");
                hero.takeDamage(15);
                return;
            }
            System.out.println("Невозможно атаковать, герой убит");
        }
        System.out.println("Верфольф не может атаковать, он мертв!");
    }
    @Override
    public void attackHero(Hero hero) {
        if (isAlive()) {
            if (hero.isAlive()) {
                System.out.println("Вервольф атакует");
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
        System.out.println("Верфольф получил урон: " + damage + "\n" + "Осталось здоровья: " + getHealth());
        if (!isAlive()) {
            System.out.println("Вервольф погиб!");
        }
    }
}
