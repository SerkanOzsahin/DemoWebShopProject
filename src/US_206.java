import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US_206 extends BaseDriver {
    @Test
    public void topMenuCheck() {
        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));

        List<String> tabMenuList = new ArrayList<>();
        Collections.addAll(tabMenuList, "Computers", "Electronics", "Apparel & Shoes", "Digital downloads", "Books", "Jewelry", "Gift Cards");

        for (int i = 0; i < tabMenuList.size(); i++) {
            WebElement tabMenuClick = driver.findElement(By.linkText(tabMenuList.get(i)));
            tabMenuClick.click();
            MyFunc.Wait(2);
        }

        tearDown();
    }
}
