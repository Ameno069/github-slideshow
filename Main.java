package com.company;

import java.net.http.HttpRequest;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        First();
        doHelloMyNameIsDanila();
   boolean isNiceIng = checkIng(-1);
   System.out.println("Ответ:" +isNiceIng);
        boolean isNiceIng1 = checkIng(1);
        System.out.println("Ответ:" +isNiceIng1);

    }
    static void First(){
        //Задание 2.
        byte x0 = 127;
        System.out.println(x0);
        short x = 32700;
        System.out.println(x);
        int x1 = 1;
        System.out.println(x1);
        long x2 = 1;
        System.out.println(x2);
        float x3 = 1.1f;
        System.out.println(x3);
        double x4 = 1.1;
        System.out.println(x4);
        boolean x5 = true;
        System.out.println(x5);
        char x6 = 'К';
        System.out.println(x6);

        //Задание 3.
        System.out.println("Введите числа");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        float resultf = 0;

        if (d != 0) {
            resultf = a * (b + (c / d));
            System.out.println(resultf);
        } else {
            System.out.println("На ноль делить нельзя!!!");
        }

        //Задание 4.
        System.out.println("Выполняем сложение, если два чила больше или равно 10, но меньше или ровно 20, то будет правда.");
        System.out.println("Введите числа");
        Scanner scanner1 = new Scanner(System.in);
        double zz = scanner.nextDouble();
        double zz1 = scanner.nextDouble();
        boolean zz2 = (zz + zz1 >= 10 && zz + zz1 <= 20);
        System.out.println(zz2);

        //Задание 5.
        System.out.println("Введите любое число и вам скажет программа, положительное оно или нет.");
        Scanner qwer = new Scanner(System.in);
        double w1 = scanner.nextDouble();
        if (w1 >= 0) {
            System.out.println("Ваше число положительное");
        } else {
            System.out.println("Ваше число отрицательное");
        }

    }

    static void doHelloMyNameIsDanila(){
    System.out.println("Hello, My name is Danila");
    }
    static boolean checkIng(double Ing){
        if (Ing <0){
            return true;
        }
            return false;
        }
    }





