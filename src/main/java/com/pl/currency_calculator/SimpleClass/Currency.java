package com.pl.currency_calculator.SimpleClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {

    public Currency() {
    }

    private String ask;
    private String bid;
    private double number;
    private String code;
    private String mid;

    public String getBid() {
        return bid;
    }
    public String getMid() {
        return mid;
    }

    public String getAsk() {
        return ask;
    }

    public Currency(double number, String code) {
        this.number = number;
        this.code = code;

        Pattern pattern = Pattern.compile("^\\w{3}$");
        Matcher matcher = pattern.matcher(code);
        if (!matcher.find() || number < 0.0) {
            throw new IllegalArgumentException();
        }
    }
}
