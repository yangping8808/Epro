package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Base.myAppium.androidDriver;

public class test01Jisuan {
    //    public static void main(String[] args) throws MalformedURLException, InterruptedException {
////        myAppium.startApp();
//        jisuan();
//    }
    @Test
    public void test_jisuan() throws InterruptedException {
        System.out.println("  menu  ");
        androidDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='转到上一层级']")).click();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("点击左上角菜单");
        WebElement element0 = androidDriver.findElements(By.id("com.youdao.calculator:id/design_menu_item_text")).get(0);
        element0.click();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("计算");
        androidDriver.findElementsById("com.youdao.calculator:id/iv_icon").get(12).click();
        System.out.println("5");
        androidDriver.findElementsById("com.youdao.calculator:id/iv_icon").get(13).click();
        System.out.println("6");
        TimeUnit.SECONDS.sleep(5);
    }
}
