package Base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class myAppium {

    public static AndroidDriver<WebElement> androidDriver;
//    public static void main(String[] args) throws MalformedURLException, InterruptedException {
//        startApp();
//        swipeLeft();
//        swipeLeft();
//        swipeLeft();
//        touchOnceLeft();
//        touchOnceLeft();
//        touchOnceLeft();
//        touchOnceLeft();
//        touchOnceLeft();
//        touchOnceLeft();
//        menu();
//
//    }

    @BeforeSuite
    public static void startApp() throws InterruptedException, MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "127.0.0.1:62025");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appPackage", "com.youdao.calculator");
        desiredCapabilities.setCapability("appActivity", ".activities.MainActivity");
        // automationName:uiautomator2解决输入框输入不了数据
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        //启动应用时是否清理缓存
        desiredCapabilities.setCapability("noReset", "True");
        //Appium在没有收到下一个命令时，默认超时时间是60s，超时后应用将会自动关闭。可自己设置时间，600/60=10分钟
        desiredCapabilities.setCapability("newCommandTimeout", 600);
        // 创建驱动： 传appium通讯地址，传 配置对象
        androidDriver = new AndroidDriver<WebElement>(
                new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        System.out.println("============ 启动成功 ============");
        Thread.sleep(10000);

    }

    @AfterSuite
    public static void quitApp() {
        androidDriver.quit();
    }

    // 获取 屏幕 宽
    public static int pointX() {
        return androidDriver.manage().window().getSize().getWidth();
    }

    // 获取 屏幕 高
    public static int pointY() {
        return androidDriver.manage().window().getSize().getHeight();
    }

    // 左滑
    @SuppressWarnings("rawtypes")
    public static void swipeLeft() throws InterruptedException {
        System.out.println("  swipeLeft  ");
        TouchAction touch = new TouchAction(androidDriver);
        PointOption startPoint = PointOption.point((int) (pointX() * 0.9), pointY() / 2);
        PointOption endPoint = PointOption.point((int) (pointX() * 0.1), pointY() / 2);
        WaitOptions wait = WaitOptions.waitOptions(Duration.ofSeconds(1));
        touch.press(startPoint).moveTo(endPoint).waitAction(wait).release().perform();
        TimeUnit.SECONDS.sleep(1);
    }

    // 单击  左键
    @SuppressWarnings("rawtypes")
    public static void touchOnceLeft() throws InterruptedException {
        System.out.println("  touchOnceLeft  ");
        TouchAction touch = new TouchAction(androidDriver);
        PointOption point = PointOption.point(pointX() / 2, pointY() / 2);
        touch.tap(point).release().perform();
        TimeUnit.SECONDS.sleep(1);
    }


    // 测试用例 ：菜单
    public static void menu() throws InterruptedException {
        System.out.println("  menu  ");
        androidDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='转到上一层级']")).click();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("点击左上角菜单");
        WebElement element0 = androidDriver.findElements(By.id("com.youdao.calculator:id/design_menu_item_text")).get(0);
        element0.click();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("计算");

        androidDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='转到上一层级']")).click();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("点击左上角菜单");
        WebElement element1 = androidDriver.findElements(By.id("com.youdao.calculator:id/design_menu_item_text")).get(1);
        element1.click();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("教程");
        System.out.println("  ok  ");
    }
}
