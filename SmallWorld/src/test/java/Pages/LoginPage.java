package Pages;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utility.Tosetbrowser;

import static java.lang.Boolean.TRUE;

public class LoginPage extends Tosetbrowser {

    public static String uname = "user-name";
    public static String pass = "password";
    public static String login = "login-button";

    public static void login (String username,String Password) throws InterruptedException {
        driver.findElement(By.id(uname)).sendKeys(username);
        driver.findElement(By.id(pass)).sendKeys(Password);
        driver.findElement(By.id(login)).click();
        Thread.sleep(2000);


    }
    public static void verify_loginstatus() {
        String productPresent = String.valueOf(driver.getPageSource().contains("Products"));
        if (productPresent.equals(String.valueOf(TRUE))){
            Assertions.assertTrue(driver.getPageSource().contains("Products"));
            System.out.println("Login Successful");
        }
        else {
            String error = String.valueOf(driver.getPageSource().contains("Epic sadface: Username and password do not match any user in this service"));
            Assertions.assertTrue(Boolean.parseBoolean(error));
            System.out.println(error + "Login Failed");


        }
    }


}




