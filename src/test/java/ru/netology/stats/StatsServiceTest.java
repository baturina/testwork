package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSum() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        StatsService service = new StatsService();
        int actual = service.sum(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        StatsService service = new StatsService();
        int actual = service.average(purchases);
        assertEquals(expected, actual);
    }


    @Test
    void shouldReturnMonthNumberWithMax() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        StatsService service = new StatsService();
        int actual = service.monthWithMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthNumberWithMin() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        StatsService service = new StatsService();
        int actual = service.monthWithMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthCountWithLessThenAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        StatsService service = new StatsService();
        int actual = service.monthCountWithLessThenAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMonthCountWithMoreThenAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        StatsService service = new StatsService();
        int actual = service.monthCountWithMoreThenAverage(purchases);
        assertEquals(expected, actual);
    }
}