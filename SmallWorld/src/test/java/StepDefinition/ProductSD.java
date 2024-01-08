package StepDefinition;
import io.cucumber.java.en.*;

import static Pages.ProductsPage.*;


public class ProductSD {
    @Then("Select a Product from the items list")
    public void selectAProduct() throws InterruptedException {
        select_product();
    }

    @Then("Go to shopping Cart")
    public void goToCart() throws InterruptedException {
        gotocart();
    }

    @Then("Proceed towards checkout")
    public void proceedToCheckout() {
        finishselection();
    }

    @Then("Enter Information (.*) (.*) (.*)$")
    public void enterInformationFirstnameLastnameZipCode(String first, String last, String code) throws InterruptedException {
        fillinfoform(first, last, code);
    }
    @Then("Verify Information and Finish")
    public void verifyInformationAndFinish() throws InterruptedException {
        click_continue();
        click_finish();
    }
    @Then("Selecting filter")
    public static void userClicksOnFilter() throws InterruptedException{
        clickonFilter();
        Thread.sleep(2000);
    }


    @Then("select price filter from low to high")
    public static void selectFilter() throws InterruptedException{
        firstfilterselect();
    }

    @Then("verify product according to the price order")
    public void verifyFilterSorting() throws InterruptedException{
        verifyfilterapplicationandprices();
    }




    @Then("user logouts")
    public void logoutmethod() throws InterruptedException {
        click_humbuger();
        click_logout();
    }


}
