package testing;		// TODO Auto-generated method stub

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.FileReader;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class LinkedInJobSearchAutomation {
    public static void main(String[] args) {
        // Set path for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.get("https://www.linkedin.com/login");
        System.out.println("launched linkedin");
        driver.manage().window().maximize();
    	System.out.println("selected 1");

/*
        try {
            WebElement keepMeLoggedInCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='rememberMeOptIn-checkbox']")));
           Thread.sleep(2000);
           keepMeLoggedInCheckbox.click(); 
           if (keepMeLoggedInCheckbox.isSelected()) {
            	System.out.println("selected");
                keepMeLoggedInCheckbox.click(); 
            }
            else {
            	System.out.println("not selected");
            }
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            FileReader reader = new FileReader("./linkedin cookie.json.txt");
            Gson gson = new Gson();
            JsonArray cookiesArray = gson.fromJson(reader, JsonArray.class);

            // Iterate through each cookie object and add them to Selenium
            for (int i = 0; i < cookiesArray.size(); i++) {
                JsonObject cookieJson = cookiesArray.get(i).getAsJsonObject();

                // Extract cookie properties
                String name = cookieJson.get("name").getAsString();
                String value = cookieJson.get("value").getAsString();
                String domain = cookieJson.get("domain").getAsString();
                String path = cookieJson.get("path").getAsString();
                boolean secure = cookieJson.get("secure").getAsBoolean();
                boolean httpOnly = cookieJson.get("httpOnly").getAsBoolean();

                // Convert expirationDate to long
           //     long expiry = cookieJson.has("expirationDate") ? cookieJson.get("expirationDate").getAsLong() : -1;
                long expiry = System.currentTimeMillis() + 1000000000L; // Example expiry time (1 billion ms from now)

                // Create a Selenium Cookie object
                Cookie cookie = new Cookie(name, value, domain, path,  new Date(expiry), secure, httpOnly);

                // Add the cookie to the browser session
                driver.manage().addCookie(cookie);
            }
            driver.navigate().refresh();

			/*
			 * usernameField.sendKeys("a.nirmalkumar007@gmail.com");
			 * passwordField.sendKeys("Nimmu@007"); loginButton.click();
			
            // Wait for login to complete (wait for the home page to load)

            driver.get("https://www.linkedin.com/jobs/");
          //input[@id='jobs-search-box-keyword-id-ember255']
            // Wait for the search input field to be clickable
            WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.className("jobs-search-box__text-input")));
            searchField.sendKeys("Software Test Engineer");
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li)[1]"))).click();           

            // Click on the location filter dropdown and set Chennai
            WebElement   locationField= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label='City, state, or zip code']")));
            locationField.clear();
            locationField.sendKeys("Chennai");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li/button)[1]"))).click();           
         //   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='searchFilter_experience']"))).click();           
          //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='experience-2']"))).click();           
         //   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@aria-label,'Apply current filter')])[3]"))).click();           

            // Click the search button to trigger the job search
    //        WebElement searchButton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
     //       searchButton.click();

            
            // Wait for the job search results to load
            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("jobs-search-results__list")));

            // Extract and print job listings
            List<WebElement> jobList = driver.findElements(By.className("job-card-list__title"));
            System.out.println("Job Listings:");

            for (WebElement job : jobList) {
                System.out.println("Job Title: " + job.getText());
                
                // Extract additional job details (company name and location)
                WebElement companyName = job.findElement(By.xpath("../../../..//h4[@class='job-card-container__company-name']"));
                WebElement jobLocation = job.findElement(By.xpath("../../../..//span[@class='job-card-container__metadata-item']"));
                
                System.out.println("Company: " + companyName.getText());
                System.out.println("Location: " + jobLocation.getText());
                System.out.println("-----------------------------");
            }
            // - Filter by experience level
           
            // Wait for the filtered results to load
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='jobs-search__results-list']")));

            // 6. Extract job listings
            List<WebElement> jobListings = driver.findElements(By.xpath("//ul[@class='jobs-search__results-list']/li"));
            System.out.println("Job Listings: ");
            for (WebElement job : jobListings) {
                String jobTitle = job.findElement(By.xpath(".//h3")).getText();
                String companyName = job.findElement(By.xpath(".//h4")).getText();
                System.out.println(jobTitle + " at " + companyName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 7. Close the browser
         //   driver.quit();
        }  */      
    }  
}
