package com.juaracoding.appiumrisna;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Risnapages.Calculator;

import java.net.MalformedURLException;
import java.net.URL;


public class TestCalculator {
    public static AndroidDriver<MobileElement> driver;
    public Calculator calculator;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_2_API_25");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @BeforeMethod
    public void pageFactory() {
        calculator = new Calculator(driver);
    }

    @Test(priority = 1)
    public void testKurang() {
        calculator.calPengurangan();
        System.out.println("Hasil = "+calculator.getTxtResult());
        Assert.assertEquals(calculator.getTxtResult(), "6");
    }

    @Test(priority = 2)
    public void testPerkalian() {
        calculator.calPerkalian();
        System.out.println("Hasil = "+calculator.getTxtResult());
        Assert.assertEquals(calculator.getTxtResult(), "16");
    }

    @Test(priority = 3)
    public void testPembagian() {
        calculator.calPembagian();
        System.out.println("Hasil = "+calculator.getTxtResult());
        Assert.assertEquals(calculator.getTxtResult(), "4");
    }

    @AfterClass
    public void closeApp() {
        driver.quit();
    }

}
