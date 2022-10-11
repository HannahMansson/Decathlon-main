package unitTest;

import common.*;
import decathlon.*;
import heptathlon.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class unitTests {

    @Test
        //testar formeln för beräkning av Track grenar med data för Deca100M
    void testCalcTrackAndFieldTrack() {
        //Arrange
        double A = 25.4347;
        double B = 18.0;
        double C = 1.81;
        double distance = 11.0;
        CalcTrackAndField calc = new CalcTrackAndField();
        //Act
        int actual = calc.calculateTrack(A, B, C, distance);
        //Assert
        int expected = 861;
        assertEquals(expected, actual);
    }

    @Test
        //testar formeln för beräkning av Field grenar med data för Heptshotput
    void testCalcTrackAndFieldField() {
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
        assertEquals(expected, actual);
    }

    @Test   //testar input av resultat
    public void testInputResult() {
        //Arrange
        ByteArrayInputStream in = new ByteArrayInputStream("11.0".getBytes());
        System.setIn(in);
        InputResult myInput = new InputResult();
        //Act
        myInput.enterResult();
        double actual = myInput.returnResult();
        //Assert
        double expected = 11.0;
        assertEquals(expected, actual);
    }

    @Test   //testar input av namn
    public void testInputName() {
        //Arrange
        ByteArrayInputStream in = new ByteArrayInputStream("Ella Karlsson".getBytes());
        System.setIn(in);
        InputName myInput = new InputName();
        //Act
        String actual = myInput.addCompetitor();
        //Assert
        String expected = "Ella Karlsson";
        assertEquals(expected, actual);
    }

    @Test   //testar input och resultat för Decathlon 100M
    public void testDeca100M() {
        //Arrange
        Deca100M myRace = new Deca100M();
        //Act
        int actual = myRace.calculateResult(11.0);
        //Assert
        int expected = 861;
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
        assertEquals(expected, actual);

    }
    @Test   //testar input och resultat för Heptathlon Shotput
    public void testHeptShotPut() {
        //Arrange
        HeptShotPut myRace = new HeptShotPut();
        //Act
        int actual = myRace.calculateResult(14.26);
        //Assert
        int expected = 811;
        assertEquals(expected, actual);

    }
    @Test   //testar input och resultat för Heptathlon Long Jump
    public void testHeptLongJump() {
        //Arrange
        HeptLongJump myRace = new HeptLongJump();
        //Act
        int actual = myRace.calculateResult(685.0);
        //Assert
        int expected = 1122;
        assertEquals(expected, actual);

    }
    @Test   //testar input och resultat för Decathlon Shotput
    public void testDecaShotPut() {
        //Arrange
        DecaShotPut myRace = new DecaShotPut();
        //Act
        int actual = myRace.calculateResult(16.78);
        //Assert
        int expected = 899;
        assertEquals(expected, actual);

    }
    @Test   //testar input och resultat för Decathlon Dicus Throw
    public void testDecaDiscusThrow() {
        //Arrange
        DecaDiscusThrow myRace = new DecaDiscusThrow();
        //Act
        int actual = myRace.calculateResult(50.54);
        //Assert
        int expected = 882;
        assertEquals(expected, actual);

    }
    @Test   //testar input och resultat för Decathlon Javelin Throw
    public void testDecaJavelinThrow() {
        //Arrange
        DecaJavelinThrow myRace = new DecaJavelinThrow();
        //Act
        int actual = myRace.calculateResult(71.90);
        //Assert
        int expected = 918;
        assertEquals(expected, actual);

    }
}