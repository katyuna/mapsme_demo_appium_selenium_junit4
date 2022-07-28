import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected static URL url;
    protected static DesiredCapabilities capabilities;
    protected AndroidDriver driver;

    @BeforeClass
    public static void before() throws MalformedURLException {
        url = new URL("http://127.0.0.1:4723/wd/hub");
        capabilities = new DesiredCapabilities();
        //Platform
        capabilities.setCapability("platformName", "Android");
        //Do not stop app, do not clear app data, and do not uninstall apk.
        capabilities.setCapability("noReset", true);
        //Device
        capabilities.setCapability("deviceName", "Pixel 2 API 31");
        capabilities.setCapability("udid", "emulator-5554");
        //app
        capabilities.setCapability("appPackage", "com.mapswithme.maps.pro.kode.debug");
        capabilities.setCapability("appActivity", "com.mapswithme.maps.MainActivity");
    }
}
