package lab2.ch1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(int health, int damage, String name) {
        this.health = health;
        this.damagePerAttack = damage;
        this.name = name;
    }

    public void attack( Fighter fighter){
        fighter.health = fighter.health - this.damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}