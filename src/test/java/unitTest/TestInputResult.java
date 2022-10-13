package unitTest;

import common.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInputResult {

    @Test   //testar input av resultat
    public void testInputResult() {
        //Arrange
        ByteArrayInputStream in = new ByteArrayInputStream("11.0".getBytes());
        System.setIn(in);
        InputResult myInput = new InputResult();
        //Act
        myInput.enterResult();
        double actual = myInput.returnResult();
        //Assert
        double expected = 11.0;
        assertEquals(expected, actual);
    }
}