import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Corabeth Godsey", "DD987654V", 90000, "IT", 65000);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000);
        assertEquals(100000, director.getSalary(), 0.01);
    }

    @Test
    public void cantRaiseSalary(){
        director.raiseSalary(-100);
        assertEquals(90000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1800, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(65000, director.getBudget(), 0.01);
    }

}
