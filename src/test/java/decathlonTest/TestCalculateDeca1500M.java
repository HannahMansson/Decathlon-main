package decathlonTest;

import common.CalcTrackAndField;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCalculateDeca1500M {
    @Test
    public void testDeca1500M() {
//Arrange
        double A = 0.03768;
        double B = 480;
        double C = 1.85;
        double time= 6;

        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A,B,C,time);



        // Assert Assertion;
        int expected = 3359;


        assertEquals(expected, actual);


    }
}
