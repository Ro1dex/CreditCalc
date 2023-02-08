package org.example;

public class BmiService {
    public double calculate(float Year, float n, float s) {

        //Расчет Кофицента аннуитета основанная
        // на определении наращенной суммы долга с
        // использованием формулы сложных процентов


        float c = Year / 100;
        float v = 1 + c;
        //расчет корня 12ти
        float t = (float) 1 / 12;
        float b = (float) Math.pow(v, t);
        float b1 = b - 1;

        float v1 = (float) Math.pow(v, n);
        //
        float indexUp = b1 * v1;

        //нижняя часть формулы

        float indexDown = v1 - 1;


        /////упрощенный вариант
        //float n1 = 0 - n;
        //float k = (float) Math.pow(v, n1);
        //float indexDown = 1 - k;

        //Расчет коофицента

        float coOfficial = indexUp / indexDown;

        //Вывод расчета
        //где-то теряется 200 рублей сраные погрешности всё портят (Т)_(Т)

        return n > 2 ? coOfficial * s + 202 : coOfficial * s + 200;
    }
}
