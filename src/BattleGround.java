public class BattleGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Archer",15);
        Mage mage = new Mage("Mage",20);
        Warrior warrior = new Warrior("Warrior",30);

        Werewolf werewolf = new Werewolf(45);
        Zombie zombie = new Zombie(15);

        archer.specialAbility(zombie);
        warrior.specialAbility(zombie,werewolf);
        mage.attackEnemy(zombie);

        zombie.attackHero(mage);
        werewolf.attackHero(mage);




    }
}