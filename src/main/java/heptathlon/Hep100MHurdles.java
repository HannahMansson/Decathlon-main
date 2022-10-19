package heptathlon;

import common.CalcTrackAndField;
import common.InputResult;

public class Hep100MHurdles {

    private int score;
    private double A = 9.23076;
    private double B = 26.7;
    private double C = 1.835;
    boolean active = true;
    CalcTrackAndField calc = new CalcTrackAndField();
    InputResult inputResult = new InputResult();

    // Calculate the score based on time. All running events.
    public void calculateResult(double runningTime) {

        while (active) {

            try {
                score = calc.calculateTrack(A, B, C, runningTime);
                active = false;

            } catch (Exception e) {

                System.out.println("Please enter numbers");
            }
        }
        System.out.println("The result is " + score);

    }

}
