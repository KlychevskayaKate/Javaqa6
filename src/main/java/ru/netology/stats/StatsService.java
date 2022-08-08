package ru.netology.stats;

public class StatsService {

    public long amount(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;

        }
        return amount;
    }

    public long average(long[] sales) {
        return amount(sales) / 12;
    }

    public int maximum(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public int minSales(long[] sales) {
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

    public int belowAverageSales(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                count = +1;


            }

        }
        return count;
    }

    public int aboveAverageSales(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                count = +1;


            }

        }
        return count;
    }
}

