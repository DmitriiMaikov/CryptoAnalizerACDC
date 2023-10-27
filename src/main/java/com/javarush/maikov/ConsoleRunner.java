package com.javarush.maikov;

import java.util.Scanner;


public class ConsoleRunner {
    static Scanner input = new Scanner(System.in);
    static Boolean work = true;

    public static void main(String[] args) {
        while (work) {
            System.out.println(Constants.MENU);
            switchMenu(input.nextInt());
        }
    }

    private static void switchMenu(int choice) {
        switch (choice) {
            case 1:
                encoder();
                break;
            case 2:
                decoder();
                break;
            case 3:
                work = false;
            default:
                System.out.println("Пожалуйста, введите цифру нужного вам действия");
        }

    }

    private static void encoder() {
        System.out.println("Введите ссылку на файл, который вы хотите зашифровать");
        String link = input.next();
        System.out.println("Введите ключ, которым вы хотите зашифровать файл");
        int key = input.nextInt();
        Encode encode = new Encode(link, key);
    }
    private static void decoder(){
        System.out.println("Введите ссылку на файл, который вы хотите расшифровать");
        String link = input.next();
        System.out.println("Введите ключ, для расшифровки");
        int key = input.nextInt();
        Decode decode = new Decode(link, key);
    }
}









