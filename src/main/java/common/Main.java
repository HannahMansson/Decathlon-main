package common;

import decathlon.*;

public class Main {

	public static void main(String[] args) {
		boolean choice = true;
		while (choice = true) {
			InputName inputName = new InputName();
			inputName.addCompetitor();
			System.out.println(inputName.getName());

			SelectDiscipline selectDiscipline = new SelectDiscipline();
			selectDiscipline.inputSelection();

		}
		choice = false;
	}
}
