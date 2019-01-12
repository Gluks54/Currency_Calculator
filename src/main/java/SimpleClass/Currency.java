package SimpleClass;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {

    public Currency() {
    }

    public String ask;
    public String currency;
    public String bid;
    public double number;
    public String code;
    public String mid;

    public void setCurrency(String currency) {
        this.currency = currency;
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
