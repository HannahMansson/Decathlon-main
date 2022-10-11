package unitTest;
import common.CalcTrackAndField;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;


public class TestHep800M {

    @Test

    public void testHep800M() {

        //Arrange
        double A = 0.11193;
        double B = 254;
        double C = 1.88;
        double time = 109.4;

        CalcTrackAndField calc = new CalcTrackAndField();

        //Act

        int actual = calc.calculateTrack(A,B,C,time);

        //Assert

        int expected = 1288;

        assertEquals(expected, actual);

    }

}

