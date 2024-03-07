Feature: Run the project

  Scenario: Student Travel Insurance Plan
    Given the user navigates to travel insurance plan
    When user enters destination and date
    Then user selects students age
    When user enters medical condition
    Then user enters mobile number
    When user selects students plan
    Then user gets the travel plans

  Scenario: Car Insurance Plan
  	Given the user navigates to car insurance plan
    When user selects buying new car
    Then user selects rto and city details
    When user selects car model and type
    Then user enters personel details
    Then user capture error msg
    
  Scenario: Health Insurance Plan
  	Given the user navigates to Health insurance plan
    When user selects age and city
    Then user enters personal details
    When user checks medical history
    Then user sorts the plans low to high
    Then user gets the health plan name list
    