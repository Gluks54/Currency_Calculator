package SimpleClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {


    String ask;
    String currency;
    String bid;
    double number;
    String code;

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public void setCode(String code) {
        this.code = code;
    }



    public double getNumber() {
        return number;
    }

    public String getCode() {
        return code;
    }

    public String getAsk() {
        return ask;
    }

    public String getCurrency() {
        return currency;
    }

    public String getBid() {
        return bid;
    }



    public Currency(double number, String code) {
        this.number = number;
        this.code = code;
        Pattern pattern = Pattern.compile("^\\w{3}$");
        Matcher matcher = pattern.matcher(code);
        if (!matcher.find() || number < 0.0 ){
            throw new IllegalArgumentException();
        }
    }



}
