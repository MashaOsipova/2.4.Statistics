package ru.netology.statistics;

public class StatisticsService {

    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int middle(long[] sales) {
        long average = 0;
        long sum = sumSales(sales);
        average = sum / sales.length;
        return (int) average;
    }

    public int min(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int max(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowMiddle(long[] sales) {
        int quantityOfMonth = 0;
        int average = middle(sales);
        for (long sale : sales) {
            if (sale < average) {
                quantityOfMonth++;
            }
        }
        return quantityOfMonth;
    }

    public int aboveMiddle(long[] sales) {
        int quantityOfMonth = 0;
        int average = middle(sales);
        for (long sale : sales) {
            if (sale > average) {
                quantityOfMonth++;
            }
        }
        return quantityOfMonth;
    }
}