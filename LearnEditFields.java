package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//Mail Id
		driver.findElement(By.id("email")).sendKeys("harini31195@gmail.com");
		
		//To append
		WebElement webelement = driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input[@type='text']"));
		webelement.sendKeys("Harini");
		webelement.sendKeys(Keys.TAB);
		
		//To get default text entered
		System.out.println("Default text entered - " + driver.findElement(By.name("username")).getAttribute("value"));
		
		//To clear 
		driver.findElement(By.xpath("//input[@name='username' and @value='Clear me!!']")).clear();
		
		//To confirm the field is disabled
		if(!(driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input[@type='text']")).isEnabled()))
			System.out.println("Yes the field is disabled");
		
		//driver.close();
	}

}
