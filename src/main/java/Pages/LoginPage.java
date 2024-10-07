package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseTest {

    @Step("Mail Adresi Doldurulur")
    public LoginPage fillMail(String text) {
        WebElement element = driver.findElement(By.id("login-email"));
        element.clear();
        element.sendKeys(text);
        screenshot();
        return this;
    }

    @Step("Şifre Alanı Doldurulur")
    public LoginPage fillPassword(String text) {
        WebElement element = driver.findElement(By.name("login-password"));
        element.clear();
        element.sendKeys(text);
        return this;
    }

    @Step("Login Butonu Tıklanır")
    public LoginPage clickLoginButton(){
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).submit();
        screenshot();
        return this;
    }

    @Step("Hata Mesajı Alınır")
    public String getErrorMessage(){
        String value = driver.findElement(By.cssSelector("[class='message']")).getText();
        return value;
    }

}




