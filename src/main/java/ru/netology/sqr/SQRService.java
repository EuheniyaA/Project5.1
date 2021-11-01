package ru.netology.sqr;

public class SQRService {


    public int numberOfSqr(int lowerRange, int upperRange) {
        int count = 0;
        for (int i = 10; i <= 99; i = i + 1) {
            if (lowerRange <= i * i && i * i <= upperRange) {
                count++;
            }
        }
        System.out.println("Количество подходящих чисел: " + count);
        return count;
    }
}


