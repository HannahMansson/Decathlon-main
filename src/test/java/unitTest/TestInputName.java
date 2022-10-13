package unitTest;

import common.InputName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInputName {

    @Test   //testar input av namn
    public void testInputName() {
        //Arrange
        ByteArrayInputStream in = new ByteArrayInputStream("Ella Karlsson".getBytes());
        System.setIn(in);
        InputName myInput = new InputName();
        //Act
        String actual = myInput.addCompetitor();
        //Assert
        String expected = "Ella Karlsson";
        assertEquals(expected, actual);
    }
}
