import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/"); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement logIn=driver.findElement(By.xpath("//*[@id=\'username\']"));
		logIn.sendKeys("JAISRIRAM");
		WebElement password=driver.findElement(By.xpath("//*[@id=\'password\']"));
		password.sendKeys("Jaisriram5121");
		WebElement btnLogin=driver.findElement(By.xpath("//*[@id=\'login\']"));
		btnLogin.click();
		WebElement btnLocationDropdown=driver.findElement(By.xpath("//*[@id='location']"));
		Select sD = new Select(btnLocationDropdown);
		sD.selectByVisibleText("London");
		WebElement btnMonthDropdown=driver.findElement(By.xpath("//select[@id='hotels']"));
		Select sM = new Select(btnMonthDropdown);
		sM.selectByVisibleText("Hotel Creek");
		WebElement btnYearDropdown=driver.findElement(By.xpath("//select[@id='room_type']"));
		Select sY = new Select(btnYearDropdown);
		sY.selectByVisibleText("Super Deluxe");
		WebElement btnYDropdown=driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select sJ = new Select(btnYDropdown);
		sJ.selectByVisibleText("2 - Two");
		WebElement checkIn=driver.findElement(By.xpath("//*[@id='datepick_in']"));
		checkIn.sendKeys("20/06/2022");
		WebElement checkOut=driver.findElement(By.xpath("//*[@id='datepick_out']"));
		checkOut.sendKeys("22/06/2022");
		WebElement adultRoom=driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select sAR = new Select(adultRoom);
		sAR.selectByVisibleText("2 - Two");
		WebElement childRoom=driver.findElement(By.xpath("//select[@id='child_room']"));
		Select sCH = new Select(childRoom);
		sCH.selectByVisibleText("0 - None");
		WebElement btnSearch=driver.findElement(By.xpath("//*[@id='Submit']"));
		btnSearch.click();
		WebElement btnSelect=driver.findElement(By.xpath("//*[@id='radiobutton_0']"));
		btnSelect.click();
		WebElement btnContinue=driver.findElement(By.xpath("//*[@id='continue']"));
		btnContinue.click();
		WebElement firstName=driver.findElement(By.xpath("//*[@id='first_name']"));
		firstName.sendKeys("JAISRIRAM");
		WebElement lastName=driver.findElement(By.xpath("//*[@id='last_name']"));
		lastName.sendKeys("D");
		WebElement address=driver.findElement(By.xpath("//*[@id='address']"));
		address.sendKeys("NO 15, RAMAR QUATRES, KALAMBUR, POLUR TALUK, TIRUVANNAMALAI DIST-606903");
		WebElement ccNumber=driver.findElement(By.xpath("//*[@id='cc_num']"));
		ccNumber.sendKeys("7862019281905121");
		WebElement ccType=driver.findElement(By.xpath("//*[@id='cc_type']"));
		Select sCCT = new Select(ccType);
		sCCT.selectByVisibleText("VISA");
		WebElement btnexpMonth=driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select sEM = new Select(btnexpMonth);
		sEM.selectByVisibleText("May");
		WebElement btnexpYear=driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select sEY = new Select(btnexpYear);
		sEY.selectByVisibleText("2022");
		WebElement cvv=driver.findElement(By.xpath("//*[@id='cc_cvv']"));
		cvv.sendKeys("512");
		WebElement bookNow=driver.findElement(By.xpath("//*[@id='book_now']"));
		bookNow.click();
//		driver.get("https://adactinhotelapp.com/BookingConfirm.php");
		File frstSrc = driver.getScreenshotAs(OutputType.FILE);
		File destSrc = new File ("./ScreenShot/img.png");
		FileHandler.copy(frstSrc, destSrc);
		
		//WebElement orderno=driver.findElementByLinkText();
		
	//	System.out.println("order no " +orderno.getText());
//		

	}

}
