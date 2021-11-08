package ru.netology.sqr;

public class SQRService {
    public int sqrCount(int limitLow, int limitHigh) {
        int counter = 0;

        for (int num = 10; num < 100; num++) {
            int sqrNum = num * num;
            if (sqrNum >= limitLow && sqrNum <= limitHigh) {
                System.out.println("Квадрат числа " + num + " = " + sqrNum);
                counter = counter + 1;
            }
        }
        return counter;
    }
}
