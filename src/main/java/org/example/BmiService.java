package org.example;

public class BmiService {
    public float calculate(float iYear, float nYear, float s){
        //длительность в месяцах

        float n = nYear * 12;

        //ставка в процентах месячная

        float i = iYear / 100 / n;

        //Верхняя часть формулы расчета коофицента

        float indexUp = (float) (i * Math.pow( 1 + i, n));

        //Нижняя часть формулы расчета коофицента

        float indexDown = (float) (Math.pow( 1 + i, n) - 1);

        //Расчет Кофицент аннуитента

        float coOfficial = indexUp / indexDown;

        //Вывод расчета

        return coOfficial * s;



    }
}
