package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    //Your framework is thread-safe because each test thread gets its own WebDriver instance, thanks to ThreadLocal<WebDriver>. create a

    public static void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver.get().manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
        String githubActions= System.getenv("GITHUB_ACTIONS");
        if("true".equalsIgnoreCase(githubActions)){
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--window-size=1920,1080");

        }
        driver.set(new ChromeDriver(options));
//        driver.set(new ChromeDriver());
        //If we want to run  on headed remove the options
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
