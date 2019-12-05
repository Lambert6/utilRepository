package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class testThemeHuawei {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		long start = System.currentTimeMillis();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("udid", "8GP7N18531003669");
		capabilities.setCapability("appPackage", "com.huawei.android.thememanager");
		capabilities.setCapability("appActivity", ".HwThemeManagerActivity");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("unlockType", "password");
		capabilities.setCapability("unlockKey", "111111");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		Thread.sleep(2000);
		
		// driver.pressKey(new KeyEvent(AndroidKey.HOME));//按压home键
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView\r\n" + 
				"")).click();
		Thread.sleep(2000);
		driver.findElementById("android:id/search_src_text").click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(4000);

		driver.quit();

		System.out.println("标量时间：" + (System.currentTimeMillis() - start));
	}
}
