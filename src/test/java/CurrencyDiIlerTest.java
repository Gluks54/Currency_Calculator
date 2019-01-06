import SimpleClass.Currency;
import WorkClass.CurrencyDiIler;
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
    public void testCorGetCurrencyToday(){
        assertTrue(currencyDiIler.getCurrencyToday("USD") != null);
    }
    @Test
    public void testUnCorGetCurrencyToday(){
        try{
            currencyDiIler.getCurrencyToday("uiuo");
            fail();
        }catch (IllegalArgumentException e){assertTrue(true);}
    }
    @Test
    public void testUnCorGetCurrencyTOdayNull(){
        try{
            currencyDiIler.getCurrencyToday("");
            fail();
        }catch (IllegalArgumentException e){assertTrue(true);}
    }


}
