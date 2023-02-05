package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    // Сумму всех продаж
    public int sumSales(int[] sales) {
        int sum = (int) Arrays.stream(sales).sum();
        return sum;
    }

    // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    // Среднюю сумму продаж в месяц
    public int getAverageSum(int[] sales) {

        int sum = (int) Arrays.stream(sales).sum();
        int averageSum = sum / sales.length;
        return averageSum;
    }

    // Количество месяцев, в которых продажи были ниже среднего
    public int getAboveAverageMonth(int[] sales) {
        int averageSum = getAverageSum(sales);
        int sumMonth = 0;
        for (int x : sales) {
            if (x < averageSum) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }

    // Количество месяцев, в которых продажи были выше среднего
    public int getBelowAverageMonth(int[] sales) {
        int averageSum = getAverageSum(sales);
        int sumMonth = 0;
        for (int x : sales) {
            if (x > averageSum) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }
}






