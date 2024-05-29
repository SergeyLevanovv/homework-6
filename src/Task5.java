import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите здоровье дракона: ");
        int dragonHealth = scanner.nextInt();

        System.out.print("Введите атаку дракона: ");
        int dragonAttack = scanner.nextInt();

        System.out.print("Введите здоровье одного копейщика: ");
        int knightHealth = scanner.nextInt();

        System.out.print("Введите атаку одного копейщика: ");
        int knightAttack = scanner.nextInt();

        System.out.print("Введите количество копейщиков: ");
        int knightCount = scanner.nextInt();

        int remainingDragonHealth = dragonHealth;
        int knightsAlive = knightCount;

        System.out.println("Лог боя:");

        for (int i = 1; i <= knightCount; i++) {
            int totalKnightAttack = knightAttack * i;

            if (totalKnightAttack >= remainingDragonHealth) {
                System.out.println("Дракон атакует и побеждает.");
                break;
            }

            System.out.println("Итерация " + i);
            System.out.println("Копейщики атакуют (урон " + totalKnightAttack + ") – у дракона осталось " + (remainingDragonHealth - totalKnightAttack) + " жизней");

            remainingDragonHealth -= totalKnightAttack;

            if (remainingDragonHealth <= 0) {
                System.out.println("Дракон побежден.");
                break;
            }

            System.out.println("Дракон атакует – осталось " + knightsAlive + " копейщиков");

            if (dragonAttack > knightHealth) {
                int knightsKilled = (int) Math.ceil((double) dragonAttack / knightHealth);
                knightsAlive -= knightsKilled;

                if (knightsAlive < 0) {
                    knightsAlive = 0;
                }

                int remainingKnightHealth = knightHealth - (dragonAttack % knightHealth);

                System.out.println("Один из копейщиков ранен (осталось " + remainingKnightHealth + " жизней)");
                System.out.println("Копейщики атакуют – у дракона осталось " + remainingDragonHealth + " жизней");
            }

            System.out.println();
        }
    }
}

