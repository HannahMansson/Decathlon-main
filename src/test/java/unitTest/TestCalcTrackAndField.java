package unitTest;

import common.CalcTrackAndField;
import decathlon.*;
import heptathlon.HeptJavelinThrow;
import heptathlon.HeptLongJump;
import heptathlon.HeptShotPut;
import junit.framework.TestCase;
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

    @Test
    public void testHep200M(){

        //Arrange
        double A = 4.99087;
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

    @Test
    public void testHepHighJump(){

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

    @Test   //testar input och resultat för Heptathlon Javelint hrow
    public void testHeptJavelinThrow() {
        //Arrange
        HeptJavelinThrow myRace = new HeptJavelinThrow();
        //Act
        int actual = myRace.calculateResult(45.0);
        //Assert
        int expected = 763;
        Assertions.assertEquals(expected, actual);

    }

    @Test   //testar input och resultat för Heptathlon Shotput
    public void testHeptShotPut() {
        //Arrange
        HeptShotPut myRace = new HeptShotPut();
        //Act
        int actual = myRace.calculateResult(14.26);
        //Assert
        int expected = 811;
        Assertions.assertEquals(expected, actual);

    }

    @Test   //testar input och resultat för Heptathlon Long Jump
    public void testHeptLongJump() {
        //Arrange
        HeptLongJump myRace = new HeptLongJump();
        //Act
        int actual = myRace.calculateResult(685.0);
        //Assert
        int expected = 1122;
        Assertions.assertEquals(expected, actual);

    }

    @Test   //testar input och resultat för Decathlon Shotput
    public void testDecaShotPut() {
        //Arrange
        DecaShotPut myRace = new DecaShotPut();
        //Act
        int actual = myRace.calculateResult(16.78);
        //Assert
        int expected = 899;
        Assertions.assertEquals(expected, actual);

    }

    @Test   //testar input och resultat för Decathlon Dicus Throw
    public void testDecaDiscusThrow() {
        //Arrange
        DecaDiscusThrow myRace = new DecaDiscusThrow();
        //Act
        int actual = myRace.calculateResult(50.54);
        //Assert
        int expected = 882;
        Assertions.assertEquals(expected, actual);

    }

    @Test   //testar input och resultat för Decathlon Javelin Throw
    public void testDecaJavelinThrow() {
        //Arrange
        DecaJavelinThrow myRace = new DecaJavelinThrow();
        //Act
        int actual = myRace.calculateResult(71.90);
        //Assert
        int expected = 918;
        Assertions.assertEquals(expected, actual);

    }

    @Test//testar formeln för beräkning av Field grenar med data för Heptshotput
    public void testCalcTrackAndFieldField() {
        //Arrange
        double A = 56.0211;
        double B = 1.5;
        double C = 1.05;
        double distance = 16.5;
        CalcTrackAndField calc = new CalcTrackAndField();
        //Act
        int actual = calc.calculateField(A, B, C, distance);
        //Assert
        int expected = 962;
        Assertions.assertEquals(expected, actual);
    }
}
