package Runner;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

public class ThirdRunner {
    public static void main(String[] args) throws UnirestException {
        String url = "http://api.nbp.pl/api/exchangerates/rates/C/USD";
        String urlWithData = "http://api.nbp.pl/api/exchangerates/rates/C/USD/2018-12-25";
        Gson gson = new Gson();

        GetRequest responce =  Unirest.get(urlWithData);//.asJson().getStatusText();
        System.out.println(responce.asString().getBody());
    }
}
