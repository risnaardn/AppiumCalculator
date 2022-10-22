package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class Calculator {
    public AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.android.calculator2:id/digit_8")
    private AndroidElement btnDelapan;

    @AndroidFindBy(id = "com.android.calculator2:id/op_sub")
    private AndroidElement btnPengurangan;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_2")
    private AndroidElement btnDua;

    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    private AndroidElement btnSamaDengan;

    @AndroidFindBy(id = "com.android.calculator2:id/result")
    private AndroidElement hasil;

    @AndroidFindBy(id = "com.android.calculator2:id/op_mul")
    private AndroidElement btnPerkalian;

    @AndroidFindBy(id = "com.android.calculator2:id/op_div")
    private AndroidElement btnPembagian;





    //Method
    public void calPengurangan() {
        btnDelapan.click();
        btnPengurangan.click();
        btnDua.click();
        btnSamaDengan.click();
    }

    public void calPerkalian(){
        btnDelapan.click();
        btnPerkalian.click();
        btnDua.click();
        btnSamaDengan.click();
    }

    public void calPembagian(){
        btnDelapan.click();
        btnPembagian.click();
        btnDua.click();
        btnSamaDengan.click();
    }

    public String getTxtResult() {
        return hasil.getText();
    }


}
