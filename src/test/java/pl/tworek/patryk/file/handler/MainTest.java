package pl.tworek.patryk.file.handler;

import org.junit.Assert;
import org.junit.Test;
import java.io.File;

public class MainTest {

    @Test
    public void lineSplitTest() {
        String testString = "awekf,awekf";
        String[] expectedResult = {"awekf", "awekf"};
        String[] result = testString.split(",");

        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void addingValueTest() {
        String[] testValue = {"lakwef", "430"};
        int expectedResult = 0;
        int result = 430;

        if (testValue[0].equals("lakwef")) {
            expectedResult += Integer.valueOf(testValue[1]);
        }
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void resultSubtractionTest() {
        int buy = 264;
        int supply = 430;
        int result = supply - buy;
        int expectedResult = 166;

        Assert.assertEquals(expectedResult, result);
    }
}
