package org.example;

public class Main {
    public static void main(String[] args) {

        //Класс для расчета коофицента аннуитета
        BmiService service = new BmiService();

        //ставка в процентах годовая
        float percentYear = (float) 9.99;

        //длительность в годах
        float quantity = 2;

        //Величина кредита
        float amount = 1_000_000;

        //Расчет аннуитета где "pаy" это переодическая выплата в месяц

        float pay = (int) service.calculate(percentYear,quantity, amount);

        System.out.println("Ваш платёж в месяц составит " + pay + " Рублей." );

    }
}