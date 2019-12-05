package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.mobile.NetworkConnection.ConnectionType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class testThemeOPPO {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		long start = System.currentTimeMillis();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.1.0");
		capabilities.setCapability("udid", "b539000");
		capabilities.setCapability("appPackage", "com.nearme.themespace");
		capabilities.setCapability("appActivity", ".activities.ThemeActivity");
		capabilities.setCapability("noReset", true);
//		capabilities.setCapability("unlockType", "password");
//		capabilities.setCapability("unlockKey", "111111");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//driver.setNetworkSpeed(networkSpeed);
		
		
		Thread.sleep(4000);
		

		driver.quit();
		
		System.out.println("标量时间："+(System.currentTimeMillis() - start));
	}
}
