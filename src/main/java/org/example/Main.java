package org.example;

public class Main {
    public static void main(String[] args) {

        //Класс для расчета коофицента аннуитента
        BmiService service = new BmiService();

        //ставка в процентах годовая
        float iYear = 9.99F;

        //длительность в годах
        float nYear = 1;

        //Величина кредита
        float s = 1_000_000;

        //Расчет аннуитента где "pаy" это переодическая выплата в месяц

        float pay = service.calculate(iYear, nYear, s);

        System.out.println("Ваш платёж в месяц составит " + pay + " Рублей." );

    }
}