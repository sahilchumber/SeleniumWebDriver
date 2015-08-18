package com.google.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class GTest {
	public static WebDriver driver = null;
	
	@BeforeClass
	public void geturl()
	{
		driver  = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}
	
  @Test
  public void Registration() {
	  
	  RegisterElements.RegisterClick(driver).click();
	  RegisterElements.FirstName(driver).sendKeys("Sahil");
	  RegisterElements.LastName(driver).sendKeys("Chumber");
	  RegisterElements.Phone(driver).sendKeys("510-557-0000");
	  RegisterElements.UserName(driver).sendKeys("sahilc");
	  RegisterElements.Address1(driver).sendKeys("3 Magnolia Street");
	  RegisterElements.City(driver).sendKeys("Newark");
	  RegisterElements.State(driver).sendKeys("California");
	  RegisterElements.PostalCode(driver).sendKeys("94560");
	  RegisterElements.Email(driver).sendKeys("sahilchumber24@gmail.com");
	  RegisterElements.Password(driver).sendKeys("Sahil12345");
	  RegisterElements.ConfirmPassword(driver).sendKeys("Sahil12345");
	  RegisterElements.Register(driver).click();
	  
	  String t = RegisterElements.validation(driver).getText();
	  
	  Assert.assertEquals(t, " Note: Your user name is sahilc");
	  
	  
	  
//	  driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
//	  driver.findElement(By.name("firstName")).sendKeys("Sahil");
//	  driver.findElement(By.name("lastName")).sendKeys("Chumber");
//	  driver.findElement(By.name("phone")).sendKeys("510-557-0000");
//	  driver.findElement(By.id("userName")).sendKeys("sahilchumber24@gmail.com");
//	  driver.findElement(By.name("address1")).sendKeys("3 Magnolia Street");
//	  driver.findElement(By.name("city")).sendKeys("Newark");
//	  driver.findElement(By.name("state")).sendKeys("California");
//	  driver.findElement(By.name("postalCode")).sendKeys("94560");
//	  //driver.findElement(By.name("country")).getCssValue("Canada");
//	  driver.findElement(By.id("email")).sendKeys("sahilc");
//	  driver.findElement(By.name("password")).sendKeys("Sahil12345");
//	  driver.findElement(By.name("confirmPassword")).sendKeys("Sahil12345");
//	  driver.findElement(By.name("register")).click();
//	  
//	  String t = driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
//	  System.out.println(t);
//	  
//	  Assert.assertEquals(t, "Note: Your user name isg sahilc.");
	  //"Note: Your user name is reretretret."
  }
}
