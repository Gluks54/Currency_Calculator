import SimpleClass.Currency;
import WorkClass.CurrencyDiIler;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.when;

public class CurrencyDiIlerTest {
    CurrencyDiIler currencyDiIler;

    @Before
    public void setUp(){
        currencyDiIler = new CurrencyDiIler();
    }

    @Test
    public void testCorGetCurrencyToday() throws UnirestException {
        assertTrue(currencyDiIler.getCurrencyToday("USD") != null);
    }
    @Test
    public void testUnCorGetCurrencyToday() throws UnirestException {
        try{
            currencyDiIler.getCurrencyToday("uiuo");
            fail();
        }catch (IllegalArgumentException e){assertTrue(true);}
    }
    @Test
    public void testUnCorGetCurrencyTOdayNull() throws UnirestException {
        try{
            currencyDiIler.getCurrencyToday("");
            fail();
        }catch (IllegalArgumentException e){assertTrue(true);}
    }


}
