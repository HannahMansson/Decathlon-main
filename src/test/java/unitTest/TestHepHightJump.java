package unitTest;
import common.CalcTrackAndField;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestHepHightJump {

    @Test

    public void testHepHightJump(){

        //Arrange
        double A = 1.84523;
        double B = 75;
        double C = 1.348;
        double distance = 165;

        CalcTrackAndField calc = new CalcTrackAndField();

        //Act

        int actual = calc.calculateField(A,B,C,distance);

        //Assert

        int expected = 795;



        assertEquals(expected, actual);
    }


}
