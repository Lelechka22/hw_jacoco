package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxInMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 75, 8, 6, 11, 11};
        long expected = 75;

        long actual = service.findMax(incomesInBillions);
    }

    @Test
    void findQuantityMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 100, 4, 5, 3, 8, 6, 11, 11, 100};
        long expected = 100;

        long actual = service.findMax(incomesInBillions);
    }
}