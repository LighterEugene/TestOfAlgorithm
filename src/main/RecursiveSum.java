package main;

import java.util.Arrays;

public class RecursiveSum {

    private static int sum(int[] arr) {
        if (arr.length == 0) {// если длина массива равна нулю вернуть 0
            return 0;
        } else { // иначе вернуть сумму первого элемента и результата функции  где первый элемент будет следующим
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4})); // 10
    }
}
