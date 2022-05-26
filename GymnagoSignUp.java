package org.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GymnagoSignUp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skoolgo.pixelmindit.com:8000/#/sign-up");
        driver.findElement(By.id("fullName")).sendKeys("Tanu Priya");
       driver.findElement(By.id("email")).sendKeys("tanu.priya2@gmail.com");
        driver.findElement(By.id("mobile")).sendKeys("9784826642");
        //driver.findElement(By.name("personalId")).sendKeys("J8369845");
        driver.findElement(By.xpath("(//*[@id=\"root\"]/div[1]/div[1]/div[2]/form/div/div[1]/div/div[7]/div/div/div/div/div/input]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/form/div/div[1]/div/div[8]/div/div/span")).click();

        driver.findElement(By.id("nationality")).sendKeys("India");
        driver.findElement(By.id("gender")).sendKeys("Female");
        driver.findElement(By.id("height")).sendKeys("5'5");
        driver.findElement(By.id("weight")).sendKeys("75");
        driver.findElement(By.id("emergencyNumber")).sendKeys("9784286642");
        driver.findElement(By.id("password")).sendKeys("test@123");
        driver.findElement(By.id("confirmPassword")).sendKeys("test@123");
        driver.findElement(By.id("Accept")).sendKeys("I accept the terms and conditions.");
        driver.findElement(By.id("create-account")).click();


    }
}


