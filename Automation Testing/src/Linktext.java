package org.openqa.selenium.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Linktext {
 public static void main(String[]args){
  System.setProperty("webdriver.chrome.driver","C:\\Users\\ANITHA\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
  WebDriver  driver = new ChromeDriver();
  driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  driver.findElement(By.xpath("//*[contains(@id,'inp')]")).sendKeys("anitha");
  driver.findElement(By.name("inputPassword")).sendKeys("2352");
  //driver.findElement(By.className("submit")).click();
  //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
  //String text =driver.findElement(By.className("error")).getText();
  //System.out.println(text);
  driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
  //driver.close();
  driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("Email");
  driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Anitha");
  driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("3434567890");
  driver.findElement(By.xpath("//*[contains(@class,\"reset\") and @fdprocessedid=\"r8mv58\"]//following::button[1]")).click();
 }
}




