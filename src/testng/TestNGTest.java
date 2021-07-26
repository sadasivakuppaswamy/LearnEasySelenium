package testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest");
    }

    @Test(priority=2,enabled = false)
    public void test1(){
        System.out.println("test1");

    }
    @Test(priority=1)
    public void test2(){
        System.out.println("test2");

    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }


}
