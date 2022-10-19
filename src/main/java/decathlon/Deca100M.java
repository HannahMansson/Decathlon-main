package decathlon;

import common.*;

public class Deca100M {

    private int score;
    private double A = 25.4347;
    private double B = 18;
    private double C = 1.81;
    boolean active = true;
    CalcTrackAndField calc = new CalcTrackAndField();
    InputResult inputResult = new InputResult();

    // Calculate the score based on time. All running events.
    public int calculateResult(double runningTime) {

        while (active) {

            try {
                score = calc.calculateTrack(A, B, C, runningTime);
                active = false;

            } catch (Exception e) {

                System.out.println("Please enter numbers");
            }
        }
        System.out.println("The result is " + score);

        return score;
    }

}
