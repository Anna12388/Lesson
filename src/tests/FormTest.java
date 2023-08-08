package tests;

import org.testng.annotations.Test;
import pages.FormPage;

import static org.testng.Assert.assertTrue;

public class FormTest extends BaseTest{


    @Test
    public void formTest(){
        formPage.open();

        assertTrue(formPage.isPageOpen());

    }

}
