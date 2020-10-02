package com.stroganov;

import java.time.LocalDate;


public class Month {

   private String monthName;
   private int numberMonth;

    public Month(int numberMonth){

        if (numberMonth > 0 && numberMonth < 13 ) {
            this.numberMonth = numberMonth;
        } else {
            System.out.println("Неверный порядковый номер месяца, месяц уствлен по умолчанию: Январь");
            this.numberMonth = 1;
        }
    }

    public String getMonthName() {

        LocalDate date = LocalDate.of(2020, numberMonth , 1);
        monthName = date.getMonth().toString();



        return monthName;
    }
}
