package com.pl.currency_calculator.WorkClass;

import com.pl.currency_calculator.SimpleClass.Currency;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CostWithCourseSell {

    public double culculate(Currency currency, double number) {

        if (number < 0) {
            throw new IllegalArgumentException();
        }
        double doubleAsk = Double.parseDouble(currency.getAsk());
        double rezult = doubleAsk * number;

        NumberFormat formatter = new DecimalFormat("#0.000");
        return Double.parseDouble(formatter.format(rezult));
    }
}
