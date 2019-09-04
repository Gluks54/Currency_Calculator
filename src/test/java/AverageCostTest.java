import com.mashape.unirest.http.exceptions.UnirestException;
import com.pl.currency_calculator.SimpleClass.Currency;
import com.pl.currency_calculator.WorkClass.AverageCost;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

@RunWith(JUnitParamsRunner.class)
public class AverageCostTest {

    AverageCost averageCost;

    @Before
    public void SetUp() {
        averageCost = new AverageCost();
    }

    @Test
    public void testUnCorDataAverageCost() throws UnirestException {
        try {
            averageCost.getAverageCost("USD", -1.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testIllegalArgumentAveregeCost() throws UnirestException {
        try {
            Currency currency = new Currency();
            averageCost.getAverageCost("USDd", 100.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}
