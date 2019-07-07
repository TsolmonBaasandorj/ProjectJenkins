Feature: Home page

  Background:
    Given I navigate to the URL "https://www.techleadacademy.io/"

  Scenario: printText
    Then I print all the texts in navigation table


  @regression @smoke @test
  Scenario: Home link test
    Then I should see the "Home" link
#    Then I should see the "Timeline" link
#    Then I should see the "About Us" link
#    Then I should see the "Curriculum" link
    Then I should see the "Certifications" link
    Then I should see the "Info Session" link
    Then I should see the "Contact" link
    Then I should see the "Apply Now" link


  @test
  Scenario: All links test
    Then I validate all the following links:
      | Home           |
      | Timeline       |
      | About Us       |
      | Curriculum     |
      | Certifications |
      | Event List     |
      | Contact        |
      | More           |

  Scenario: Check email textBoxes test
    And I should able to enter "Tsolmon" to "First Name" textbox
    And I should able to enter "Baasandorj" to "Last Name" textbox
    And I should able to enter "99555352" to "Phone" textbox
    And I should able to enter "Tsolmon_mm@yahoo.com" to "Email" textbox
    And I should able to enter "New message" to "Subject" textbox
    And I should able to enter "hello hello hello" to "Type your message here..." textbox


  Scenario: Check if buttons are working
    And I should able to see "submit" button


  Scenario: Email textBoxes testing
    Then I should able to see information on the textBoxes:
      | First Name                | Tsolmon              |
      | Last Name                 | Baasandorj           |
      | Phone                     | 99555352             |
      | Email                     | Tsolmon_mm@yahoo.com |
      | Subject                   | New message          |
      | Type your message here... | hello hello hello    |

  Scenario Outline: test <url>
    Given I open a page with URL <url>

    Examples: urls
      | url                     |
      | https://www.google.com/ |
      | https://www.amazon.com/ |
      | https://www.yahoo.com/  |
      | https://www.apple.com/  |

  Scenario Outline: login as <user>
    Given I navigate to the URL "https://www.techleadacademy.io/"
    #Then I login as <user> with username <username> and password <password>
    Then I should see the homepage

    Examples: user credintials
      | user         | username | password |
      | manager      | manager1 | pass1    |
      | general user | user1    | pass2    |
      | admin        | admin1   | pass3    |

  Scenario: Orbitz ticket search
    Given I navigate to the URL "https://www.orbitz.com"
    And I choose "Flight" option
    And I choose "Flying from" "Washington, DC (WAS-All Airports)"
    And I choose "Flying to" "Kansas City, MO (MKC-All Airports)"
    And I choose "Departing" date of "07/26/2019"
    And I choose "Returning" date of "03/04/2020"
    When I click "Search" button
    Then I should see the flight options

  Scenario: Validate all student's info
    Given I validate all the student information is correct
      | FirstName | LastName   | Gender | Age | City           |
      | Tsolmon   | Baasandorj | Female | 26  | Alexandria, VA |
      | Khaliunaa | Baasandorj | Female | 31  | Alexandria, VA |
      | Kuba      | Zhaanbaev  | Male   | 33  | Alexandria, VA |
      | Nurik     | Ibraimov   | Male   | 27  | Alexandria, VA |


  Scenario: Contact TechLeadAcademy
  And I send emails using folowing values:
       | FirstName | LastName  | Phone     | Email                  | Subject | Message |
      | Tsolmon    | Baasandorj | 703380000 | tsolmon_mm@yahoo.com   | hi      | This is Tsolmon           |
      | Khaliunaa  | Baasandorj | 703381111 | Khaliunaa_mm@yahoo.com | hi      | This is Khaliunaa         |
      | Kuba       | Zhaanbaev  | 703382222 | Kuba_mm@yahoo.com      | hi      | This is Kuba              |
      | Nurik      | Ibraimov   | 703383333 | Nurik_mm@yahoo.com     | hi      | This is Nurik             |



#Scenario: Validate all employee info
#  Given I validate all the employee information is correct
#  |Firstname|Lastname|Gender|Age|
#  |Laura    |Tran    |Female|54 |
#  |Mel      |Bui     |Female|36 |
#  |Jenny    |Hoi     |Female|41 |
#  |Gina     |Purevjav|Female|40 |
#











