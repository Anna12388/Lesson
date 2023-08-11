package test.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Radiobutton {
    WebDriver driver;
    String radiolocator = "//input[@type='radio' and @value='%s']/..";
    String value;

    public Radiobutton(WebDriver driver, String value) {
        this.driver = driver;
        this.value = value;
    }
    public void selectRadiobutton(){
        driver.findElement(By.xpath(String.format(radiolocator,this.value))).click();
    }
}
