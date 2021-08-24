
package com.company;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //заданный массив
        String[] a = new String[]{"C100_1-100", "C200_1-120-1200", "C300_1-120-30",
                "C400_1-80-20", "C100_2-50", "C200_2-40-1000",
                "C300_2-200-45", "C400_2-10-20", "C100_3-10",
                "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28",
                "C100_1-300", "C200_1-100-750", "C300_1-32-15"};


        int[] b = new int[a.length];//код автомобиля
        int[] c = new int[a.length];//гос номер
        int[] d = new int[a.length];//пробег
        int[] e = new int[a.length];//доп пораметр
        double[] priceGSM = new double[4]; // массив расходов на гсм
        //стоимость топлива
        double priceFuel100 = 46.10;
        double priceFuel200 = 48.90;
        double priceFuel300 = 47.50;
        double priceFuel400 = 48.90;

        //расход топлива
        double f100 = 12.5;
        double f200 = 12;
        double f300 = 11.5;
        double f400 = 20;


        double resultPrice = 0;
        double maxPrice = 0;
        double minPrice = 0;
        int indexMinPrice = 0;//индекс автомобилей с минимальным расходом гсм
        int indexMaxPrice = 0;//максимальным


        for (int i = 0; i < a.length; i++) {

            String text = a[i];
            String[] words = text.split("\\s*(\\s|C|_|-|\\.)\\s*");

            b[i] = Integer.parseInt(words[1]);
            c[i] = Integer.parseInt(words[2]);
            d[i] = Integer.parseInt(words[3]);
            if ("100".equals(words[1])) {
                e[i] = 0;

            } else {
                e[i] = Integer.parseInt(words[4]);
            }
        }

        for (int i = 0; i < b.length; i++) {

            switch (b[i]) {
                case 100:
                    priceGSM[0] = (priceGSM[0] + (d[i]));
                    break;
                case 200:
                    priceGSM[1] = (priceGSM[1] + (d[i]));
                    break;
                case 300:
                    priceGSM[2] = (priceGSM[2] + (d[i]));
                    break;
                case 400:
                    priceGSM[3] = (priceGSM[3] + (d[i]));
                    break;
            }


        }
        // считаем расходы на гсм
        priceGSM[0] = priceGSM[0] / f100 * priceFuel100;
        priceGSM[1] = priceGSM[1] / f200 * priceFuel200;
        priceGSM[2] = priceGSM[2] / f300 * priceFuel300;
        priceGSM[3] = priceGSM[3] / f400 * priceFuel400;
        resultPrice = priceGSM[0] + priceGSM[1] + priceGSM[2] + priceGSM[3];
        //максимальный расход гсм

        for (int i = 0; i < priceGSM.length; i++) {

            if (maxPrice < priceGSM[i]) {
                maxPrice = priceGSM[i];
            } else {
                continue;

            }


        }
        //минимальный расход гсм
        for (int i = 0; i < priceGSM.length; i++) {
            minPrice = priceGSM[1];
            if (priceGSM[i] < minPrice) {
                minPrice = priceGSM[i];

            } else {
                continue;
            }
        }

        //сортировка пузырьком
        for (int i = 0; i < priceGSM.length - 1; i++) {
            for (int j = priceGSM.length - 1; j > i; j--) {
                if (priceGSM[j - 1] > priceGSM[j]) {
                    double sort = priceGSM[j - 1];
                    priceGSM[j - 1] = priceGSM[j];
                    priceGSM[j] = sort;
                }
            }
        }
        //сортировка по доп параметру
        for (int i = 0; i < e.length - 1; i++) {
            for (int j = e.length - 1; j > i; j--) {
                if (e[j - 1] > e[j]) {
                    int sort = e[j - 1];
                    e[j - 1] = e[j];
                    e[j] = sort;
                }
            }


            System.out.println("расход на гсм легковых автомобилей(100) = " + priceGSM[0]);
            System.out.println("расход на гсм грузовых автомобилей(200) = " + priceGSM[1]);
            System.out.println("расход на гсм пассажирских автомобилей(300) = " + priceGSM[2]);
            System.out.println("расход на гсм тяжелой техники(400) = " + priceGSM[3]);
            System.out.println("общая стоимость расходов на ГСМ всех автомобилей = " + resultPrice);
            System.out.println("максимальные расходы на гсм у " + maxPrice);
            System.out.println("минимальные расходы на гсм  " + minPrice);
//        //сортируем массив
            System.out.println("отсортированный пузырьком массив:");
            for (int z = 0; z < priceGSM.length; z++) {
                System.out.println(+priceGSM[z]);
            }
            System.out.println("отсортированный  массив дополнительных значений:");
            for (int j = 0; j < e.length; j++) {
                System.out.println(e[j]);

            }
        }
    }
}






// дописать сортировку пузырьком и вывод данных




















