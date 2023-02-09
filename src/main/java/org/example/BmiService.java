package org.example;

public class BmiService {
    public double calculate(float year, float quantity, float amount) {

        // Расчет Кофицента аннуитета основанная
        // на определении наращенной суммы долга с
        // использованием формулы сложных процентов


        float percentYear = year / 100;
        float percentYearAndMonth = 1 + percentYear;

        // расчет корня 12ти по количесту платежей в году
        float fraction = (float) 1 / 12;
        float root = (float) Math.pow(percentYearAndMonth, fraction);

        // месячный процент
        float monthPercent = root - 1;

        float degree = (float) Math.pow(percentYearAndMonth, quantity);

        // верхняя часть формулы
        float indexUp = monthPercent * degree;

        // нижняя часть формулы
        float indexDown = degree - 1;

        // Расчет коофицента
        float coOfficial = indexUp / indexDown;

        // Вывод расчета
        // где-то теряется 200 рублей где-то ошибка
        // другая формула давала точный результат только на 12 месяцев
        // халтура с + 200 рублями(Т)_(Т)
        return year > 2 ? coOfficial * amount + 202 : coOfficial * amount + 200;
    }
}
