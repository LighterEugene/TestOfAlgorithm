public class BinarySearch {
    // has to return boxed integer in order to comfort to interface defined in the book
    private static Integer binarySearch(int[] list, int item) {
        int low = 0; // минимальный индекс
        int high = list.length - 1; // максимальный индекс

        while (low <= high) {// пока индексы не сравнялись
            int mid = (low + high) / 2; // вычисление среднего индекса
            int guess = list[mid]; // значение догадка которое сравнивается с загаданным
            if (guess == item) {
                return mid; // если догадка равна заданному значению = возвращаем.
            }
            if (guess > item) { // если отгадка, больше искомого значения
                high = mid - 1; // изменяем максимальный индекс ниже ранее установленного среднего
            } else {
                low = mid + 1; //// изменяем минимальный индекс выше ранее установленного среднего
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, 3)); // 1
        System.out.println(binarySearch(myList, 2)); // null
    }
}

