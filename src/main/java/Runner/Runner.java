package Runner;

import SimpleClass.Currency;
import WorkClass.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.mashape.unirest.http.Headers;

import com.mashape.unirest.http.exceptions.UnirestException;


public class Runner {
    public static void main(String[] args) throws UnirestException {
        AverageCost averageCost = new AverageCost();

        double rezultUSD = averageCost.getAverageCost("USD",100.0);
        double rezultEUR = averageCost.getAverageCost("EUR",100.0);
        //double rezultGPB = averageCost.getAverageCost("GPB");
        double rezultCHF = averageCost.getAverageCost("CHF",100.0);

        System.out.println(String.format(
                "AverageUSD:%1$s\n"+
                        "AverageEUR:%2$s\n" +
                        "AverageCHF:%3$s\n"
                       ,rezultUSD,rezultEUR,rezultCHF));

        CostWithCourseSell costWithCourseSell = new CostWithCourseSell();
        CurrencyDeliver currencyDeliver = new CurrencyDeliver();

        Currency currencyUSD = currencyDeliver.getCurrencyToday("USD");
        Currency currencyEUR = currencyDeliver.getCurrencyToday("EUR");
        Currency currencyCHF = currencyDeliver.getCurrencyToday("CHF");

         double rezultUSDSell = costWithCourseSell.culculate(currencyUSD,100.0);
         double rezultEURSell = costWithCourseSell.culculate(currencyEUR,100.0);
         double rezultCHFSell = costWithCourseSell.culculate(currencyCHF,100.0);

        System.out.println(String.format(
                "costWithCoursell_USD:%1$s\n"+
                        "costWithCoursell_EUR:%2$s\n" +
                        "costWithCoursell_CHF:%3$s\n"
                ,rezultUSDSell,rezultEURSell,rezultCHFSell));

        BenefitAmount benefitAmount = new BenefitAmount();
        Time time = new Time("2018-10-01","2019-01-06");

        double benefitUSD = benefitAmount.culculate("USD",time,100.0);
        double benefitEUR = benefitAmount.culculate("EUR",time,100.0);
        double benefitCHF = benefitAmount.culculate("CHF",time,100.0);

        System.out.println(String.format(
                "benefitUSD:%1$s\n"+
                        "benefitEUR:%2$s\n" +
                        "benefitCHF:%3$s\n"
                ,benefitUSD,benefitEUR,benefitCHF));
    }
}
