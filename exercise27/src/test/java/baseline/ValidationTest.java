package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {
    Validation vd = new Validation("J", "", "ABCDE", "A12-1234");
    String expectedValue;
    String actualValue;
    @Test
    void validateFirstName() {
        actualValue = vd.validateFirstName();
        expectedValue = String.format("The first name must be at least 2 characters long.%n");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void validateLastName() {
        actualValue = vd.validateLastName();
        expectedValue = String.format("The last name must be at least 2 characters long.%nThe last name must be filled in.%n");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void validateZIPCode() {
        actualValue =vd.validateZIPCode();
        expectedValue = String.format("The zipcode must be a 5 digit number.%n");

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void validateEmployeeID() {
        actualValue = vd.validateEmployeeID();
        expectedValue = String.format("The employee ID must be in the format of AA-1234.%n");

        assertEquals(expectedValue, actualValue);
    }
}