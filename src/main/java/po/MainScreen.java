/*package po;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class MainScreen {
    private AndroidDriver driver;

    public MainScreen() {
    }

   public MainScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(5)), this);
    }

    @AndroidFindBy(xpath = ".//android.view.View[@resource-id='bottom_bar_search']")
    private AndroidElement searchButton;

    //Click search button
    public void clickSearchButton() {
        this.searchButton.click();
    }


}*/
