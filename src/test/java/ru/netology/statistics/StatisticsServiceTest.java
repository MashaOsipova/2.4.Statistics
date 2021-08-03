package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



    class StatsServiceTest {

        @Test
        void sumSales() {
            StatisticsService service = new StatisticsService();

            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 180;

            int actual = service.sumSales(sales);

            assertEquals(expected, actual);
        }

        @Test
        void middle() {
            StatisticsService service = new StatisticsService();

            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 15;

            int actual = service.middle(sales);

            assertEquals(expected, actual);
        }

        @Test
        void max() {
            StatisticsService service = new StatisticsService();

            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 8;

            int actual = service.max(sales);

            assertEquals(expected, actual);
        }

        @Test
        void min() {
            StatisticsService service = new StatisticsService();

            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 9;

            int actual = service.min(sales);

            assertEquals(expected, actual);
        }

        @Test
        void belowMiddle() {
            StatisticsService service = new StatisticsService();

            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 5;

            int actual = service.belowMiddle(sales);

            assertEquals(expected, actual);
        }

        @Test
        void aboveMiddle() {
            StatisticsService service = new StatisticsService();

            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 5;

            int actual = service.aboveMiddle(sales);

            assertEquals(expected, actual);
        }
    }