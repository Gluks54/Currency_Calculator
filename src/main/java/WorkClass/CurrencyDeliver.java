package WorkClass;
import com.google.gson.Gson;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import SimpleClass.Currency;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyDeliver {

    public Currency getCurrencyToday(String nameOfCurrency) throws UnirestException {
        Pattern pattern = Pattern.compile("^\\w{3}$");
        Matcher matcher = pattern.matcher(nameOfCurrency);
        if (!matcher.find()){
            throw new IllegalArgumentException();
        }

        String url = String.format("http://api.nbp.pl/api/exchangerates/rates/C/%s",nameOfCurrency);
        Gson gson = new Gson();
        String responce = Unirest.get(url)
                .asJson()
                .getBody()
                .getArray()
                .getJSONObject(0)
                .getJSONArray("rates")
                .getJSONObject(0)
                .toString();

        Currency currency = gson.fromJson(responce,Currency.class);
        return currency;
    }
}
