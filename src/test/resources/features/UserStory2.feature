Feature: As a personal finance lover, I can track all my expenses in a easy way.

  @ui @userstory2 @solution
  Scenario: Mandatory fields are displayed on Add expenses page
    Given User logged in
    When User navigates to Add expenses page
    Then Date, category, amount and description of the expense fields are displayed

  @ui @userstory2 @solution
  Scenario: User can create an expense
    Given User logged in
    When User navigates to Add expenses page
    And User fills out all the details for
    Then the new expense gets created and added to the List Expenses

  @ui @userstory2 @wip
  Scenario: User gets message if DAY field is missing
    Given User logged in
    And User navigates to Add expenses page
    When User fills out all the details for except the day
    And User tries to create expense
    Then User gets an message to fill out the missing day field

  @ui @userstory2 @wip
  Scenario: User gets message if MONTH field is missing
    Given User logged in
    And User navigates to Add expenses page
    When User fills out all the details for except the month
    And User tries to create expense
    Then User gets an message to fill out the missing month field

  @ui @userstory2 @wip
  Scenario: User gets message if YEAR field is missing
    Given User logged in
    And User navigates to Add expenses page
    When User fills out all the details for except the year
    And User tries to create expense
    Then User gets an message to fill out the missing year field

  @ui @userstory2 @wip
  Scenario: User gets message if CATEGORY field is missing
    Given User logged in
    And User navigates to Add expenses page
    When User fills out all the details for except the category
    And User tries to create expense
    Then User gets an message to fill out the missing category field

  @ui @userstory2 @wip
  Scenario: User gets message if AMOUNT field is missing
    Given User logged in
    And User navigates to Add expenses page
    When User fills out all the details for except the amount
    And User tries to create expense
    Then User gets an message to fill out the missing amount field

  @ui @userstory2 @wip
  Scenario: User gets message if reason field is missing
    Given User logged in
    And User navigates to Add expenses page
    When User fills out all the details for except the reason
    And User tries to create expense
    Then User gets an message to fill out the missing reason field

  @ui @userstory2 @wip
  Scenario: User gets message if REASON field is missing
    Given User logged in
    And User navigates to Add expenses page
    When User fills out all the details for except the reason
    And User tries to create expense
    Then User gets an message to fill out the missing reason field

  @ui @userstory2 @wip
  Scenario: User can reset the fields
    Given User logged in
    And User navigates to Add expenses page
    When User fills out all the details
    And User click on Reset button
    Then fields should get reset

  @ui @userstory2 @wip
  Scenario: User can only write numbers into amount field
    Given User logged in
    And User navigates to Add expenses page
    When User fills out all the details
    And User writes a letter into the amount field
    Then  User gets an message that only numbers can be written