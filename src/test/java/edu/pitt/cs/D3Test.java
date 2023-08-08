package edu.pitt.cs;

import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.get("https://cs1632.appspot.com/ ");
    for (int i = 1; i <= 3; i++) {
      driver.manage().addCookie(new Cookie(Integer.toString(i),"false"));
    }
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  /* 
  @Test
  public void tEST1LINKS() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    vars.put("target", js.executeScript("var hrefText = document.querySelectorAll(\'[href=\"/reset\"]\'); console.log(hrefText[0].text); return hrefText[0].text;"));
    assertEquals(vars.get("target").toString(), "Reset");
  }*/
  /* 
  @Test
  public void dEFECT3FUNCFEED() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com/feed-a-cat");
    vars.put("submittedWasEven", js.executeScript("let button = document.getElementById(\"catnips\"); console.log(button); button.setAttribute(\"value\", -3);  console.log(button.value); let buttons = document.getElementsByClassName(\"btn btn-primary\"); const ht = new Map(); let i; for (i = 0; i < buttons.length; i++){ ht.set(buttons[i].textContent, buttons[i]); } ht.get(\"Feed\").onclick(); let ret = parseInt(button.value) % 3 == 0;  return ret;"));
    vars.put("catnipsRes", js.executeScript("return document.getElementById(\"feedResult\").textContent;"));
    assertEquals(vars.get("catnipsRes").toString(), "Failure");
  }
  @Test
  public void dEFECT2FUNRENT() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com/rent-a-cat");
    vars.put("formValue", js.executeScript("let buttons = document.getElementsByClassName(\"btn btn-primary\"); const ht = new Map(); ht.set(buttons[0].textContent, buttons[0]); ht.set(buttons[1].textContent, buttons[1]); let rentForm = document.getElementById(\'rentID\'); rentForm.setAttribute(\"value\", Number.MIN_VALUE + 1); ht.get(\"Rent\").onclick();  return rentForm.value;"));
    vars.put("catalogTextArray", js.executeScript("let list = document.getElementsByClassName(\"jumbotron\")[0].children[1]; let catalog= list.children[0].children; let ret = []; for (let i = 0; i < catalog.length; i++) { ret.push(catalog[i].textContent); } console.log(ret); return ret;"));
    vars.put("rentVal", js.executeScript("return document.getElementById(\"rentResult\").textContent;"));
    assertEquals(vars.get("catalogTextArray").toString(), "ID 1. Old Deuteronomy,ID 2. Old Deuteronomy,ID 3. Mistoffelees");
    assertEquals(vars.get("rentVal").toString(), "Failure!");
  }
  @Test
  public void dEFECT1FUNGREET() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    vars.put("listingFromCatalog", js.executeScript("let list = document.getElementsByClassName(\"jumbotron\")[0].children[1]; let catalog= list.children[0].children; let ret = []; for (let i = 0; i < catalog.length; i++) { ret.push(catalog[i].textContent); } console.log(ret); return ret;"));
    driver.get("https://cs1632.appspot.com/rent-a-cat");
    vars.put("listingFromRentACat", js.executeScript("let list = document.getElementsByClassName(\"jumbotron\")[0].children[1]; let catalog= list.children[0].children; let ret = []; for (let i = 0; i < catalog.length; i++) { ret.push(catalog[i].textContent); } console.log(ret); return ret;"));
    driver.get("https://cs1632.appspot.com/feed-a-cat");
    vars.put("listingFromFeedACat", js.executeScript(
      "let list = document.getElementsByClassName(\"jumbotron\")[0].children[1];let catalog= list.children[0].children; let ret = []; for (let i = 0; i < catalog.length; i++) { ret.push(catalog[i].textContent); } console.log(ret); return ret;"));
    driver.get("https://cs1632.appspot.com/greet-a-cat");
    vars.put("listingFromGreetACat", js.executeScript("let list = document.getElementsByClassName(\"jumbotron\")[0].children[1]; let catalog= list.children[0].children; let ret = []; for (let i = 0; i < catalog.length; i++) { ret.push(catalog[i].textContent); } console.log(ret); return ret;"));
    assertEquals(vars.get("listingFromCatalog").toString(), "ID 1. Jennyanydots,ID 2. Old Deuteronomy,ID 3. Mistoffelees");
    assertEquals(vars.get("listingFromRentACat").toString(), "ID 1. Jennyanydots,ID 2. Old Deuteronomy,ID 3. Mistoffelees");
    assertEquals(vars.get("listingFromFeedACat").toString(), "ID 1. Jennyanydots,ID 2. Old Deuteronomy,ID 3. Mistoffelees");
    assertEquals(vars.get("listingFromGreetACat").toString(), "ID 1. Jennyanydots,ID 2. Old Deuteronomy,ID 3. Mistoffelees");
  } */
  @Test
  public void tEST7RETURN() {
    driver.get("https://cs1632.appspot.com/rent-a-cat");
    // Get cookie details with named cookie 'foo'
    driver.manage().deleteCookieNamed("2");
    driver.manage().addCookie(new Cookie("2", "true"));
    assertEquals(driver.manage().getCookieNamed("2").getValue(), "true");

    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                              .withTimeout(Duration.ofSeconds(30))
                              .pollingEvery(Duration.ofSeconds(5))
                              .ignoring(NoSuchElementException.class);
                         

    List<WebElement> foo = wait.until(driver -> {
      return driver.findElements(By.className("jumbotron"));
    });
                                


    ArrayList<String> cats = new ArrayList<String>();
    Iterator<WebElement> iter = test.iterator();

    String catalogText = "";
    for (WebElement elem : test) {
      System.out.println(elem.getText());
    }

    /*while (iter.hasNext() && cats.size() != 3) {
      String curr = iter.next().getText();
      if (curr.contains("ID")) {
        catalogText += iter.next().getText();
        if (iter.hasNext()) catalogText += ",";
      }
    }*/

    /*String returnVal = new WebDriverWait(driver, Duration.ofSeconds(10))
                      .until(ExpectedConditions
                      .presenceOfAllElementsLocatedBy(By.className("jumbotron")))
                      .get(0)
                      .findElements(By.className("form-group"))
                      .get(1)
                      .findElement(By.id(("returnResult")))
                      .getText();*/


    


    System.out.println(catalogText);
    vars.put("catalog", catalogText);
    //vars.put("returnVal", returnVal);
    assertEquals("ID 1. Jennyanydots,ID 2. Old Deuteronomy,ID 3. Mistoffelees", vars.get("catalog"));
    //assertEquals("Success!", vars.get("returnVal").toString());
  }

  /* 
  @Test
  public void tEST10GREETACAT() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com/greet-a-cat");
    vars.put("catMsg", js.executeScript("return document.getElementById(\"greeting\").textContent;"));
    assertEquals(vars.get("catMsg").toString(), "Meow!Meow!Meow!");
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com//greet-a-cat/Jennyanydots");
    vars.put("jennyMsg", js.executeScript("return document.getElementById(\"greeting\").textContent;"));
    assertEquals(vars.get("jennyMsg").toString(), "Meow! from Jennyanydots.");
  }
  @Test
  public void tEST9FEED() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com/feed-a-cat");
    vars.put("catnipsRes", js.executeScript("return document.getElementById(\"feedResult\").textContent;"));
    assertEquals(vars.get("catnipsRes").toString(), "Nom, nom, nom.");
  }
  @Test
  public void tEST8FEEDACAT() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com/feed-a-cat");
    vars.put("hasFeedButton", js.executeScript("let buttons = document.getElementsByClassName(\"btn btn-primary\"); const ht = new Map(); let i; for (i = 0; i < buttons.length; i++){ ht.set(buttons[i].textContent, buttons[i]); } ; return ht.has(\"Feed\");"));
    assertEquals(vars.get("hasFeedButton").toString(), "true");
  }
  @Test
  public void tEST6RENT() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com/rent-a-cat");
    vars.put("catalogTextArray", js.executeScript("let list = document.getElementsByClassName(\"jumbotron\")[0].children[1]; let catalog= list.children[0].children; let ret = []; for (let i = 0; i < catalog.length; i++) { ret.push(catalog[i].textContent); } console.log(ret); return ret;"));
    vars.put("rentVal", js.executeScript("return document.getElementById(\"rentResult\").textContent;"));
    assertEquals(vars.get("catalogTextArray").toString(), "Rented out,ID 2. Old Deuteronomy,ID 3. Mistoffelees");
    assertEquals(vars.get("rentVal").toString(), "Success!");
  }
  @Test
  public void tEST5RENTACAT() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    vars.put("rentACatLink", js.executeScript("let catalog = document.querySelectorAll(\'[href=\"/rent-a-cat\"]\'); console.log(catalog[0].textContent); return catalog[0].href;"));
    driver.get("https://cs1632.appspot.com/vars.get('rentACatLink').toString()");
    vars.put("hasRentAndReturnButton", js.executeScript("let buttons = document.getElementsByClassName(\"btn btn-primary\"); const ht = new Map(); let i; for (i = 0; i < buttons.length; i++){ ht.set(buttons[i].textContent, buttons[i]); } ; ht.get(\"Rent\").onclick(); return ht.has(\"Rent\") && ht.has(\"Return\");"));
    assertEquals(vars.get("hasRentAndReturnButton").toString(), "true");
  }
  @Test
  public void tEST4LISTING() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    vars.put("catalogLink", js.executeScript("let catalog = document.querySelectorAll(\'[href=\"/\"]\'); console.log(catalog[0].textContent); return catalog[0].href;"));
    driver.get("https://cs1632.appspot.com/vars.get('catalogLink').toString()");
    vars.put("n_cats", js.executeScript("let list = document.getElementsByClassName(\"jumbotron\")[0].children[1]; let catalog= list.children[0].textContent.split(\"ID\"); catalog.shift(); console.log(catalog.length); return catalog.length;"));
    vars.put("thirdCat", js.executeScript("let list = document.getElementsByClassName(\"jumbotron\")[0].children[1]; let catalog= list.children[0]; return catalog.children[2].firstChild.nodeValue;"));
    assertEquals(vars.get("n_cats").toString(), "3");
    assertEquals(vars.get("thirdCat").toString(), "ID 3. Mistoffelees");
  }
  @Test
  public void tEST3CATALOG() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    vars.put("catalogLink", js.executeScript("let catalog = document.querySelectorAll(\'[href=\"/\"]\'); console.log(catalog[0].textContent); return catalog[0].href;"));
    driver.get("https://cs1632.appspot.com/vars.get('catalogLink').toString()");
    vars.put("srcVal", js.executeScript("let list = document.getElementsByClassName(\"jumbotron\")[0].children; let child; for (let i = 0; i < list.length; i++) { child = list[i]; if (child.nodeName == \"OL\") { break; } }  child = child.childNodes; console.log(child); let links_seen = 0; let curr; for (let i = 0; i < child.length; i++) { curr = child[i]; if (curr.nodeName == \"LI\") { links_seen++; } if (links_seen == 2) {break; } } return curr.children[0].attributes.getNamedItem(\"src\").nodeValue;"));
    assertEquals(vars.get("srcVal").toString(), "/images/cat2.jpg");
  }
  @Test
  public void tEST2RESET() {
    driver.get("https://cs1632.appspot.com/ ");
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    driver.get("https://cs1632.appspot.com/rent-a-cat");
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    vars.put("rentedCats", js.executeScript("let groupHTML = document.getElementsByClassName(\"list-group-item\"); function getRentedCats() { let rented = 0; for (let item of groupHTML) { if (item.textContent == \"Rented out\") {rented++;}} return rented; } return getRentedCats();"));
    assertEquals(vars.get("rentedCats").toString(), "3");
    vars.put("resetLink", js.executeScript("return document.querySelectorAll(\'[href=\"/reset\"]\')[0].href;"));
    driver.get("https://cs1632.appspot.com/vars.get('resetLink').toString()");
    vars.put("rentedCats", js.executeScript("let target = new Map(); target.set(0, \"ID 1. Jennyanydots\"); target.set(1, \"ID 2. Old Deuteronomy\"); target.set(2, \"ID 3. Mistoffelees\"); let groupHTML = document.getElementsByClassName(\"list-group-item\"); function getRentedCats() { let notRented = 0; for (let i = 0; i < groupHTML.length; i++) { if (groupHTML[i].textContent == target.get(i)) {notRented++;}} return notRented; } let ret = getRentedCats(); console.log(ret); return ret;"));
    assertEquals(vars.get("rentedCats").toString(), "3");
  }
  */
}
