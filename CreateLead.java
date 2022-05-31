package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Fill username and password using ID
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Submit using className
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking links using linkText
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Name details using ID 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AMI");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Baskaran");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("hari");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software development");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Interested in java Programming");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("harini31195@gmail.com");
		
		//Selecting dropdown using Visible text
		Select s= new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		s.selectByVisibleText("Indiana");
		
		//Clicking submit by name
		driver.findElement(By.name("submitButton")).click();
		
		//Displaying Title
		System.out.println(driver.getTitle());
		
		//driver.close();
	}

}
