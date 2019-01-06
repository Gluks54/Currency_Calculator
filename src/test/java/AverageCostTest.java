import SimpleClass.Currency;
import WorkClass.AverageCost;
import WorkClass.Time;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(JUnitParamsRunner.class)
public class AverageCostTest {

    AverageCost averageCost;
    @Before
    public void SetUp(){
        averageCost = new AverageCost();
    }

    @Test
    public void testCorAvarageCost(){
        Currency currency = Mockito.mock(Currency.class);
        when(currency.getAsk()).thenReturn("3.8204");
        when(currency.getBid()).thenReturn("3.7448");

        double actual = averageCost.culculate(currency);
        double expected = 3.7826;
        assertEquals(expected,actual);
        //"bid":3.7448,"ask":3.8204}
    }
}
