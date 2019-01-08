package WorkClass;

import SimpleClass.Culculate;
import SimpleClass.*;

public class AverageCost implements Culculate  {
    @Override
    public double culculate(Currency currency) {
        double doubleAsk = Double.parseDouble(currency.getAsk());
        double doubleBit = Double.parseDouble(currency.getBid());
        return (doubleAsk + doubleBit)/2;
    }
}
