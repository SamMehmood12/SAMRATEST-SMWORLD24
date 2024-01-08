package Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Tosetbrowser;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends Tosetbrowser {
    public static String addtocart = "add-to-cart-sauce-labs-backpack";
    public static String  shoppingcart = "shopping_cart_container";
    public static String checkout = "checkout";
    public static String firstn = "first-name";
    public static String lastn = "last-name";
    public static String postalcode = "postal-code";
    public static String continuebutton = "continue";
    public static String finishbutton = "finish";

    public static String humbugermenu="react-burger-menu-btn";

    public static String logoutbutton= "logout_sidebar_link";
    public static String clickonFiltericon = "//select[@class='product_sort_container']";
    public static String selectFilteroption = "//option[@value='lohi']";
    public static String priceFilter = "inventory_item_price";




    public static void select_product() throws InterruptedException {
        driver.findElement(By.id(addtocart)).click();
        Thread.sleep(2000);
    }

    public static void gotocart() throws InterruptedException {

        driver.findElement(By.id(shoppingcart)).click();
        Thread.sleep(2000);
    }

    public static void finishselection() {

        driver.findElement(By.id(checkout)).click();
    }

    public static void fillinfoform(String fname, String lname, String Zipcode) throws InterruptedException {
        driver.findElement(By.id(firstn)).sendKeys(fname);
        driver.findElement(By.id(lastn)).sendKeys(lname);
        driver.findElement(By.id(postalcode)).sendKeys(Zipcode);
        Thread.sleep(2000);
    }

    public static void click_continue() {
        driver.findElement(By.id(continuebutton)).click();
    }
    public static void click_finish() throws InterruptedException {

        driver.findElement(By.id(finishbutton)).click();
        Thread.sleep(4000);
    }

    public static void click_humbuger() throws InterruptedException {
        driver.findElement(By.id(humbugermenu)).click();
        Thread.sleep(4000);

    }

    public static void click_logout() throws InterruptedException{
        driver.findElement(By.id(logoutbutton)).click();
        Thread.sleep(4000);
    }

    public static void clickonFilter() throws InterruptedException {
        driver.findElement(By.xpath(clickonFiltericon)).click();
        Thread.sleep(2000);

    }


    public static void firstfilterselect() throws InterruptedException {
        driver.findElement(By.xpath(selectFilteroption)).click();
        Thread.sleep(2000);

    }

    public static void verifyfilterapplicationandprices() throws InterruptedException {

        List<WebElement> priceElements = driver.findElements(By.className(priceFilter));

        // store prices in list
        List<Double> prices = new ArrayList<>();

        for (int i = 0; i < priceElements.size(); i++) {
            WebElement priceElement = priceElements.get(i);
            String priceText = priceElement.getText();

            double price = Double.parseDouble(priceText.replace("$", ""));
            prices.add(price);
        }
        // Check if prices are in ascending order
        for (int j = 0; j < prices.size() - 1; j++) {
            Assert.assertTrue("Prices are not in ascending order.", prices.get(j) <= prices.get(j + 1));
        }
    }
}

