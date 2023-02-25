import java.util.Scanner;

public class Practicum {
    public static void main(String[] argh) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scan.nextInt();
        if (isLeapYear(year)) {
            System.out.println("12.09." + year);
        } else System.out.println("13.09." + year);

    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 != 0) | ((year % 100 == 0) & (year % 400 != 0)))  //если год делится на 4 с остатком или если он делится на 100 без остатка, но на 400 с остатком
            return false;
        return true;
    }
}