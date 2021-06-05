package main;

public class LoopSum {

    private static int sum(int[] arr) {
        int total = 0; // переменная куда собираем сумму
        for (int x = 0; x < arr.length; x++) { // пробегаем по массиву и собираем туда все значение суммируя их
            total += arr[x];
        }

        return total; // возвращаем сумму
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4})); // 10
    }
}