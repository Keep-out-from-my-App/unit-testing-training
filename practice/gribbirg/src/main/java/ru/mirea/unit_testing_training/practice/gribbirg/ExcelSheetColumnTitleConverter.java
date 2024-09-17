package ru.mirea.unit_testing_training.practice.gribbirg;

import java.util.ArrayList;

public class ExcelSheetColumnTitleConverter {
    private final static int NOTATION_BASE = 26;

    /**
     * Преобразует число в имя соответствующей колонки.
     *
     * @param columnNumber число
     * @return имя колонки
     * @link <a href="https://leetcode.com/problems/excel-sheet-column-title">Задача</a>
     */
    public String convertToTitle(int columnNumber) {
        int num = columnNumber;
        ArrayList<String> res = new ArrayList<>();

        while (num > 0) {
            num -= 1;
            res.add(getChar(num % NOTATION_BASE));
            num /= NOTATION_BASE;
        }

//        Collections.reverse(res);
        return String.join("", res);
    }

    /**
     * Преобразует имя колонки в её номер.
     *
     * @param columnTitle имя колонки
     * @return номер колонки
     * @link <a href="https://leetcode.com/problems/excel-sheet-column-number">Задача</a>
     */
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for (char c : columnTitle.toCharArray()) {
            res *= NOTATION_BASE;
            res += getCharPower(c);
        }
        return res;
    }

    private String getChar(int num) {
        return String.valueOf((char) ('A' + num));
    }

    private int getCharPower(char c) {
        return ((int) c) - 'A' + 1;
    }
}
