# SAMRATEST-SMWORLD24
Procedures for Running this Project and configuration and Composition
Go to the Master Branch
Go to Terminal of the Project or gitbash and type in the following Command
git checkout master
Then follow the steps below.
1. Install all POM.xml file dependencies
2. Project consist of Three Sections
    - Features
      - Includes all the tests into Gherkin Language(Given, When and Then)
      - \SmallWorld\src\test\java\Features
    - Step Definition
      - Includes the Glue code that works as a bridge for running the test
      - SmallWorld\src\test\java\StepDefinition
    - Pages Files
      - Includes all the elements and the methods. 
      - SmallWorld\src\test\java\Pages
4. To perform all the tests Go to Test runner file and execute it. It will Run all sequencially.
5. To perform tests in Allure Reports.
   Run the command "allure serve allure-results"
   
