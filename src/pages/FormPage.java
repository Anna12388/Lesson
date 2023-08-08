package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage extends BasePage{

    public static final By STUDENT_FORM_TITLE = By.xpath("//div[@class = 'practice-form-wrapper']//h5");



    public FormPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(URL);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(STUDENT_FORM_TITLE);
    }
}
