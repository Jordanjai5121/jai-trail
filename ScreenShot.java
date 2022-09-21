import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot extends Adactin {
	public static void main(String[] args)throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/BookingConfirm.php");
		File firstsrc = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./target/img.png");
		FileHandler.copy(firstsrc, dest);
		driver.quit();
	}

}
