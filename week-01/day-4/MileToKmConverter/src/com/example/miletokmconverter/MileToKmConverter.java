package com.example.miletokmconverter;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();

        double k = m*1.609344;
        System.out.println(k + " km");
        scanner.close();
    }
}
