import SimpleClass.Currency;
import WorkClass.CostWithCourseSell;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

public class CostWithCourseSellTest {
    @Test
    public void testCorCostWithCourseSell(){
        Currency currency = Mockito.mock(Currency.class);
        when(currency.getAsk()).thenReturn("3.8204");
        when(currency.getNumber()).thenReturn(100.0);

        CostWithCourseSell costWithCourseSell = new CostWithCourseSell();
        double actual = costWithCourseSell.culculate(currency);
        double expected = 382.04;
        assertEquals(expected,actual) ;
    }
}
