package common;

import decathlon.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SelectDecathlon selectDeca = new SelectDecathlon();
		SelectHeptathlon selectHept = new SelectHeptathlon();

		boolean choice = true;
		String selection;
		Scanner sc = new Scanner(System.in);

		while (choice = true) {
			InputName inputName = new InputName();
			inputName.addCompetitor();

			System.out.println("Please choose competition, enter H for Heptathlon,");
			System.out.println("or enter D for Decathlon");

			selection = sc.nextLine().toUpperCase();
			if (selection.equals("H")){
				selectHept.inputSelection();
			}else if (selection.equals("D")){
				selectDeca.inputSelection();
			}else{
				System.out.println("Invalid input, try again");
			}

		}
		choice = false;
	}
}
