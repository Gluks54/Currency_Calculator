import SimpleClass.Currency;
import WorkClass.BenefitAmount;
import WorkClass.Time;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class BenefitAmountTest {

    BenefitAmount benefitAmount;

    @Before
    public void setUp(){
        benefitAmount = new BenefitAmount();
    }

    @Test
    public void testCorrectBenefitAmount() throws UnirestException {
        Currency currency = new Currency(100.0,"USD");
        Time time = new Time("2018-12-12","2018-12-15");
        double expected = 8.36;
        double actual = benefitAmount.culculate("USD",time,100.0);
        assertEquals(expected,actual);
    }
    @Test
    public void testNullBenefitAmount() throws UnirestException {
        Time time = new Time("2019-01-05","2019-01-05");
        double expected = 0.0;
        double actual = benefitAmount.culculate("USD",time,100.0);
        assertEquals(expected,actual);
    }
}
