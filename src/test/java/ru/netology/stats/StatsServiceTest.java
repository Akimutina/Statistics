package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void findTheSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSumSales = 180;
        int actualSumSales = service.sumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void findMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void findMinMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void findAverageSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSum = 15;
        int actualAverageSum = service.getAverageSum(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void getAboveAverageMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverageMonth = 5;
        int actualAboveAverageMonth = service.getAboveAverageMonth(sales);

        Assertions.assertEquals(expectedAboveAverageMonth, actualAboveAverageMonth);
    }

    @Test
    public void getBelowAverageMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverageMonth = 5;
        int actualBelowAverageMonth = service.getBelowAverageMonth(sales);

        Assertions.assertEquals(expectedBelowAverageMonth, actualBelowAverageMonth);
    }
}
