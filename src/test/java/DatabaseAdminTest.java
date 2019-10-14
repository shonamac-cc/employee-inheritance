import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;


import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("mary beth", "AA123456J", 25000);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10000);
        assertEquals(35000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, databaseAdmin.payBonus(), 0.01);
    }

}
