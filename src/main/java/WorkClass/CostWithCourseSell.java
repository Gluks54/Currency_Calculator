package WorkClass;

import SimpleClass.Culculate;
import SimpleClass.Currency;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CostWithCourseSell implements Culculate {
    @Override
    public double culculate(Currency currency) {
        //"bid":3.7448,"ask":3.8204}
        double doubleAsk = Double.parseDouble(currency.getAsk());
        double doubCode = currency.getNumber();
        double rezult = doubleAsk * doubCode;
        NumberFormat formatter = new DecimalFormat("#0.000");

        //System.out.println(Double.parseDouble(formatter.format(rezult)));
        return Double.parseDouble(formatter.format(rezult));
    }
}
