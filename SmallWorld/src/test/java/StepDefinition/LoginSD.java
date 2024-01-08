package StepDefinition;

import io.cucumber.java.en.*;

import static Pages.LoginPage.*;

public class LoginSD {

    @Given("^User Logins with (.*) and (.*)$")
    public void userLoginsWithUsernameAndPassword(String usname, String pass) throws InterruptedException {
        login(usname, pass );

    }

    @Then("User redirects to Dashboard")
    public void userIsOnProductPage() throws InterruptedException {
        verify_loginstatus();

    }
}