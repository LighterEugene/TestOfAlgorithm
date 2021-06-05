import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    private static List<Integer> selectionSort(List<Integer> arr) { // сортировка выбором
        List<Integer> newArr = new ArrayList<>(arr.size()); // создаём новый лист

        int size = arr.size(); // заносим размером листа в интовую перменную
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(arr);// возвращает минимальный  по элементу индекс
            newArr.add(arr.get(smallest)); // добавляет в новый массив найденный ранее элемент по индексу

            arr.remove(smallest);// убираем из старого массива найденный минимальный по индексу элемент,
                                // чтобы дать возможность найти в цикле следущий минимальный за ним в массиве arr
        }

        return newArr;
    }

    private static int findSmallest(List<Integer> arr) { // поиск самого маленького индекса
        int smallest = arr.get(0); // первый элемент листа заносит в интовое значения
        int smallestIndex = 0;//  назначаем минимальный элемент
        for (int i = 0; i < arr.size(); i++) {// алгоритм поиска минимального элемента
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;// возвращает индекс минимального элемента
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr)); //[2, 3, 5, 6, 10]
    }
}