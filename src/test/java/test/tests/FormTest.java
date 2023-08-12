package test.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FormTest extends BaseTest{


    @Test
    public void formTest(){
        formPage.open();

        assertTrue(formPage.isPageOpen());

        formPage.create();
        formPage.submitForm();

        System.out.println("!");

    }

}
