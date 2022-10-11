package unitTest;
import common.CalcTrackAndField;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestHep200M {

    @Test

    public void testHep200M(){

        //Arrange
        double A = 4.99087; //Test Test
        double B = 42.5;
        double C = 1.81;
        double time = 20.5;

        CalcTrackAndField calc = new CalcTrackAndField();

        //Act

        int actual = calc.calculateTrack(A,B,C,time);

        //Assert

        int expected = 1342;



        assertEquals(expected, actual);
    }

}
