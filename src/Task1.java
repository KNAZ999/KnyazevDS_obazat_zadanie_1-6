//Напишите метод, увеличивающий четные по модулю элементы
//массива вещественных чисел на 20%.

public class Task1 {
    public static void main(String[] args) {
        float[] mas1 = {76.3f, 42.6f, 1.1f, 8.12f, 88.9f};
        int k = 0;
        for (int i=0; i < mas1.length; i++){
            if (k == i % 2) {mas1[i]+=(mas1[i]/100*20);}
            System.out.print(mas1[i]+ "\t");
        }
    }
}
