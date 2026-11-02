public class Main {
    public static void main(String[] args) {
        GameCharacter soldier = new GameCharacter("Soldier"); // slow, only once
        soldier.addWeapon("Gun");

        GameCharacter soldier2 = soldier.copy();               // fast
        soldier2.setName("Soldier-2");
        soldier2.addWeapon("Knife");

        System.out.println(soldier);
        System.out.println(soldier2);
    }
}