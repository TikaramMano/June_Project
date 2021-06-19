package com.BaseClass.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass_Selenium {

	public static WebDriver driver;// --->null

	// 1.Browser Launch
	public static WebDriver browserLaunch(String browser) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Madhan\\eclipse-workspace\\Adactin_Project\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase("firefox")) {

				System.setProperty("web", "path");
				driver = new FirefoxDriver();

			} else {
				System.out.println("Invalid Browser");
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	// 2.close
	public static void close() {
		driver.close();

	}

	// 3.quit---> close the entire window
	public static void quit() {

		driver.quit();

	}

	// 4. Navigate To
	public static void to(String URL) {

		driver.navigate().to(URL);
	}

	// 5. NavigateBack
	public static void back() {

		driver.navigate().back();

	}

	// 6. Navigate Forward
	public static void forward() {

		driver.navigate().forward();
	}

	// 7.Navigate Refresh
	public static void refresh() {

		driver.navigate().refresh();
	}

	// 8. Get method
	public static void getUrl(String URL) {

		driver.get(URL);

	}

	// 9. Alert
	// simple alert
	public static void simpleAlert() {

		Alert simple = driver.switchTo().alert();
		simple.accept();
	}

	// confirm Alert
	public static void confirm() {
		Alert confirm = driver.switchTo().alert();
		confirm.accept();

	}

	// prompt Alert
	public static void prompt(String str) {

		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys(str);
		prompt.accept();
	}
	// 10.Actions
	// MoveToElement
	public static void mouseOver(WebElement element) {

		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	// Actions--->Click
	public static void actClick(WebElement element) {

		Actions ac = new Actions(driver);
		ac.click(element).perform();

	}

	// Actions-->ContextCLick
	public static void contextClick(WebElement element) {

		Actions ac = new Actions(driver);
		ac.contextClick(element).perform();

	}

	// Actions--->DoubleClick
	public static void doubleclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();

	}

	// 11.Frames by index
	public static void frameIndex(int a) {

		driver.switchTo().frame(a);

	}

	// frames by WebElement
	public static void frameByWebElement(WebElement element) {
		driver.switchTo().frame(element);

	}

	// Frame-->Default Content
	public static void defaultContent() {

		driver.switchTo().defaultContent();

	}

	// 12.Robot Class
	public static void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// 13. WindowsHandles
	public static void windows(String value) {

		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}
		String actualId=value;
		for (String id : allId) {
			if (driver.switchTo().window(id).getTitle().equals(actualId)) {
				break;
			}
		}
	}

	// 14.select
	public static void dropDown(WebElement element, String value, String i) {
		Select s = new Select(element);
		if (value.equals("index")) {
			s.selectByIndex(Integer.parseInt(i));

		} else if (value.equals("value")) {
			s.selectByValue(i);
		} else if (value.equals("text")) {
			s.selectByVisibleText(i);
		}

	}
	//15.CHeckBox
	public static void checkBox(WebElement element) {

		element.click();
		
	}


	// 16. isEnabled
	public static void enabled(WebElement element) {

		boolean enabled = element.isEnabled();
		System.out.println("Is Enabled: " + enabled);
	}

	// 17. isDisplayed
	public static void displayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		System.out.println("Is Displayed: " + displayed);

	}

	// 18. isSelected
	public static void selected(WebElement element) {

		boolean selected = element.isSelected();
		System.out.println("Is Selected :" + selected);

	}

	// 19. getOptions
	public static void getOptions(WebElement element) {

		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement value : options) {
			System.out.println(value.getText());
		}

	}

	// 20.getTitle
	public static void title() {

		String title = driver.getTitle();
		System.out.println(title);

	}

	// 21.getCurrentUrl
	public static void currentUrl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	// 22.getText
	public static void getText(WebElement element) {

		String text = element.getText();
		System.out.println(text);
	}

	// 23. GetAttribute Value
	public static void attributeValue(WebElement element) {

		String value = element.getAttribute("value");
		System.out.println("Attribute Value:" + value);

	}

	// Attribute Name
	public static void attributeName(WebElement element) {

		String name = element.getAttribute("name");
		System.out.println("Attribute Name: " + name);
	}

	// 24. Implicitwait
	public static void implicitWait() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// Explicit Wait
	public static void explicitWait(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	// 25.TakeScreenShot
	public static void screenShot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}

	// 26.ScrollUp
	public static void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].scrollIntoView;", element);

	}

	// scrollDown
	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeAsyncScript("arguments[0].scrollIntoView;", element);
		js.executeScript("window.scrollBy(0,400)");


	}

	// 27.SendKeys
	public static void inputValues(WebElement element, String values) {

		element.sendKeys(values);
	}

	// 28. getFirstSelectedOptions
	public static void firstOptions(WebElement element) {

		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("First SelctedOption is: "+firstSelectedOption.getText());

	}

	// 29. getAllSelectedOptions
	public static void allSelected(WebElement element, int j, int m,int l) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("Size of the MultipleDropDown: " + size);
		for (int i = 0; i < size; i++) {
			if (i == j || i == m | i == l) {
				s.selectByIndex(i);

			}

		}
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}

	}

	// Clear--->
	public static void clear(WebElement element) {

		element.clear();
	}

	// 30.isMultiple
	public static void multiple(WebElement element) {

		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println("Is Multiple: " + multiple);

	}

	// 31. click
	public static void clickOnButton(WebElement element) {

		element.click();

	}

}
