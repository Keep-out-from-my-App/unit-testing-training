package ru.mirea.unit_testing_training.practice.gribbirg;

public class AreaCalculator {
    /**
     * Считает суммарную площадь двух прямоугольников по координатам.
     * Учитывается пересечение прямоугольников.
     *
     * @param ax1 x левого нижнего угла 1ого прямоугольника
     * @param ay1 y левого нижнего угла 1ого прямоугольника
     * @param ax2 x правого верхнего угла 1ого прямоугольника
     * @param ay2 y правого верхнего угла 1ого прямоугольника
     * @param bx1 x левого нижнего угла 2ого прямоугольника
     * @param by1 y левого нижнего угла 2ого прямоугольника
     * @param bx2 x правого верхнего угла 2ого прямоугольника
     * @param by2 y правого верхнего угла 2ого прямоугольника
     * @return занимаемую двумя прямоугольниками площадь
     * @link <a href="https://leetcode.com/problems/rectangle-area">Задача</a>
     */
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int aArea = getArea(ax1, ay1, ax2, ay2);
        int bArea = getArea(bx1, by1, bx2, by2);

        int inx1 = Math.max(ax1, bx1);
        int iny1 = Math.max(ay1, by1);
        int inx2 = Math.min(ax2, bx2);
        int iny2 = Math.min(ay2, by2);
        int inArea = (inx1 < inx2 && iny1 < iny2) ? getArea(inx1, iny1, inx2, iny2) : 0;

        return aArea + bArea - inArea;
    }

    private int getArea(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (y2 - y1);
    }
}
