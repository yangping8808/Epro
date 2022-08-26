package Base;

import org.apache.commons.lang3.RandomStringUtils;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Common {

    public static void main(String[] args) throws Exception {
        System.out.println("=========  main start ===============");
        randomInt();
        randomIntStr(10);
        currentDate();
        createDirDate("\\allure-results\\");
        exeCmd("ipconfig");
    }

    public static void randomInt() {
        Random rInt = new Random();
        int num = rInt.nextInt(100);   // 生成随机2位数，0-100（不包括100）
        System.out.println(num);
    }

    public static void randomIntStr(int num) {
        String str = RandomStringUtils.randomAlphanumeric(num);   // 随机字符串整数
        System.out.println(str);
    }

    public static @NotNull String currentDate(){
        Date date = new Date();    // 获取当前时间
//        LocalDateTime dateTime = LocalDateTime.now(); // get the current date and time
        SimpleDateFormat formatter = new SimpleDateFormat("[yyyy-MM-dd-HH-mm-ss]");
        return formatter.format(date);
    }

    public static String createDirDate(String mypath) {
        String relatePath = System.getProperty("user.dir");   // D:\IDEA\workspace\Epro   项目根目录
        String directoryPath = relatePath + mypath + currentDate();
        File file = new File(directoryPath);
        if (!file.exists()) {    //文件夹不存在
            if (file.mkdirs()) {
                System.out.println("创建文件夹 " + directoryPath + " 成功");
            } else {
                System.out.println("创建文件夹 " + directoryPath + " 失败");
            }
        }
        return directoryPath;
    }

    // Java调用 dos窗口命令
    public static void exeCmd(String cmd) {
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String content = br.readLine();
            while (content != null) {
                System.out.println(content);
                content = br.readLine();
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}


