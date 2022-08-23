package Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class aa {

    public static void main(String[] args) throws MalformedURLException {
        System.out.println("androidDriver");

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "127.0.0.1:62025");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.youdao.calculator");
        // automationName:uiautomator2解决输入框输入不了数据
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appActivity", ".activities.MainActivity");
        // 3. 创建驱动： 传appium通讯地址，传 配置对象
        desiredCapabilities.setCapability("noReset", "False");
        AndroidDriver<WebElement> androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
//        AndroidDriver<AndroidElement> androidDriver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        System.out.println("========================");
//        Thread.sleep(10000);
        System.out.println(androidDriver);
    }
}
