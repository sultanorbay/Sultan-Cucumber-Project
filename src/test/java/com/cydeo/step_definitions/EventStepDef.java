package com.cydeo.step_definitions;

import com.cydeo.pages.EventPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventStepDef {

    EventPage eventPage = new EventPage();


    @Given("Users are on login page")
    public void users_are_on_login_page() {

        String URL = ConfigurationReader.get("url");
        Driver.getDriver().get(URL);
    }

    @Given("Users type valid {string} and {string}")
    public void users_type_valid_and(String Username, String Password) {

        eventPage.username.sendKeys(Username);
        eventPage.password.sendKeys(Password);
    }

    @When("Users enter Log In button")
    public void users_enter_Log_In_button() {
        eventPage.loginBtn.click();
    }



    @When("Users click {string} module")
    public void users_click_module(String string) {

        eventPage.activityStream.click();

    }

    @When("Users should see and click {string} element")
    public void users_should_see_and_click_element(String element) {
        eventPage.event.isDisplayed();
        eventPage.event.click();
    }

    @Then("Users should be able to choose start date, delete and add new start date")
    public void users_should_be_able_to_choose_start_date_delete_and_add_new_start_date() {
        String s = Keys.chord(Keys.CONTROL,"a");
        eventPage.eventStartDate.sendKeys(s);
        eventPage.eventStartDate.sendKeys(Keys.DELETE);
        eventPage.eventStartDate.sendKeys("04/18/2023");
    }


    @Then("Users should be able to choose start hours,delete and add new hours")
    public void users_should_be_able_to_choose_start_hours_delete_and_add_new_hours() {
        eventPage.eventStartTime.click();
        String s = Keys.chord(Keys.CONTROL,"a");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@title='Hours'])[1]")));
        eventPage.eventStartHour.sendKeys(s);
        eventPage.eventStartHour.sendKeys(Keys.DELETE);
        eventPage.eventStartHour.sendKeys("15");

    }

    @Then("User should be able to choose start minutes,delete and add new minutes")
    public void user_should_be_able_to_choose_start_minutes_delete_and_add_new_minutes() {
        String s = Keys.chord(Keys.CONTROL,"a");
        eventPage.eventStartMinute.sendKeys(s);
        eventPage.eventStartMinute.sendKeys(Keys.DELETE);
        eventPage.eventStartMinute.sendKeys("22");

    }

    @Then("Users should be able to choose end date, delete and add new end date")
    public void usersShouldBeAbleToChooseEndDateDeleteAndAddNewEndDate() {
        String s = Keys.chord(Keys.CONTROL,"a");
        eventPage.eventEndDate.sendKeys(s);
        eventPage.eventEndDate.sendKeys(Keys.DELETE);
        eventPage.eventEndDate.sendKeys("04/19/2023");

    }

    @And("Users should be able to choose end hours,delete and add new hours")
    public void usersShouldBeAbleToChooseEndHoursDeleteAndAddNewHours() {
        eventPage.eventEndDate.click();
        String s = Keys.chord(Keys.CONTROL,"a");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@class='bxc-cus-sel'])[2]")));


        eventPage.eventEndHour.sendKeys(s);
        eventPage.eventEndHour.sendKeys(Keys.DELETE);
        eventPage.eventEndHour.sendKeys("02:00");

    }

    @And("User should be able to choose end minutes,delete and add new minutes")
    public void userShouldBeAbleToChooseEndMinutesDeleteAndAddNewMinutes() {
        String s = Keys.chord(Keys.CONTROL,"a");
        eventPage.eventEndMinute.sendKeys(s);
        eventPage.eventEndTime.sendKeys(Keys.DELETE);
        eventPage.eventEndMinute.sendKeys("0");
    }

    @Then("Users click Specify Time Zone button")
    public void users_click_specify_time_zone_button() {

        eventPage.specifyTimeZone.click();
        Select selectDropdown = new Select(eventPage.startTimeZone);
        selectDropdown.selectByValue("Asia/Qatar");
    }


//----------------TC-2----------------------------------

    @When("Users see and click {string} button")
    public void usersSeeAndClickButton(String arg0) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        eventPage.eventLocation.click();
    }


    @Then("Users should be able to see and click {string} button")
    public void usersShouldBeAbleToSeeAndClickButton(String arg0) {

        eventPage.selectMeetingRoom.click();


    }

    //----------------------TC-3----------------------

    @When("Users see {string} element")
    public void users_see_element(String members) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        eventPage.members.isDisplayed();


    }


    @Then("Users can see and click {string} button")
    public void users_can_see_and_click_button(String employees) {

        eventPage.addperson.click();
    }



    @Then("User should be able to  add {string} modules")
    public void user_should_be_able_to_add_modules(String string) {
        eventPage.allEmployees.click();
    }




    //------------------TC-4--------------------

    @When("User write {string}")
    public void user_write(String string) {
        eventPage.eventName.click();
    }


    @Then("Users should be able to click {string} button")
    public void users_should_be_able_to_click_button(String string) {
        eventPage.sendButton.click();
    }








}
