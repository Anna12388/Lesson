package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import test.elements.Calendar;
import test.elements.Input;
import test.elements.Radiobutton;

public class FormPage extends BasePage{

    public static final By STUDENT_FORM_TITLE = By.xpath("//div[@class = 'practice-form-wrapper']//h5");

    public FormPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(URL);
    }
    public void create(){
        new Input(driver, "firstName").write("testName");
        new Radiobutton(driver, "Male").selectRadiobutton();
        new Calendar(driver).selectDate("May","2020","10");

    }

    @Override
    public boolean isPageOpen() {
        return isExist(STUDENT_FORM_TITLE);
    }
}
