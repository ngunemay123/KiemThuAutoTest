package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        //Start the session
        WebDriver driver = new ChromeDriver();

        //Take action on browser
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        //Request browser information
//            driver.getTitle();

        //Establish waiting strategy
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        System.out.println(driver.getTitle());

        //Find an element
        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        //Take action on element
        textBox.sendKeys("Selenium");
        submitButton.click();

        //Request element information
        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        //End the session
        driver.quit();
        System.out.println("hello");
    }
}