//Напишите метод, считывающий строку со стандартного ввода, который
//возвращает три символа из середины полученной строки. Обязательно
//проведите проверку на корректность введенной строки (в строке
//должно быть нечетное количество символов, но не меньше трех),
// так, чтобы в случае некорректных данных можно было на выбор либо
//завершить программу, либо повторить попытку (указав на ошибку).

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s2;

        while (true) {
            System.out.print("Input string: ");
            String s = scan.nextLine();

            if (s.length() < 3) {
                System.out.println("Minimum length - 3! Try again.");
            } else if (s.length() % 2 == 0) {
                System.out.println("Length is even! Try again");
            } else {
                int n = (s.length() + 1) / 2;
                s2 = s.substring((n - 2), n + 1);
                System.out.println(s2);
                break;
            }
        }
    }
}
