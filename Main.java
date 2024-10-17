import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод длины сторон квадратов
        System.out.print("Введите A: ");
        int A = scanner.nextInt();
        System.out.print("Введите B: ");
        int B = scanner.nextInt();
        System.out.print("Введите C: ");
        int C = scanner.nextInt();
        System.out.print("Введите D: ");
        int D = scanner.nextInt();
        
        // Массив квадратов
        int[] squares = {A, B, C, D};
        
        // Сортируем массив в порядке убывания
        Arrays.sort(squares);
        
        // Перевернем массив для упрощения проверки
        for (int i = 0; i < squares.length / 2; i++) {
            int temp = squares[i];
            squares[i] = squares[squares.length - 1 - i];
            squares[squares.length - 1 - i] = temp;
        }
        
        // Подсчет количества квадратов, которые можно разместить
        int count = 1; // Начинаем с первого квадрата
        for (int i = 1; i < squares.length; i++) {
            if (squares[i] < squares[i - 1]) {
                count++;
            } else {
                break; // Если не выполняется условие, выходим из цикла
            }
        }
        
        // Вывод результата
        System.out.println("Количество квадратов, которые удастся разместить: " + count);
        
        scanner.close();
    }
}
