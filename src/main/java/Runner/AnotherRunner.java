package Runner;

import SimpleClass.Currency;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;

public class AnotherRunner {
    public static void main(String[] args) throws UnirestException {
        String url = "http://api.nbp.pl/api/exchangerates/tables/C";
        Gson gson = new Gson();

        String responce =  Unirest.get(url).asJson().getBody().getArray().getJSONObject(0).getJSONArray("rates").getJSONObject(0).toString();
       // String responce = Unirest.get(url).asString().getBody();
        Currency carrency = gson.fromJson(responce,Currency.class);
        System.out.println(responce);

        JsonNode allTable =  Unirest.get(url).asJson().getBody();
//        System.out.println(allTable);

        //System.out.println(carrency.getCurrency());
//        System.out.println(responce);
    }
}
