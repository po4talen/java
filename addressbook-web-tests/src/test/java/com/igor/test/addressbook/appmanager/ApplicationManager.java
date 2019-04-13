package com.igor.test.addressbook.appmanager;

import com.igor.test.addressbook.model.DataGroup;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.fail;

public class ApplicationManager {
  public WebDriver driver;
  public String baseUrl;
  public boolean acceptNextAlert = true;
  public StringBuffer verificationErrors = new StringBuffer();

  public void init() {
    //firefox driver      System.setProperty("webdriver.gecko.driver","C:\\JAVA Trainings\\Barancev\\geckodriver-v0.24.0-win64\\geckodriver.exe");
    System.setProperty("webdriver.gecko.driver", "C:\\JAVA Trainings\\Barancev\\geckodriver-v0.24.0-win64\\chromedriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://localhost/addressbook/group.php");
    login("admin", "secret");
  }

  public void login(String username, String password) {
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password:'])[1]/following::input[2]")).click();
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  private void click(By locator) {
    driver.findElement(locator).click();
  }

  //  public void fillGroupForm(DataGroup dataGroup) {
//    driver.findElement(By.name("group_name")).click();
//    driver.findElement(By.name("group_name")).clear();
//    driver.findElement(By.name("group_name")).sendKeys(dataGroup.getName());
//    driver.findElement(By.name("group_header")).click();
//    driver.findElement(By.name("group_header")).clear();
//    driver.findElement(By.name("group_header")).sendKeys(dataGroup.getHeader());
//    driver.findElement(By.name("group_footer")).click();
//    driver.findElement(By.name("group_footer")).clear();
//    driver.findElement(By.name("group_footer")).sendKeys(dataGroup.getFooter());
//  }
  public void fillGroupForm(DataGroup dataGroup) {
    type(By.name("group_name"), dataGroup.getName());
    type(By.name("group_header"), dataGroup.getHeader());
    type(By.name("group_footer"), dataGroup.getFooter());
  }

  private void type(By locator, String text) {
    click(locator);
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(text);
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void goToGroupPage(String groups) {
    click(By.linkText(groups));
  }

  public void stop() {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  public boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  public boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

  public void deleteGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }

  public void initGroupEditor() {
    click(By.name("edit"));
  }

  public void submitGroupEditor() {
    click(By.name("update"));
  }
}
