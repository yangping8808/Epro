package Base;

import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static Base.myAppium.androidDriver;

public class Test_02fankui {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        myAppium.startApp();
        fankui();
    }

    public static void fankui() throws InterruptedException {

        androidDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='转到上一层级']")).click();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("点击左上角菜单");
        androidDriver.findElements(By.id("com.youdao.calculator:id/design_menu_item_text")).get(3).click();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("反馈");
        androidDriver.findElementById("com.youdao.calculator:id/umeng_fb_reply_content").sendKeys("asdf问题反馈啊123");
        System.out.println("输入问题");
        androidDriver.findElementById("com.youdao.calculator:id/umeng_fb_send").click();
        System.out.println("发送");
        TimeUnit.SECONDS.sleep(5);
    }
}
