package com.pl.currency_calculator.WorkClass;

import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.pl.currency_calculator.SimpleClass.Currency;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AverageCost {

    private String path = "http://api.nbp.pl/api/exchangerates/rates/A/";

    public double getAverageCost(String cod, double number) throws UnirestException {

        Pattern pattern = Pattern.compile("^\\w{3}$");
        Matcher matcher = pattern.matcher(cod);
        if (!matcher.find() || number < 0) {
            throw new IllegalArgumentException();
        }

        String urlWithData = String.format(
                path + "%1$s", cod);
        Gson gson = new Gson();

        String responce = Unirest.get(urlWithData)
                .asJson()
                .getBody()
                .getArray()
                .getJSONObject(0)
                .getJSONArray("rates")
                .getJSONObject(0)
                .toString();

        Currency carrency = gson.fromJson(responce, Currency.class);

        NumberFormat formatter = new DecimalFormat("#0.000");
        double rezult = Double.parseDouble(carrency.getMid()) * number;
        return Double.parseDouble(formatter.format(rezult));
    }
}
