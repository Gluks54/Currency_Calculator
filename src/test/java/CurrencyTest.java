import SimpleClass.Currency;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CurrencyTest {

    @Test
    public void unCorDataNumber(){
        try {
                Currency currency = new Currency(-1.0, "USD");
                fail();
        }catch (IllegalArgumentException e){ assertTrue(true); }
    }

    @Test
    public void inCorDataCode(){
        try{
            Currency currency = new Currency(1.0, "USEe");
            fail();
        }catch (IllegalArgumentException e){ assertTrue(true); }
    }

}
