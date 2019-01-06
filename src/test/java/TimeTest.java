import WorkClass.Time;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
@RunWith(JUnitParamsRunner.class)
public class TimeTest {

    @Test
    @Parameters(method = "endData")
    public void testUnCorTimeEnd(String satrtTime,String endTrime){
        try {
            Time time = new Time(satrtTime,endTrime);
            fail();
        }catch (IllegalArgumentException e){assertTrue(true);}
    }
    private Object [][] endData(){
        return new Object[][]{
                {"2018-05-01","2019-01-1"},
                {"2018-05-01","2019-001-01"},
                {"2018-05-01","201-01-01"},
                {"2018-05-01","2019 01-01"},
                {"2018-05-01","2019 01 01"}};
    }

    @Test
    @Parameters(method = "startData")
    public void testUnCorTimeStart(String satrtTime,String endTrime){
        try {
            Time time = new Time(satrtTime,endTrime);
            fail();
        }catch (IllegalArgumentException e){assertTrue(true);}
    }
    private Object [][] startData(){
        return new Object[][]{
                {"2019-01-1","2018-05-01"},
                {"2019-001-01","2018-05-01"},
                {"201-01-01","2018-05-01"},
                {"2019 01-01","2018-05-01"},
                {"2019 01 01","2018-05-01"}};
    }
}
