package stepDefinitions;

import excel.ExcelPrinter;
import excel.ExcelReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    ExcelPrinter epr = null;
    @Given("I have set {string}")
    public void iHaveSetFilename(String filename) {
        try {
            epr = new ExcelPrinter(filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @And("I enter the {string}")
    public void iEnterTheResult(String result) {
          String[][] x = new String[1][1];
         x[0][0] = result;
        epr.add(x, "sheet1");
    }

    @When("I press save")
    public void iPressSave() {
        try {
            epr.write();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("I verify the {string} and {string}")
    public void iVerifyTheFilenameAndResult(String filename, String result) {
        assertTrue((new File("C:/Eclipse/resultat_" + filename + ".xlsx")).exists());
        ExcelReader ere = new ExcelReader();
        try {
            assertEquals(result, ere.getCellInfo(filename, 0, 0, 0));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
