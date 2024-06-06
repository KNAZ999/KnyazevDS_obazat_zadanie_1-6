//Напишите метод, считывающий строку со стандартного ввода, который
//возвращает три символа из середины полученной строки. Обязательно
//проведите проверку на корректность введенной строки (в строке
//должно быть нечетное количество символов, но не меньше трех),
// так, чтобы в случае некорректных данных можно было на выбор либо
//завершить программу, либо повторить попытку (указав на ошибку).

import java.util.Scanner;

public class Task3 {
    public static void main() {

        while (true) {
            System.out.print("Введите слово с нечетным количеством букв: ");
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            if (word.length() < 3) {
                System.out.println("Минимальное количество букв в слове должно быть равно 3. ");

                String answer;
                boolean yn;

                System.out.println("You want to continue : (y/n) ");
                while (true) {
                  answer = sc.nextLine().trim().toLowerCase();
                  if (answer.equals("y")) {
                    yn = true;
                    System.out.println("Повторяем ввод слова ");
                    break;
                  } else if (answer.equals("n")) {
                    yn = false;
                    System.out.println("Завершаем программу ");
                    System.exit(0);;
                  } else {
                     System.out.println("Вы допустили ошибку при выборе. Пожалуйста, введите y или n");
                  }
                }

            } else if (word.length() % 2 == 0) {
                System.out.println("Количество букв в слове должно быть нечетным." +
                         "Введите N - завершить программу или Y, чтобы ввести новое слово");
                String answer;
                boolean yn;

                System.out.println("You want to continue : (y/n) ");
                while (true) {
                  answer = sc.nextLine().trim().toLowerCase();
                  if (answer.equals("y")) {
                    yn = true;
                    System.out.println("Повторяем ввод слова ");
                    break;
                  } else if (answer.equals("n")) {
                    yn = false;
                    System.out.println("Завершаем программу ");
                    System.exit(0);;
                  } else {
                     System.out.println("Вы допустили ошибку при выборе. Пожалуйста, введите y или n");
                  }
                }

            } else {
                    String word2;
                    int n = (word.length() + 1) / 2;
                    word2 = word.substring(n - 2, n + 1);
                    System.out.println(word2);}



            }
        }
    }


