package ru.mirea.unit_testing_training.practice.gribbirg;

public class NumberAnalyzer {
    /**
     * Проверка числа на идеальность.
     * Идеальное число - то, которое является суммой всех своих делителей, не считая себя.
     *
     * @param num число
     * @return является ли идеальным
     * @see <a href="https://leetcode.com/problems/perfect-number">Задача</a>
     */
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;

        int sum = 0;

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                int other = num / i;
                if (other != i && other != num) {
                    sum += other;
                }
            }
        }

        return sum == num;
    }

    /**
     * Проверка числа на уродливость.
     * Уродливое число - то, у которого все простые множители это 2, 3 и 5.
     *
     * @param n число
     * @return является ли уродливым
     * @see <a href="https://leetcode.com/problems/ugly-number">Задача</a>
     */
    public boolean isUgly(int n) {
        int num = n;

        if (num == 0) return false;

        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;

        return num == 1;
    }
}
