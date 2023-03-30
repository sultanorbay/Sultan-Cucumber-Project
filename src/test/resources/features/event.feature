@APCRM-310
Feature: Create events features
  Agile Story: As a user, I should be able to create events by clicking on Event tab under Activity Stream.

  Background:
    Given Users are on login page

  @APCRM-350
  Scenario: Users enters new start and end date and time
    And Users type valid "hr88@cybertekschool.com" and "UserUser"
    When Users enter Log In button
    And Users click "Activity Stream" module
    And Users should see and click "EVENT" element
    Then Users should be able to choose start date, delete and add new start date
    And Users should be able to choose start hours,delete and add new hours
    And User should be able to choose start minutes,delete and add new minutes
    Then Users should be able to choose end date, delete and add new end date
    And Users should be able to choose end hours,delete and add new hours
    And User should be able to choose end minutes,delete and add new minutes
    Then Users click Specify Time Zone button


  @APCRM-351
  Scenario: User select meeting place
    And Users type valid "hr88@cybertekschool.com" and "UserUser"
    When Users enter Log In button
    And Users should see and click "EVENT" element
    When Users see and click "Event location" button
    Then Users should be able to see and click "Select meeting room" button


  @APCRM-352
  Scenario: User add people for event
    And Users type valid "hr88@cybertekschool.com" and "UserUser"
    When Users enter Log In button
    And Users should see and click "EVENT" element
    And Users can see and click "Add persons, groups or department" button
    Then User should be able to  add "To all employees" modules





  @APCRM-353
  Scenario: User can give  event calendar message
    And Users type valid "hr88@cybertekschool.com" and "UserUser"
    When Users enter Log In button
    And Users should see and click "EVENT" element
    When User write "Event name"
    Then  Users should be able to click "SEND" button

