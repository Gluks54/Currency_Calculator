import com.mashape.unirest.http.exceptions.UnirestException;
import com.pl.currency_calculator.WorkClass.CurrencyDeliver;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

public class CurrencyDiIlerTest {
    CurrencyDeliver currencyDiIler;

    @Before
    public void setUp() {
        currencyDiIler = new CurrencyDeliver();
    }

    @Test
    public void testCorGetCurrencyToday() throws UnirestException {
        assertTrue(currencyDiIler.getCurrencyToday("USD") != null);
    }

    @Test
    public void testUnCorGetCurrencyToday() throws UnirestException {
        try {
            currencyDiIler.getCurrencyToday("uiuo");
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testUnCorGetCurrencyTOdayNull() throws UnirestException {
        try {
            currencyDiIler.getCurrencyToday("");
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}
