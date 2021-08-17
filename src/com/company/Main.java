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

        double categoryB = 0; //расходы на гсм легковых транспортных средств(100)
        double categoryC = 0; //расходы на гсмгрузовых автомобилей(200)
        double categoryD = 0; //расходы на гсм пассажирского транспорта(300)
        double categoryCE = 0;//расходы на гсм тяжелой техники(400)


        for (int i = 0; i < a.length; i++) {

            String text = a[i];
            String[] words = text.split("\\s*(\\s|C|_|-|\\.)\\s*");

            b[i] = Integer.parseInt(words[1]);
            c[i] = Integer.parseInt(words[2]);
            d[i] = Integer.parseInt(words[3]);
            if (words[1].equals("100")) {
                e[i] = 0;

            } else {
                e[i] = Integer.parseInt(words[4]);
            }
        }

        for (int i = 0; i < b.length; i++) {
            switch (b[i]) {//тут все ок
                case 100:
                    categoryB = (categoryB + (d[i]));
                    break;
                case 200:
                    categoryC = (categoryC + (d[i]));
                    break;
                case 300:
                    categoryD = (categoryD + (d[i]));
                    break;
                case 400:
                    categoryCE = (categoryCE + (d[i]));
                    break;
            }


        }
// считаем расходы на гсм
        categoryB = categoryB / f100 * priceFuel100;
        categoryC = categoryC / f200 * priceFuel200;
        categoryD = categoryD / f300 * priceFuel300;
        categoryCE = categoryCE / f400 * priceFuel400;
        double result = categoryC + categoryB + categoryCE + categoryD;


        System.out.println("расход на гсм легковых автомобилей = " + categoryB);
        System.out.println("расход на гсм грузовых автомобилей = " + categoryC);
        System.out.println("расход на гсм пассажирских автомобилей = " + categoryD);
        System.out.println("расход на гсм тяжелой техники = " + categoryCE);
        System.out.println("общая стоимость расходов на ГСМ всех автомобилей = " + result);


    }

}
// дописать задание 2,3,4.









