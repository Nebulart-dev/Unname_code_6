// Создайте массив из 10 целых чисел и заполните его числами от 1 до 10. Выведите массив на экран.
/*
public class Main {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        System.out.println("Массив: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
*/

//Найдите сумму элементов массива. Создайте массив из 5 элементов и вычислите сумму всех чисел в массиве.
/*
public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
*/

// Найдите максимальный элемент массива. Создайте массив из 10 целых чисел и найдите максимальное значение.
/*
public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
    }
}
*/

// Найдите минимальный элемент массива. Создайте массив из 10 целых чисел и найдите минимальное значение.
/*
public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Максимальное значение: " + min);
    }
}
 */

// Посчитайте количество чётных чисел в массиве.
/*
public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Кол-во четных чисел: " + count);
    }
}
*/

// Посчитайте количество нечётных чисел в массиве.
/*
public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 1) {
                count++;
            }
        }
        System.out.println("Кол-во нечетных чисел: " + count);
    }
}
 */

// Посчитайте среднее арифметическое всех элементов массива.
/*
public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double av = sum / 2;
        System.out.println("Среднее: " + av);
    }
}
*/

// Выведите все элементы массива в обратном порядке.
/*
public class Main {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
*/

// Заполните массив случайными числами от 1 до 100 и выведите его на экран.
/*
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[101];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1; //случ. генерация
        }
        System.out.println("Случ. числа: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
 */

//Найдите разницу между максимальным и минимальным элементами массива.
/*
public class Main {
    public static void main(String[] args) {
        int[] num = {4, 21, 10, 9, 13, 30, 2, 1};
        int max = num[0];
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Макс. значение: " + max);
        System.out.println("Мин. значение: " + min);
        int diff = max - min;
        System.out.println("Разница между Макс и Мин: " + diff);
    }
}
