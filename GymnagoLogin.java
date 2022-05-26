package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GymnagoLogin {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://skoolgo.pixelmindit.com:8000/#/");
        driver.manage().window().maximize();

        driver.findElement(By.id("userName")).sendKeys("tanupriya74@gmail.com");
        driver.findElement(By.id("password")).sendKeys("tanu@123");
        driver.findElement(By.xpath("//button[starts-with(@class,'btn btn-primary btn-block mt-1 font-weight-bold py-3')]")).click();

    }
}

