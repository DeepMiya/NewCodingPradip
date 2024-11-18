Feature:Naukri profile update

  Scenario Outline : Login to Naukri
    Given enter valid <username> and <password>
    When click on login button
    Then User should successfuly login with search bar present on dashboard
    Examples:
      | username             | password   |
      | pradipsp67@gmail.com | Pawar@2303 |


  Scenario : User logs in successfully to Naukri
    Given user should be on home page of naukri
    When click on my profile pics
    And click on view and update profile
    Then Profile Mynaukri page should open


