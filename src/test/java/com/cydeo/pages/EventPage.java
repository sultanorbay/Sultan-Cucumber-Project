package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage {
    public EventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginBtn;

    @FindBy(css = "div#pagetitle")
    public WebElement activityStream;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-calendar']")
    public WebElement event;

    @FindBy(xpath = "//input[@name='EVENT_NAME']")
    public WebElement eventName;

    @FindBy(xpath = "//body[@style='min-height: 104px;']")
    public WebElement messageConsole;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm_calendar']")
    public WebElement uploadFiles;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement link;

    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement insertVideo;

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement quoteText;

    @FindBy(xpath = "//span[@id='lhe_button_editor_blogPostForm_calendar']")
    public WebElement visualEditor;

    @FindBy(id = "feed-cal-event-fromcal_3Jcl")
    public WebElement eventStartDate;

    @FindBy(id = "feed-cal-event-tocal_3Jcl")
    public WebElement eventEndDate;

    @FindBy(id = "feed_cal_event_from_timecal_3Jcl")
    public WebElement eventStartTime;

    @FindBy(xpath = "(//input[@title='Hours'])[1]")
    public WebElement eventStartHour;

    @FindBy(xpath = "(//input[@title='Minutes'])[1]")
    public WebElement eventStartMinute;

    @FindBy(xpath = "//input[@id='feed_cal_event_to_timecal_3Jcl']")
    public WebElement eventEndTime;

    @FindBy(xpath = "(//input[@title='Hours'])[1]")
    public WebElement eventEndHour;

    @FindBy(xpath = "(//input[@class='bxc-cus-sel'])[2]")
    public WebElement eventEndMinute;

    @FindBy(xpath = "//input[@name='EVENT_FULL_DAY']")
    public WebElement allDay;

    @FindBy(xpath = "//span[.='Specify time zone']")
    public WebElement specifyTimeZone;

    @FindBy(id="feed-cal-tz-fromcal_3Jcl")
    public WebElement startTimeZone;

    @FindBy(xpath = "//select[@name='TZ_TO']")
    public WebElement endTimezone;

    @FindBy(xpath = "//span[.='Hide time zone']")
    public WebElement hideTimeZone;

    @FindBy(xpath = "//label[@class='feed-event-rem-lbl']")
    public WebElement setReminder;

    @FindBy(id = "event-remind_countcal_3Jcl")
    public  WebElement reminderTime;

    @FindBy(id="event-remind_typecal_3Jcl")
    public  WebElement reminderType;

    @FindBy(xpath = "//label[.='Event location']")
    public WebElement eventLocation;


    @FindBy(id = "event-locationcal_3Jcl")
    public WebElement selectMeetingRoom;

    @FindBy(xpath = "//div[.='Members:']")
    public WebElement members;

    @FindBy(xpath = "//a[@id='feed-event-dest-add-link']")
    public WebElement addperson;

    @FindBy(xpath = "//span[.='People:']")
    public  WebElement people;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public  WebElement allEmployees;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-last bx-finder-box-tab-selected']")
    public  WebElement recent;

    @FindBy(id = "//a[@id='destDepartmentTab_calnAJEM3']")
    public  WebElement employeesDepartments;

    @FindBy(xpath = "//label[.='Availability']")
    public WebElement availability;

    @FindBy(xpath = "//select[@name='EVENT_ACCESSIBILITY']")
    public WebElement availabilityOptions;

    @FindBy(xpath = "//label[.='Repeat']")
    public WebElement repeat;

    @FindBy(id = "event-repeatcal_3Jcl")
    public WebElement repeatOptions;

    @FindBy(xpath = "//label[.='Calendar']")
    public WebElement calendar;

    @FindBy(xpath = "//select[@name='EVENT_SECTION']")
    public WebElement calendarSection;

    @FindBy(xpath = "//label[.='Importance']")
    public WebElement importance;

    @FindBy(xpath = "//select[@name='EVENT_IMPORTANCE']")
    public WebElement importanceOptions;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;





}
