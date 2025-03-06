package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        if (start > finish) {
            return 0;
        }
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Сумма от 0 до 10 = " + sum(0, 10));
        System.out.println("Сумма от 3 до 8 = " + sum(3, 8));
        System.out.println("Сумма от 1 до 1 = " + sum(1, 1));
        System.out.println("Сумма от 0 до 5 = " + sum(0, 5));
        System.out.println("Сумма от 15 до 3 = " + sum(15, 3));
        System.out.println("Сумма от -10 до 10 = " + sum(-10, 10));
    }
}
