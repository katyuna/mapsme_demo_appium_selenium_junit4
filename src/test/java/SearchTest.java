import io.qameta.allure.junit4.DisplayName;
import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import po.MainScreen;
import po.SearchBottomSheet;


import static org.junit.Assert.assertTrue;

public class SearchTest extends BaseTest {
    @Test
    @DisplayName("Open search category bottom sheet")
    @Description("Search categories bottom sheet opened " +
            "when clicked search button on the main screen bottom panel")
    public void testOpenSearch() {
        MainScreen mainScreen = new MainScreen(driver);
        SearchBottomSheet searchBottomSheet = new SearchBottomSheet(driver);
        mainScreen.clickSearchButton();
        boolean isSearchSheetDisplayed = searchBottomSheet.isSearchCategoriesConteiner();
        assertTrue("Error: search category bottom sheet doesn't displays", isSearchSheetDisplayed);
        searchBottomSheet.clickCloseButton();
    }
}
