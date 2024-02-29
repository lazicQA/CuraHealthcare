package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    WebElement makeAppointmentButton, selectFacilityDropDown, hospitalReadminssionRB, vistitDateField, commentField, bookAppointmentButton;
    List<WebElement> healthPrgRadioButtons = new ArrayList<>();


    public WebElement getMakeAppointmentButton() {
        return driver.findElement(By.id("btn-make-appointment"));
    }

    public WebElement getSelectFacilityDropDown() {
        return driver.findElement(By.id("combo_facility"));
    }

    public WebElement getHospitalReadminssionRB() {
        return driver.findElement(By.id("chk_hospotal_readmission"));
    }

    public WebElement getVistitDateField() {
        return driver.findElement(By.id("txt_visit_date"));
    }

    public WebElement getCommentField() {
        return driver.findElement(By.id("txt_comment"));
    }

    public WebElement getBookAppointmentButton() {
        return driver.findElement(By.id("btn-book-appointment"));
    }

    public List<WebElement> getHealthPrgRadioButtons() {
        return driver.findElements(By.className("radio-inline"));
    }

    public void clickOnMakeAppointmentButton() {

        makeAppointmentButton.click();
    }



public void selectFacility(String facilityName) {
    Select dropdown = new Select(selectFacilityDropDown);
    dropdown.selectByValue(facilityName);
}

}

