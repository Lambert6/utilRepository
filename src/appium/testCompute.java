package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class testCompute {
	/**
	 * 需要在目标服务器安装appium-server
	 * @param args
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		long start = System.currentTimeMillis();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "8.1.0");
		capabilities.setCapability("udid", "b539000");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", ".Calculator");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.findElementById("android:id/button1").click();
		driver.findElementById("com.android.calculator2:id/digit1").click();
		driver.findElementById("com.android.calculator2:id/digit5").click();
		driver.findElementById("com.android.calculator2:id/digit9").click();
		driver.findElementById("com.android.calculator2:id/del").click();
		driver.findElementById("com.android.calculator2:id/plus").click();
		driver.findElementById("com.android.calculator2:id/digit7").click();
		driver.findElementById("com.android.calculator2:id/digit8").click();
		driver.findElementById("com.android.calculator2:id/equal").click();
		Thread.sleep(300);

		String result = driver.findElementById("com.android.calculator2:id/edittext").getText();
		System.out.println(result);

		driver.pressKey(new KeyEvent(AndroidKey.HOME));

		driver.quit();
		System.out.println("标量时间："+(System.currentTimeMillis() - start));

	}
}
