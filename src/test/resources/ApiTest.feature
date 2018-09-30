@all
Feature: Api page



  @api
  Scenario:
    When Send Get request to i.ua


  @api
  Scenario:
    When Check data from i.ua

  @api
  Scenario:
    When I check correct log in on i.ui
    When I send post request to i.ui


  Scenario:
       When I log in into iua
       When i log in into iua with uncorrect password

  Scenario:
    When Send GET request to whether ua


