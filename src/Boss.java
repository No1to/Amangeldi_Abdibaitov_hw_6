public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Имя Босса: " + getName() + "\n" +
                "Жизнь Босса: " + getHealth() + "\n" +
                "Оружие Босса: " + weapon.getName() + "\n" +
                "Тип: " + weapon.getType();
    }
}
