package com.yaros;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int time = scanner.nextInt();

        if ((day.equals("Monday") || day.equals("Friday")) && (time >= 18 && time < 20)) {
            System.out.println("Lesson is running!");
        } else {
            System.out.println("Lesson isn't running now!");
        }

    }

}
