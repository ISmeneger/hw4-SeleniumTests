package ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTests {
    WebDriver driver;
    private static final String BASE_URL = "https://bonigarcia.dev/selenium-webdriver-java/";

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    @Order(1)
    void openHomePageTest() {
        String actualTitle = driver.getTitle();

        assertEquals("Hands-On Selenium WebDriver with Java", actualTitle);
    }

    @Test
    @Order(2)
    void openWebFormTest() {
        String webFormUrl = "web-form.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'web-form')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + webFormUrl, currentUrl);
        assertEquals("Web form", title.getText());
    }

    @Test
    @Order(3)
    void openNavigationTest() {
        String navigationUrl = "navigation1.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'navigation1')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + navigationUrl, currentUrl);
        assertEquals("Navigation example", title.getText());
    }

    @Test
    @Order(4)
    void openDropdownMenuTest() {
        String dropdownMenuUrl = "dropdown-menu.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'dropdown-menu')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + dropdownMenuUrl, currentUrl);
        assertEquals("Dropdown menu", title.getText());
    }

    @Test
    @Order(5)
    void openMouseOverTest() {
        String mouseOverUrl = "mouse-over.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'mouse-over')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + mouseOverUrl, currentUrl);
        assertEquals("Mouse over", title.getText());
    }

    @Test
    @Order(6)
    void openDragAndDropTest() {
        String dragAndDropUrl = "drag-and-drop.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'drag-and-drop')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + dragAndDropUrl, currentUrl);
        assertEquals("Drag and drop", title.getText());
    }

    @Test
    @Order(7)
    void openDrawingInCanvasTest() {
        String drawingInCanvasUrl = "draw-in-canvas.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'draw-in-canvas')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + drawingInCanvasUrl, currentUrl);
        assertEquals("Drawing in canvas", title.getText());
    }

    @Test
    @Order(8)
    void openLoadingImagesTest() {
        String loadingImagesUrl = "loading-images.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'loading-images')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + loadingImagesUrl, currentUrl);
        assertEquals("Loading images", title.getText());
    }

    @Test
    @Order(9)
    void openSlowCalculatorTest() {
        String slowCalculatorUrl = "slow-calculator.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 3. WebDriver Fundamentals']/../a[contains(@href, 'slow-calculator')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + slowCalculatorUrl, currentUrl);
        assertEquals("Slow calculator", title.getText());
    }

    @Test
    @Order(10)
    void openLongPageTest() {
        String longPageUrl = "long-page.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'long-page')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + longPageUrl, currentUrl);
        assertEquals("This is a long page", title.getText());
    }

    @Test
    @Order(11)
    void openInfiniteScrollTest() {
        String infiniteScrollUrl = "infinite-scroll.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'infinite-scroll')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + infiniteScrollUrl, currentUrl);
        assertEquals("Infinite scroll", title.getText());
    }

    @Test
    @Order(12)
    void openShadowDOMTest() {
        String shadowDOMlUrl = "shadow-dom.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'shadow-dom')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + shadowDOMlUrl, currentUrl);
        assertEquals("Shadow DOM", title.getText());
    }

    @Test
    @Order(13)
    void openCookiesTest() {
        String cookiesUrl = "cookies.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'cookies')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + cookiesUrl, currentUrl);
        assertEquals("Cookies", title.getText());
    }

    @Test
    @Order(14)
    void openFramesTest() {
        String framesUrl = "frames.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[@href = 'frames.html']")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement frame = driver.findElement(By.cssSelector("frame[name='frame-header']"));
        driver.switchTo().frame(frame);
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + framesUrl, currentUrl);
        assertEquals("Frames", title.getText());
    }

    @Test
    @Order(15)
    void openIFrameTest() {
        String iFrameUrl = "iframes.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'iframes')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + iFrameUrl, currentUrl);
        assertEquals("IFrame", title.getText());
    }

    @Test
    @Order(16)
    void openDialogBoxesTest() {
        String dialogBoxesUrl = "dialog-boxes.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'dialog-boxes')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + dialogBoxesUrl, currentUrl);
        assertEquals("Dialog boxes", title.getText());
    }

    @Test
    @Order(17)
    void openWebStorageTest() {
        String webStorageUrl = "web-storage.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 4. Browser-Agnostic Features']/../a[contains(@href, 'web-storage')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + webStorageUrl, currentUrl);
        assertEquals("Web storage", title.getText());
    }

    @Test
    @Order(18)
    void openGeolocationTest() {
        String geolocationUrl = "geolocation.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 5. Browser-Specific Manipulation']/../a[contains(@href, 'geolocation')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + geolocationUrl, currentUrl);
        assertEquals("Geolocation", title.getText());
    }

    @Test
    @Order(19)
    void openNotificationsTest() {
        String notificationsUrl = "notifications.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 5. Browser-Specific Manipulation']/../a[contains(@href, 'notifications')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + notificationsUrl, currentUrl);
        assertEquals("Notifications", title.getText());
    }

    @Test
    @Order(20)
    void openGetUserMediaTest() {
        String getUserMediaUrl = "get-user-media.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 5. Browser-Specific Manipulation']/../a[contains(@href, 'get-user-media')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + getUserMediaUrl, currentUrl);
        assertEquals("Get user media", title.getText());
    }

    @Test
    @Order(21)
    void openMultilanguageTest() {
        String multilanguageUrl = "multilanguage.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 5. Browser-Specific Manipulation']/../a[contains(@href, 'multilanguage')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + multilanguageUrl, currentUrl);
        assertEquals("", title.getText());
    }

    @Test
    @Order(22)
    void openConsoleLogsTest() {
        String consoleLogsUrl = "console-logs.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 5. Browser-Specific Manipulation']/../a[contains(@href, 'console-logs')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + consoleLogsUrl, currentUrl);
        assertEquals("Console logs", title.getText());
    }

    @Test
    @Order(23)
    void openLoginFormTest() {
        String loginFormUrl = "login-form.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 7. The Page Object Model (POM)']/../a[contains(@href, 'login-form')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + loginFormUrl, currentUrl);
        assertEquals("Login form", title.getText());
    }

    @Test
    @Order(24)
    void openSlowLoginFormTest() {
        String slowLoginFormUrl = "login-slow.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 7. The Page Object Model (POM)']/../a[contains(@href, 'login-slow')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + slowLoginFormUrl, currentUrl);
        assertEquals("Slow login form", title.getText());
    }

    @Test
    @Order(25)
    void openRandomCalculatorTest() {
        String randomCalculatorUrl = "random-calculator.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 8. Testing Framework Specifics']/../a[contains(@href, 'random-calculator')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + randomCalculatorUrl, currentUrl);
        assertEquals("Random calculator", title.getText());
    }

    @Test
    @Order(26)
    void openDownloadFilesTest() {
        String downloadFilesUrl = "download.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 9. Third-Party Integrations']/../a[contains(@href, 'download')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + downloadFilesUrl, currentUrl);
        assertEquals("Download files", title.getText());
    }

    @Test
    @Order(27)
    void openAbTestingTest() {
        String aBTestingUrl = "ab-testing.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 9. Third-Party Integrations']/../a[contains(@href, 'ab-testing')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + aBTestingUrl, currentUrl);
        assertEquals("A/B Testing", title.getText());
    }

    @Test
    @Order(28)
    void openDataTypesTest() {
        String dataTypesUrl = "data-types.html";
        driver.findElement(By.xpath("//h5[text() = 'Chapter 9. Third-Party Integrations']/../a[contains(@href, 'data-types')]")).click();
        String currentUrl = driver.getCurrentUrl();
        WebElement title = driver.findElement(By.className("display-6"));

        assertEquals(BASE_URL + dataTypesUrl, currentUrl);
        assertEquals("Data types", title.getText());
    }
}
