Feature: Test search feature

  Scenario Outline: Test search feature with product name
    Given Open Application url in browser
    When User enters "<keyword>" inserachbox
    And Hit enter key
       Then User should get relevent products
       
       Examples:
       | keyword |
       | username1 |
       | username2 |
       | username3 |
       
    

  