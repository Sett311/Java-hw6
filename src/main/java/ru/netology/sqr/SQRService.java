package ru.netology.sqr;

public class SQRService {

    public int caclSqrtRange(int rangeMin, int rangeMax) {
        // i - исходное значение перебора в диапазоне от 10 до 99
        // rangeMin - нижняя граница квадратного диапазона
        // rangeMax - верхняя граница квадратного диапазона
        // casecount - количество случаев попадания в диапазон квадрата

        int casecount = 0;
        for (int i = 10; i <= 99; i++) {
            // отфильтровываем значение по нижнему порогу квадрата
            if (i * i >= rangeMin) {
                //отфильтровываем значение по верхнему порогу квадрата
                if (i * i <= rangeMax) {
                    //System.out.println("Квадрат из "+ i);
                    casecount++;
                }

            }
        }
        return casecount;
    }
}
