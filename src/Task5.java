//. Напишите метод который:
//- принимает параметром массив целых чисел;
//- выбирает случайным образом одно число из массива;
//- находит крайнее правое и крайнее левое вхождение этого числа в
//массив;
//- возвращает «размах» , т.е. количество элементов между крайними
//вхождениями
//(включая сами вхождения);
//- если вхождение единственное, то вернуть 1.

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        int[] array = new int[20];
        System.out.println("Source array [20]:");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println("Result: " + foo(array));
    }

    private static int foo(int[] array) {
        int randomElem = array[new Random().nextInt(array.length - 1)];
        System.out.println("\nRandom element: " + randomElem);
        int leftIndex = 0, rightIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == randomElem) {
                leftIndex = i;
                break;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == randomElem) {
                rightIndex = i;
                break;
            }
        }
        if (leftIndex == rightIndex) return 1;
        else {
            System.out.printf("From %d to %d\n", leftIndex, rightIndex);
            return rightIndex - leftIndex + 1;
        }
    }
}
