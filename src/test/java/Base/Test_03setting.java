package Base;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static Base.myAppium.androidDriver;

public class Test_03setting {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        myAppium.startApp();
        setting();
    }

    public static void setting() throws InterruptedException {

        androidDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='转到上一层级']")).click();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("点击左上角菜单");
        androidDriver.findElements(By.id("com.youdao.calculator:id/design_menu_item_text")).get(2).click();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("设置");
        androidDriver.findElementsById("com.youdao.calculator:id/tv_pref_content").get(0).click();
        System.out.println("字体大小");
        TimeUnit.SECONDS.sleep(1);
        androidDriver.findElementByAndroidUIAutomator("new UiSelector().text(\"小\")").click();
        androidDriver.findElementByXPath("//*[@text=\"小\"]").click();
        System.out.println("小");
        androidDriver.findElementById("com.youdao.calculator:id/btn_confirm").click();
        System.out.println("确定");
        //按系统back键、home键
        androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
        System.out.println("按back键");
        TimeUnit.SECONDS.sleep(5);

    }

}
