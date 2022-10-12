package decathlonTest;

import common.CalcTrackAndField;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDecaLongJump {
    @Test
    public void testDecaLongJump() {
//Arrange
        double A = 0.14354;
        double B = 220;
        double C = 1.4;
        double distans= 280.55;

        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateField(A,B,C,distans);



        // Assert Assertion;
        int expected = 44;


        assertEquals(expected, actual);


    }
}
