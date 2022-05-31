package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListBox {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//Select training program using index
		Select s = new Select(driver.findElement(By.id("dropdown1")));
		s.selectByIndex(1);
		
		//Select training program using Text
		s = new Select(driver.findElement(By.name("dropdown2")));
		s.selectByVisibleText("Selenium");
		
		//Select training program using Value
		s = new Select(driver.findElement(By.id("dropdown3")));
		s.selectByValue("1");
		
		//Number of dropdown options
		s= new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
		s.selectByValue("1");
		System.out.println(s.getOptions().size());
		  
		//Sendkeys to select the option
		driver.findElement(By.xpath("//select[@class='dropdown']/following::select")).sendKeys("Selenium");
		
		//Selecting multiple options
		s = new Select(driver.findElement(By.xpath("//div[@class='example']/select[@multiple]"))); 
		s.selectByIndex(1); 
		s.selectByIndex(3);
		
		//driver.close();
	}

}
