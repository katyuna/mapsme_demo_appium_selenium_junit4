import io.qameta.allure.junit4.DisplayName;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.springframework.core.annotation.Order;

import static org.junit.Assert.assertTrue;

public class SearchTest extends BaseTest{
    @Test
    @Order(1)
    @DisplayName("Open search category bottom sheet")
    @Description("Search categories bottom sheet opened " +
            "when clicked search button on the main screen bottom panel")
    public void testOpenSearch(){
    driver.findElement(By.xpath(".//android.view.View[@resource-id='bottom_bar_search']")).click();
    boolean isSearchSheetDisplayed = driver.findElement(By.xpath(".//android.view.View[@resource-id='search_categories_container']")).isDisplayed();
    assertTrue("Error: search category bottom sheet doesn't displays", isSearchSheetDisplayed);
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.Button"));
    }
}
