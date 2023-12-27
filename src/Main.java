import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int lengthArrays = 10000;

        /**
        1. **Сортировка вставками (Insertion Sort)**:
        - Сложность: O(n^2) в худшем случае.
                - Лучше работает на небольших массивах или частично отсортированных массивах.
        - Прост в понимании и реализации.

        2. **Сортировка выбором (Selection Sort)**:
        - Сложность: O(n^2) для всех случаев.
                - Хотя она имеет такую же сложность, как и сортировка пузырьком, она обычно работает быстрее на практике.

        3. **Сортировка слиянием (Merge Sort)**:
        - Сложность: O(n log n) для всех случаев.
                - Эффективный алгоритм, основанный на принципе "разделяй и властвуй".
                - Гарантированно стабильная и эффективная сортировка.

        4. **Быстрая сортировка (Quick Sort)**:
        - Сложность: O(n^2) в худшем случае, но O(n log n) в среднем и лучшем случае.
                - Один из самых быстрых алгоритмов сортировки на практике.
                - Также основан на принципе "разделяй и властвуй".

        5. **Сортировка кучей (Heap Sort)**:
        - Сложность: O(n log n) для всех случаев.
                - Использует бинарную кучу для сортировки.

        6. **Сортировка подсчетом (Counting Sort), радиксная сортировка (Radix Sort) и блочная сортировка (Bucket Sort)**:
        - Эти алгоритмы являются несравнивающимися методами сортировки и могут быть эффективными в определенных условиях.
        */


        sortWithStatistic(getArray(lengthArrays), new Bubble()); //Сложность: O(n^2)
        sortWithStatistic(getArray(lengthArrays), new Java());



    }

    private static void sortWithStatistic(int[] arr, Sortable sortable) {
        System.out.println("Сортировка: " + sortable.getClass().getCanonicalName());
        System.out.println("Массив до сортировки: " + Arrays.toString(arr));

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        long startTime = System.nanoTime();

        sortable.sort(arr);

        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        long usedMemory = memoryAfter - memoryBefore;

        System.out.println("Массив после сортировки: " + Arrays.toString(arr));
        System.out.println("Время выполнения: " + elapsedTime / 1000000 + " милисекунд");
        System.out.println("Использовано памяти: " + usedMemory + " байт");
    }

    private static int[] getArray(int lenght) {
        Random random = new Random();
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
}
