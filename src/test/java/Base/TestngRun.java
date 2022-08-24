package Base;

import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;

public class TestngRun {
    public static void main(String[] args) {
        TestNG testng = new TestNG();
        List suites = Lists.newArrayList();
        suites.add("D:\\IDEA\\workspace\\Epro\\testng.xml");//path to xml..
        testng.setTestSuites(suites);
        testng.run();
    }
}
