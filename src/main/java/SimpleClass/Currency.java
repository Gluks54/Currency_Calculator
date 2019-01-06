package SimpleClass;
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
    }



}
