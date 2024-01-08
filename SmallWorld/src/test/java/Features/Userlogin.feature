Feature: User navigates to sauce demo website and login with credentials.
  Scenario Outline: Entering username and passwords for login and landing on homepage
    Given User Logins with <username> and <password>
    Then User redirects to Dashboard
    Examples:
      |username|password|
      |standard_user|secret_sauce|
      |standard_user         |        123534    |


