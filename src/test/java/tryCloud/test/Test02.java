package tryCloud.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test02 {

    @Test(priority = 1)
    public void testPractice(){
        System.out.println("Test practice class is executing");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 2)
    public void testPractice01(){
        System.out.println("Second practice is executing");
    }


}
