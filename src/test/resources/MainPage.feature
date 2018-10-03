@all
Feature: main page

  Background:
    And I login to platform

  Scenario:
    Given I open i.ua site
    When Enter login into login page
    And Enter password into login page
    Then I check entered login
    Then I check entered password
    And Click on log in button
    And Check that I see main page button.
    Then I close browser window
#
#  Scenario:
#    Given I open i.ua site
#    When Enter uncorrect login into login page
#    And Enter password into login page
#    Then I check entered login
#    Then I check entered password
#    And Click on log in button
#    And I see error page
#    Then I close browser window
#
#  Scenario:
#    Given I open i.ua site
#    When Enter login into login page
#    And Enter uncorret password into login page
#    Then I check entered login
#    Then I check entered password
#    And Click on log in button
#    And I see error page
#    Then I close browser window
#
#
#  Scenario:
#    Given I open i.ua site
#    When I make login
#    And Check that I see main page button.
#    And I click on button creat email
#    And Enter adress of email
#    And Enter theme of email
#    And Enter text of email
#    And Click send mail button
#    Then I see text of success send
#    Then I close browser window
#
#
#  Scenario:
#    Given I open i.ua site
#    When I make login
#    And Check that I see main page button.
#    And Click on inbox button
#    And Check theme of email
#    And Open letter
#    And Check text and name of Sender
#    Then I close browser window
#
#  Scenario:
#    Given I open i.ua site
#    When I make login
#    And Check that I see main page button.
#    And I go to main page
#    And Make logout
#    Then I see login page
#    And I make login
#    And Check that I see main page button.
#    Then I close browser window
#














