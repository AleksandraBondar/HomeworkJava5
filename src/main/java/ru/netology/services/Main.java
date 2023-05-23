package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        MoneyCalcService service = new MoneyCalcService();
        System.out.println(service.calculate(100000,60000,150000));
    }
}