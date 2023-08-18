public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.NUCLEAR, "Мечь из слизи");
        Boss boss = new Boss("Тень", 1000, bossWeapon);

        Weapon skeletonWeapon = new Weapon(WeaponType.LIGHT, "Bow");
        Skeleton skeleton1 = new Skeleton("Skeletor", 500, skeletonWeapon, 20);
        Weapon skeletWeapon = new Weapon(WeaponType.SPIRITUAL, "Ancient Bow");
        Skeleton skeleton2 = new Skeleton("Skully", 400, skeletWeapon, 15);

        System.out.println(boss.printInfo());
        System.out.println("\n" + skeleton1.printInfo());
        System.out.println("\n" + skeleton2.printInfo());
    }
}