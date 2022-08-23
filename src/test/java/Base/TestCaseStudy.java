package Base;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCaseStudy {

    // 普通测试
    @Test
    public void testCase01() {
        System.out.println("this is testCase01");
    }


    //TestNG提供了2种传递参数的方式
    //方式 1，需要在  testng 里配置 入参 ，多数选择这种，方便管理
    @Test
    @Parameters("test02")
    public void testCase02(String test1){
        System.out.println("This is " + test1);
    }


    // 方式2，传入数据测试
    @DataProvider(name="user")
    public Object[][] Users(){
        return new Object[][]{
                {"yang01","ping01"},
                {"yang02", "ping02"},
                {"yang03","ping03"}
        };
    }
    @Test(dataProvider="user")
    public void testCase03(String userName, String password){
        System.out.println("Username: "+ userName + "----" + " Password: "+ password);
    }

    // 忽略测试
    @Test(enabled = false)
    public void testIgnore04(){
        System.out.println("This test case will ignore 04");
    }

    // 依赖测试
    @Test
    public void testRely05(){
        System.out.println("this is stestRely05");
    }
    @Test(dependsOnMethods = {"testRely05"})
    public void testMessage06(){
        System.out.println("this is testMessage06");
    }


}
