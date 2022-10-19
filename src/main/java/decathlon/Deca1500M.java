package decathlon;

import common.*;

public class Deca1500M {

    private int score;
    private double A = 0.03768;
    private double B = 480;
    private double C = 1.85;
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
        System.out.println("The result is: " + score);

    }

}
