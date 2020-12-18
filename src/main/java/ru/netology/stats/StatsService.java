package ru.netology.stats;

public class StatsService {
    public int sum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
            sum = sum;

        }
        return sum;
    }

    public int average(int[] purchases) {
        int sum = sum(purchases);
        return sum / purchases.length;

    }

    private int getMax(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }
        }
        return max;
    }

    public int monthWithMax(int[] purchases) {
        int max = getMax(purchases);
        int monthCount = 0;
        int monthWithMax = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == max) {
                monthWithMax = monthCount;
            }
        }
        return monthWithMax;

    }

    private int getMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (min > purchase) {
                min = purchase;
            }
        }
        return min;
    }

    public int monthWithMin(int[] purchases) {
        int min = getMin(purchases);
        int monthCount = 0;
        int monthWithMin = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == min) {
                monthWithMin = monthCount;
            }
        }
        return monthWithMin;
    }
public int monthCountWithLessThenAverage(int[] purchases) {
    int average = average(purchases);
    int count = 0;
            for (int purchase : purchases) {
                if (purchase < average) {
                    count++;
                }
            }
    return count;
    }
    public int monthCountWithMoreThenAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                count++;
            }
        }
        return count;
    }
}