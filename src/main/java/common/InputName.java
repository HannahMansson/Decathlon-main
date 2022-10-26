package common;

import java.util.ArrayList;
import java.util.Scanner;

public class InputName {
	String compName = "";
	ArrayList<String> competitor = new ArrayList<>();
	
	//Add competitor
	public String addCompetitor() {

		boolean active = true;
		String compName = "";
		Scanner sc = new Scanner(System.in);
		
		while (active) {
			System.out.println("Please enter the competitor's name:");
			compName = sc.nextLine();
			if (!compName.matches(".*[a-öA-ö]")) {
				System.out.println("Only use letters when putting in competitors name.");

			} else {
				saveName(compName);
				active = false;
			}

		} 
		return compName;
	}

	public String getName() {
		return compName;
	}

	public void saveName(String name) {
		compName = name;
		competitor.add(compName);
	}
}
