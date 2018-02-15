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
        System.out.println("\r\nMethod: "+ o.getClass().getEnclosingMethod().getName());
    }

    @DataProvider(name = "Authentications")
    public static Object[][] credentials (){
        return new Object[][] {
                {"user1", "password1"},
                {"user2", "password2"},
                {"user3", "password3"},
                {"user4", "password4"}
        };
    }
    @Test
    public void testDirectValue() throws GeneralLeanFtException {
        printMethodName(new Object(){});
        System.out.println("corndog is: "+System.getProperty("corndog"));
        System.out.println("Current User: "+System.getProperty("currentUser"));

    }

    @Parameters("corndog")
    @Test
    public void testPassedValue (String myMessage) throws GeneralLeanFtException{
        printMethodName(new Object(){});
        System.out.println(myMessage);
    }

    @Test(dataProvider = "Authentications")
    public void mytest (String userName, String userPwd){
        printMethodName(new Object(){});
        System.out.println("Name: "+ userName+ " Password: "+userPwd);
    }

}