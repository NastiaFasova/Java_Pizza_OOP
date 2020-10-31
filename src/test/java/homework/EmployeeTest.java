package homework;

import homework.exception.NotEnoughExperienceException;
import org.junit.Test;

public class EmployeeTest {

    @Test(expected = NotEnoughExperienceException.class)
    public void constructorExceptionTest() {
        Employee employee = new Employee("Ivan", 1, 19) {
        };
    }

}