package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Filling using ID
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//submitting using className
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking the links using linkText
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//filling the name details using ID
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AMI");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Baskaran");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("hari");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software development");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Interested in java Programming");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("harini31195@gmail.com");
		
		//Select the dropdown list
		Select s= new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		s.selectByVisibleText("Indiana");
		
		//clicking submit using className
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		
		//clearing the element using ID
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//Filling the element by ID
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Skilled in C and Java programming");
		
		
		//clicking submit by name
		driver.findElement(By.name("submitButton")).click();
		
		//Displaying title
		System.out.println(driver.getTitle());
		
		//driver.close();
	}



}
