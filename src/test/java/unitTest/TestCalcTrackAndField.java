package unitTest;

import common.CalcTrackAndField;
import decathlon.Deca100M;
import decathlon.Deca110MHurdles;
import decathlon.Deca400M;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestCalcTrackAndField {

    @Test
    public void testCalculateField() {

        //Arrange (testdata)
        double A = 25.4347;
        double B = 18;
        double C = 1.81;
        double time = 11.0;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act

        int actual = calc.calculateTrack(A,B,C,time);

        //Assert

        int expected = 861;



        assertEquals(expected, actual);
    }

    @Test
    public void testDeca100MLow() {

        //Arrange
        Deca100M myRace = new Deca100M();

        //Act
        int actual = myRace.calculateResult(1.0);

        //Assert
        int expected = 4290;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDeca100M() {

        //Arrange
        Deca100M myRace = new Deca100M();

        //Act
        int actual = myRace.calculateResult(11.0);

        //Assert
        int expected = 861;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDeca100MHigh() {

        //Arrange
        Deca100M myRace = new Deca100M();

        //Act
        int actual = myRace.calculateResult(110.0);

        //Assert
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDeca110MHurdLow() {

        //Arrange
        Deca110MHurdles myRace = new Deca110MHurdles();

        //Act
        int actual = myRace.calculateResult(1.0);

        //Assert
        int expected = 3331;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDeca110MHurd() {

        //Arrange
        Deca110MHurdles myRace = new Deca110MHurdles();

        //Act
        int actual = myRace.calculateResult(15.0);

        //Assert
        int expected = 850;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDeca110MHurdHigh() {

        //Arrange
        Deca110MHurdles myRace = new Deca110MHurdles();

        //Act
        int actual = myRace.calculateResult(30.0);

        //Assert
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDeca400MLow() {

        //Arrange
        Deca400M myRace = new Deca400M();

        //Act
        int actual = myRace.calculateResult(10.0);

        //Assert
        int expected = 3537;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDeca400M() {

        //Arrange
        Deca400M myRace = new Deca400M();

        //Act
        int actual = myRace.calculateResult(50.5);

        //Assert
        int expected = 792;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDeca400MHigh() {

        //Arrange
        Deca400M myRace = new Deca400M();

        //Act
        int actual = myRace.calculateResult(150.0);

        //Assert
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}
