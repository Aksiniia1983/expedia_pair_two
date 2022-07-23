Feature: Lowest price in the search verification feature

  Scenario: Search input scenario and lowest price feature verification
    Given User on on the expedia home page
    When User clicks on flight button
    And types "Washington DCA" in the Leaving from search box and clicks enter button
    And types "Columbus CMH" in Going to search box and clicks enter button
    And Chooses "Sep 1, 2022" as a departure date and "Sep 3, 2022" as a returning date
    And Clicks search button
    And User is redirected  to the search result page
    When User verifies that "Price (Lowest)" is chosen from the dropdown by default
    Then User verifies that the lowest price flight shows on top of the list



