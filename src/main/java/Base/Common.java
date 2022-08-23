package Base;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Common {

    public static void main(String[] args) throws Exception {
        System.out.println("=========  main start ===============");
        randomInt();
        randomIntStr(10);
        System.out.println("========= main end ===============");
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


    public static void createDir() {

    }


}


