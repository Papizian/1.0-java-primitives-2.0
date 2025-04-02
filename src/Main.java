import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bonus = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество денег на счёте клиента");
        int schet = scanner.nextInt();
        System.out.print("Введите сумму пополнения счёта");
        int summa = scanner.nextInt();

        if (summa > 999) {
            bonus = summa / 100;
        }

        System.out.println("Сумма на вашем счёте: " + (schet + summa));
        System.out.println("Вам начислено бонусов: " + bonus);
        System.out.println("Общая сумма на счёте: " + (bonus + summa + schet));
    }
}