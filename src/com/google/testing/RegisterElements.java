package com.google.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RegisterElements {
	
	
  private static WebElement element = null;
  
  public static WebElement RegisterClick(WebDriver driver)
  {
	  element = driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	  return element;
  }
  
  public static WebElement FirstName (WebDriver driver)
  {
	  element = driver.findElement(By.name("firstName"));
		  return element;
  }
  
  public static WebElement LastName (WebDriver driver)
  {
	  element = driver.findElement(By.name("lastName"));
	  return element;
  }
  
  public static WebElement Phone (WebDriver driver)
  {
	  element = driver.findElement(By.name("phone"));
	  return element;
  }
  
  public static WebElement Email (WebDriver driver)
  {
	  element = driver.findElement(By.id("userName"));
	  return element;
  }
  
  public static WebElement Address1 (WebDriver driver)
  {
	  element = driver.findElement(By.name("address1"));
	  return element;
  }
  
  public static WebElement City (WebDriver driver)
  {
	  element = driver.findElement(By.name("city"));
	  return element;
  }
  
  public static WebElement State (WebDriver driver)
  {
	  element = driver.findElement(By.name("state"));
	  return element;
  }
  
  public static WebElement PostalCode (WebDriver driver)
  {
	  element = driver.findElement(By.name("postalCode"));
	  return element;
  }
  
  public static WebElement Country (WebDriver driver)
  {
	  element = driver.findElement(By.name("country"));
	  return element;
  }
  
  public static WebElement UserName (WebDriver driver)
  {
	  element = driver.findElement(By.id("email"));
	  return element;
  }
  
  public static WebElement Password (WebDriver driver)
  {
	  element = driver.findElement(By.name("password"));
	  return element;
  }
  
  public static WebElement ConfirmPassword (WebDriver driver)
  {
	  element = driver.findElement(By.name("confirmPassword"));
	  return element;
  }
  
  public static WebElement Register (WebDriver driver)
  {
	  element = driver.findElement(By.name("register"));
	  return element;
  }
  
  public static WebElement validation (WebDriver driver)
  {
	  element = driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b"));
	  return element;
  }
}

