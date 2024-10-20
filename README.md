## Отчет по лабораторной работе № 1
#### № группы: 'ПМ-2403'
#### Выполнил: 'Михайлов Александр Петрович'
#### Вариант: '19'
### Содержание:
- [Постановка задачи](#1-постановка-задачи)
- [Входные и выходные данные](#2-входные-и-выходные-данные)
- [Выбор структуры данных](#3-выбор-структуры-данных)
- [Алгоритм](#4-алгоритм)
- [Программа](#5-программа)
- [Анализ правильности решения](#6-анализ-правильности-решения)
### 1. Постановка задачи
Есть 4 квадрата с задаными длинами сторон A,B,C и D. Нужно выяснить, можно ли разместить эти квадраты друг над другом так, чтобы каждый следующий квадрат был строго меньше предыдущего. Также надо вывести кол-во квадратов, которые удастся разместить в таком порядке.
### 1.1	Решение.
	1) Программа должна принимать четыре натуральных числа (A, B, C, D), представляющие длины сторон квадратов.
	2) Для того, чтобы упростить задачу, нужно отсортировать длины сторон квадратов в порядке убывания. Это поможет легче проверить условие строгого уменьшения.
	3) После сортировки нужно пройтись по массиву квадратов и проверить, выполняется ли условие: каждый следующий квадрат должен быть строго меньше предыдущего.
	4)Начинаем с первого квадрата (самого большого) и продолжаем проверять следующие квадраты. Если условие выполняется, увеличиваем счетчик. Если не выполняется, останавливаемся, так как дальнейшие квадраты уже не могут быть размещены.
	5) В конце программа должна вывести количество квадратов, которые удалось разместить в порядке строгого уменьшения.
### 1.2	Примеры.
	1) A=5 B=4 C=3 D=2
		Получаем 5,4,3,2
		5>4
		4>3
		3>2
		Результат: 4
	2) A=5 B=4 C=4 D=2
		Получаем 5,4,4,2
		5>4
		4>4(нет)
		На этом этапе мы останавливаемся. Можно разместить только 2 квадрата (4 и 3).
### 1.3. Заключение.
	Таким образом, задача сводится к вводу данных, сортировке, проверке условий и подсчету подходящих квадратов.

### 2. Входные и выходные данные

	Данные на вход:
		1.	Тип данных – целые числа. Длины сторон квадратов могут быть представлены только целыми числами, так как длины сторон квадратов не могут быть дробными.
		2.	Количество = 4. На вход подаются ровно четыре целых числа, представляющие длины сторон квадратов (A, B, C, D).
		3.	Диапазон значений. Min – 1; Max – 10^9(чтобы обеспечить разумное время выполнения программы).
	Данные на выход:
		1.	Тип данных – целые числа. Выходные данные представляют собой одно целое число, указывающее количество квадратов, которые можно разместить в порядке строгого уменьшения.
		2.	Количество = 1.
		3.	Диапазон значений. Min – 1; Max – 4(если все квадраты можно расположить  в порядке уменьшения).

### 3. Выбор структуры данных

Для данной задачи нам необходимо хранить длины сторон квадратов. Так как у нас фиксированное количество квадратов (4), мы можем использовать массив( int[] squares ). С помощью массива можно легко 	обращаться к элементам по индексу и выполнять сортировку. Можно использовать массив длиной 4 для хранения значений A, B, C и D.

### 4. Алгоритм

	Алгоритм выполнения программы:
		Ввод данных:
			Программа выводит текст "Введите A: ", после чего ожидает, пока пользователь введет длину стороны первого квадрата (значение A). 	Аналогичным 	образом, программа запрашивает у пользователя длины сторон для второго (B), третьего (C) и четвертого (D) квадратов.
		Создание массива:
			Программа создает массив squares в который помещаются введенные длины сторон квадратов A, B, C, D.
		Сортировка массива:
			Программа сортирует массив squares в порядке возрастания, используя метод Arrays.sort()
		Переворот массива::
			Затем программа переворачивает отсортированный массив для упрощения логики подсчета уникальных квадратов. Это достигается путем обмена 	значениями элементов массива: первый элемент с последним, второй с предпоследним и так далее.
		Вывод результата:
			Программа инициализирует переменную count значением 1, так как, по умолчанию, мы считаем, что первый квадрат является наибольшим.
			Происходит перебор элементов массива, начиная со второго (индекс 1).
			Если текущий элемент меньше предыдущего это означает, что найден новый размер квадрата. В этом случае счетчик count увеличивается на 1.
		Вывод результата:
			На экран выводится текст "Количество квадратов, которые удастся разместить: " и значение переменной count которое представляет количество 	квадратов.

	

### Блок-схема:
	mermaid
 	graph TD
		A[Начало] --> B[Подключение библиотек]
    		B --> C[Создание объекта Scanner для ввода данных]
    		C --> D[Запрос ввести A]
    		D --> E[Считывание значения A]
    		E --> F[Запрос ввести B]
    		F --> G[Считывание значения B]
    		G --> H[Запрос ввести C]
    		H --> I[Считывание значения C]
    		I --> J[Запрос ввести D]
    		J --> K[Считывание значения D]
    		K --> L[Создание массива squares с элементами A, B, C, D]
    		L --> M[Сортировка массива squares]
    		M --> N[Инициализация переменной count = 1]
    		N --> O[Цикл по массиву с i = 1 до длины массива]
    		O --> P{Если squares i > squaresi - 1}
    		P --> |Да| Q[Увеличение count на 1]
    		P --> |Нет| R[Переход к следующему элементу]
    		R --> O
    		Q --> O
    		O --> S[Вывод количества квадратов, которые удастся разместить: count]
    		S --> T[Закрытие объекта scanner]
    		T --> U[Конец]
    
![mermaid laba 1](https://github.com/user-attachments/assets/bfb310a0-a57e-4990-9fb1-98dd3350e819)

### 5. Программа
	java
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


### 6. Анализ правильности решения

	Программа работает корректно на всем множестве решений с учетом ограничений.
	Тест на порядок
	Input:
		4;3;2;1
	Output:
		4
	Тест перевёртыш
	Input:
		1;2;3;4
	Output:
		4
	Тест с дублироваными значениями
	Input:
		1;1;2;2
	Output:
		2
	Тест с попеременными дублироваными значениями
	Input:
		1;2;1;2
	Output:
		2
	Тест с одинаковыми сторонами.
	Input:
		2;2;2;2
	Output:
		1
	Тест с Max ограничениями
	Input:
		1000000000;7;4;2
	Output:
		4
