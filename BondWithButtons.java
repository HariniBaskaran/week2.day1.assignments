package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//Find position of button (x,y)
		System.out.println(driver.findElement(By.id("position")).getLocation());
		
		//Find button color
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		
		//Find the height and width
		System.out.println(driver.findElement(By.id("size")).getSize());
		
		//Click button to travel home page
		driver.findElement(By.id("home")).click();
		
		//driver.close();
	}

}
