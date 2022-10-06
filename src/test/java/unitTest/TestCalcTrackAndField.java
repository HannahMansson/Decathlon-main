package unitTest;
import common.CalcTrackAndField;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestCalcTrackAndField {

    @Test
    public void testCalculateTrackDeca100MLowValue() {

        //Arrange
        double A = 25.4347;
        double B = 18.0;
        double C = 1.81;
        double time = 1.0;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A, B, C, time);

        //Assert
        int expected = 4290;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTrackDeca100M() {

        //Arrange
        double A = 25.4347;
        double B = 18.0;
        double C = 1.81;
        double time = 11.0;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A, B, C, time);

        //Assert
        int expected = 861;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTrackDeca100MHighValue() {

        //Arrange
        double A = 25.4347;
        double B = 18.0;
        double C = 1.81;
        double time = 110.0;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A, B, C, time);

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTrackDeca110MHurdLowValue() {

        //Arrange
        double A = 5.74352;
        double B = 28.5;
        double C = 1.92;
        double time = 1.0;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A, B, C, time);

        //Assert
        int expected = 3331;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTrackDeca110MHurd() {

        //Arrange
        double A = 5.74352;
        double B = 28.5;
        double C = 1.92;
        double time = 15;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A, B, C, time);

        //Assert
        int expected = 850;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTrackDeca110MHurdHighValue() {

        //Arrange
        double A = 5.74352;
        double B = 28.5;
        double C = 1.92;
        double time = 150;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A, B, C, time);

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTrackDeca400MLowValue() {

        //Arrange
        double A = 1.53775;
        double B = 82;
        double C = 1.81;
        double time = 10;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A, B, C, time);

        //Assert
        int expected = 3537;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTrackDeca400M() {

        //Arrange
        double A = 1.53775;
        double B = 82;
        double C = 1.81;
        double time = 50.5;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A, B, C, time);

        //Assert
        int expected = 792;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateTrackDeca400MHighValue() {

        //Arrange
        double A = 1.53775;
        double B = 82;
        double C = 1.81;
        double time = 150;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A, B, C, time);

        //Assert
        int expected = 0;

        assertEquals(expected, actual);
    }

}
