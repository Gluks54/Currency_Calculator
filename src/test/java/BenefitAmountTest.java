import SimpleClass.Currency;
import WorkClass.BenefitAmount;
import WorkClass.Time;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class BenefitAmountTest {

    BenefitAmount benefitAmount;
    Time time;

    @Before
    public void setUp(){
        benefitAmount = new BenefitAmount();
        time = new Time("2018-12-12","2018-12-24");

    }

    @Test
    public void testCorrectBenefitAmount(){
        Currency currency = new Currency(100.0,"USD");
        benefitAmount.setStartNumber(3.7);
        benefitAmount.setEndNumber(3.8);
        double expected = 0.1;
        double actual = benefitAmount.culculate(currency,time);
        assertEquals(expected,actual);
    }
}
