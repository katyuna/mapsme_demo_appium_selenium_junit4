package po;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchBottomSheet {
    private AndroidDriver driver;

    public SearchBottomSheet() {
    }

    public SearchBottomSheet(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Search categories sheet header
    @AndroidFindBy(xpath = ".//android.view.View[@resource-id='search_categories_container']")
    private WebElement searchCategoriesConteiner;

    //[Х]
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.Button")
    private WebElement closeSearchCategoriesSheetButton;


    //Is Search categories sheet header displayed
    public boolean isSearchCategoriesConteiner() {
        return searchCategoriesConteiner.isDisplayed();
    }

    //Close Search categories sheet by click [x]
    public void clickCloseButton() {
        this.closeSearchCategoriesSheetButton.click();
    }
}
