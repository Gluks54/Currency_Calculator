import SimpleClass.Currency;
import WorkClass.CostWithCourseSell;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.when;

public class CostWithCourseSellTest {
    @Test
    public void testCorCostWithCourseSell(){
        Currency currency = Mockito.mock(Currency.class);
        when(currency.getAsk()).thenReturn("3.8204");

        CostWithCourseSell costWithCourseSell = new CostWithCourseSell();
        double actual = costWithCourseSell.culculate(currency,100.0);
        double expected = 382.04;
        assertEquals(expected,actual) ;
    }
    @Test
    public void testUnCorData(){
        CostWithCourseSell costWithCourseSell = new CostWithCourseSell();
        Currency currency = new Currency();
        try {
            costWithCourseSell.culculate(currency,-1);
            fail();
        }catch (IllegalArgumentException e){assertTrue(true);}

    }
}
