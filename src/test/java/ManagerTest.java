import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jeff Bridges","JJ456789C", 70000, "IT");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000);
        assertEquals(80000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(700, manager.payBonus(), 0.01);
    }

}
