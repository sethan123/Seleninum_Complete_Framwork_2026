package com.demoqa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExample {
    private static final Logger logger = LoggerFactory.getLogger(TestExample.class);

    @BeforeMethod
    void setup() {
        System.out.println("It is process");
        logger.info("Setup method executed");
    }

    @Test
    void test1() {
        System.out.println("Void Test");
        logger.info("Test1 executed");
    }

    @Test
    void test12() {
        System.out.println("Void Test");
        logger.info("Test12 executed");
    }

    @AfterMethod
    void after() {
        System.out.println("After Method");
        logger.info("After method executed");
    }


    @DataProvider(name = "testData")
    public Object[][] createData() {
        return new Object[][]{
                {"data1"},
                {"data2"},
                {"data3"}
        };
    }

    @Test(dataProvider = "testData")
    void testWithDataProvider(String data) {
        System.out.println("Test with data: " + data);
        logger.info("Test with data executed: {}", data);

    }
}
