@User
Feature: search
  As a user i should be able to search for blues hockey on google
  @User
Scenario: Go to google
  Given i am on google
  When i search on google
  Then i should see blues hockey