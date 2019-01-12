package WorkClass;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time {
    String startDate;
    String endDate;

    public Time(String startDate, String endDate) {

        Pattern pattern = Pattern.compile("^\\d{4}\\-\\d{2}\\-\\d{2}$");
        Matcher matcherStart = pattern.matcher(startDate);
        Matcher matcherEnd = pattern.matcher(endDate);

        if(!matcherEnd.find() || !matcherStart.find()){
            throw new IllegalArgumentException();
        }
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
