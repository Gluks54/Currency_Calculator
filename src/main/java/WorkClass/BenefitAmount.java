package WorkClass;
import SimpleClass.Currency;
import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BenefitAmount  {

    double startTableAsk;
    double endTableBit;

    public double culculate(String cod, Time time,double number) throws UnirestException {

        String urlWithData = String
                .format("http://api.nbp.pl/api/exchangerates/" +
                        "rates/C/%1$s/%2$s/%3$s", cod, time.startDate, time.endDate);
        Gson gson = new Gson();
        Currency startCurrency = new Currency();
        Currency endCurrency = new Currency();

        String errorResponce = Unirest.get(urlWithData)
                .asString()
                .getBody();

        Pattern pattern = Pattern.compile("404 NotFound - Not Found - Brak danych");
        Matcher matcher = pattern.matcher(errorResponce);

        if(matcher.find()){
            return 0.0;
        }

        int tableLength = Unirest.get(urlWithData)
                .asJson()
                .getBody()
                .getArray()
                .getJSONObject(0)
                .getJSONArray("rates")
                .length();

        for (int i = 0; i < tableLength; i++) {
            String responce = Unirest.get(urlWithData)
                    .asJson()
                    .getBody()
                    .getArray()
                    .getJSONObject(0)
                    .getJSONArray("rates")
                    .getJSONObject(i)
                    .toString();

            if (i == 0) {
                startCurrency = gson.fromJson(responce, Currency.class);
            }
            if (i == (tableLength - 1)) {
                endCurrency = gson.fromJson(responce, Currency.class);
            }
        }
            startTableAsk = Double.parseDouble(startCurrency.ask);
            endTableBit = Double.parseDouble(endCurrency.bid);

            double rezult = (startTableAsk - endTableBit) * number;
            DecimalFormat patter = new DecimalFormat("#.####");

        return  Double.valueOf(patter.format(rezult));
    }
}
