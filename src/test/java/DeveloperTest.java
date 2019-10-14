import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;


public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("jon boy", "BB123456C", 20000);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10000);
        assertEquals(30000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, developer.payBonus(), 0.01);
    }

    @Test
    public void cannotChangeNameIfNullValue(){
        developer.setName(null);
        assertEquals("jon boy", developer.getName());
    }
}
