package Runner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.mashape.unirest.http.Headers;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws UnirestException {
        String url = "http://api.nbp.pl/api/exchangerates/tables/C";
        Gson gson = new Gson();

        HttpResponse<JsonNode> responce = Unirest.get(url).asJson();
        // Carrency carrency = gson.fromJson(String.valueOf(responce),Carrency.class);
       // System.out.println(arrJson);

        JsonNode arr = responce.getBody();
        List<String> list = new ArrayList<String>();
//        for(int i = 0; i < arr.length(); i++){
//            list.add(arr.getJSONObject(i).getString("tradingDate"));
//        }
       // JSONArray dfsdf = (JSONArray) arr.getJSONObject(0).getJSONArray("rates").get(0);

       // list.add(dfsdf.getString(0));
//        String rezult =     arr.getJSONObject(0).getJSONArray("rates").get(0).toString();
//        String anotherRezult  = arr.getJSONArray(0).get(0);
        arr.toString();
        System.out.println( arr.getArray().getJSONObject(0).getJSONArray("rates").getJSONObject(0).get("code"));
       // System.out.println(rezult);
        System.out.println(arr);

    }
}
