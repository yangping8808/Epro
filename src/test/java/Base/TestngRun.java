package Base;

import org.testng.TestNG;
import org.testng.collections.Lists;

import java.io.IOException;
import java.util.List;
import Base.Common.*;

public class TestngRun {

    public static void main(String[] args) {
        TestNG testng = new TestNG();
        List suites = Lists.newArrayList();
        suites.add("D:\\IDEA\\workspace\\Epro\\testng.xml");//path to xml..
        testng.setTestSuites(suites);
        testng.run();
//        //生成allure报告
//        String allureDir = Common.createDirDate("\\allure-results\\");
//        String cmdAllure = "allure generate " + allureDir + " -o " + allureDir + "\\html" + " --clean";
//        System.out.println(cmdAllure);
//        Common.exeCmd(cmdAllure);
    }




}
