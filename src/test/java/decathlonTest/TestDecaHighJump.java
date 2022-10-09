package decathlonTest;
import common.CalcTrackAndField;
import org.junit.jupiter.api.Assertions;
import decathlon.Deca100M;
import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDecaHighJump {
    @Test
    public void testDecaHighJump() {
//Arrange
        double A = 0.8465;
        double B = 75;
        double C = 1.42;
        double distans= 280.55;

       CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateField(A,B,C,distans);



        // Assert Assertion;
        int expected = 1629;


    assertEquals(expected, actual);


    }
}
