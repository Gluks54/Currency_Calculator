//package Runner;
//
//import com.google.gson.Gson;
//import com.mashape.unirest.http.HttpResponse;
//import com.mashape.unirest.http.JsonNode;
//import com.mashape.unirest.http.Unirest;
//import com.mashape.unirest.http.exceptions.UnirestException;
//
//public class ThirdRunner {
//    public static void main(String[] args) throws UnirestException {
//        String url = "http://api.nbp.pl/api/exchangerates/rates/C/USD";
//        Gson gson = new Gson();
//
//        HttpResponse<JsonNode> responce =  Unirest.get(url).asJson();
//        System.out.println(responce.getBody());
//    }
//}
