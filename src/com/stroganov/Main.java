package com.stroganov;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Введите порядковый номер месяца, заранее спасибо:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberMonth = 0;

        try {

            numberMonth = Integer.parseInt(reader.readLine());

        }
        catch (Exception e){

            //e.printStackTrace();
            System.out.println("Вы ввели не число");
        }


        Month newMonth = new Month(numberMonth);
        System.out.println("Месяц определен как: " + newMonth.getMonthName());





    }
}
