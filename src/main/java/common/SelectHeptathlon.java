package common;

import heptathlon.*;

import java.util.Scanner;

public class SelectHeptathlon {

    int disciplineSelected;
    InputResult inputResult = new InputResult();
    Scanner sc = new Scanner(System.in);
    Hep200M hep200M = new Hep200M();
    Hep800M hep800M = new Hep800M();
    Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
    HeptHightJump hepHighJump = new HeptHightJump();
    HeptLongJump hepLongJump = new HeptLongJump();
    HeptShotPut hepShotPut = new HeptShotPut();
    HeptJavelinThrow hepJavelinThrow = new HeptJavelinThrow();

    public void inputSelection() {
        System.out.println("Select discipline.");
        printDisciplines();

        try {

            disciplineSelected = Integer.parseInt(sc.nextLine());
            makeSelection();

        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
            System.out.println("");
            inputSelection();
        }

    }

    public void makeSelection() {
        switch (disciplineSelected) {

            case 1:
                hep200M.calculateResult(inputResult.enterResult());
                break;
            case 2:
                hep800M.calculateResult(inputResult.enterResult());
                break;
            case 3:
                hep100MHurdles.calculateResult(inputResult.enterResult());
                break;
            case 4:
                hepHighJump.calculateResult(inputResult.enterResult());
                break;
            case 5:
                hepLongJump.calculateResult(inputResult.enterResult());
                break;
            case 6:
                hepShotPut.calculateResult(inputResult.enterResult());
                break;
            case 7:
                hepJavelinThrow.calculateResult(inputResult.enterResult());
                break;
            default:
                System.out.println("Invalid input, try again.");
                System.out.println("");
                inputSelection();
                break;
        }
    }
    public void printDisciplines() {
        System.out.println("1. Heptathlon 200 meters. (Measured in seconds)");
        System.out.println("2. Heptathlon 800 meters. (Measured in seconds)");
        System.out.println("3. Heptathlon 100 meters hurdles. (Measured in seconds)");
        System.out.println("4. Heptathlon High Jump. (Measured in centimeters)");
        System.out.println("5. Heptathlon Long Jump. (Measured in centimeters)");
        System.out.println("6. Heptathlon Shot Put. (Measured in meters)");
        System.out.println("7. Heptathlon Javelin Throw. (Measured in meters)");
    }
}
