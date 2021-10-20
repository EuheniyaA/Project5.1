package ru.netology.sqr;

public class SQRService {

  int count =0;
  public int numberOfSQR(int number1, int number2) {
    for (int i = 10; i <= 99; i=i+1) {
      if (number1 <= i * i && i * i <= number2) {
        count++;
      }
    }
    System.out.println("Количество подходящих чисел: " + count);
    return count;
  }
}


