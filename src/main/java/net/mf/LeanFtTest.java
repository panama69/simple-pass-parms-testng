package net.mf;

import org.testng.annotations.*;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    @BeforeClass
    public void beforeClass() throws Exception {
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    }

    private void printMethodName (Object o){
        System.out.println("Method: "+ o.getClass().getEnclosingMethod().getName());
    }

    @Test
    public void testDirectValue() throws GeneralLeanFtException {
        printMethodName(new Object(){});
        System.out.println(System.getProperty("corndog"));

    }

    @Parameters("corndog")
    @Test
    public void testPassedValue (String environment) throws GeneralLeanFtException{
        printMethodName(new Object(){});
        System.out.println(environment);
    }
}