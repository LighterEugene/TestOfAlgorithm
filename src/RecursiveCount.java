import java.util.Arrays;

public class RecursiveCount {

        private static int count(int[] list) {// метод рекурсивно высчитывает количество элементов
            if (list.length == 0) {
                return 0;

            }
            return 1 + count(Arrays.copyOfRange(list, 1, list.length));// каждый раз добавляет 1 и делает  вновь
            // рекурсию с добавлением единицы до тех пор пока элементы не равны 0, в итоге возвращаю сумму элементов.
        }

        public static void main(String[] args) {
            System.out.println(count(new int[]{0, 1, 2, 3, 4, 5})); // 6
        }
    }

