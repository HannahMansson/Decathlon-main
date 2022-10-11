package unitTest;
import common.CalcTrackAndField;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestHep100MHurdles {

    @Test

    public void testHep100MHurdles(){

        //Arrange
        double A = 9.23076;
        double B = 26.7;
        double C = 1.835;
        double time = 13;

        CalcTrackAndField calc = new CalcTrackAndField();

        //Act

        int actual = calc.calculateTrack(A,B,C,time);

        //Assert

        int expected = 1124;

        assertEquals(expected, actual);
    }


}
