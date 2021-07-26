package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest1 {
    @Test(priority=2)
    public void test1(){
        Assert.assertEquals("sadasiva","sadasiva");

    }
    @Test(priority=1)
    public void test2(){
        Assert.assertEquals("sadasiva","sadasiva");

    }

}
