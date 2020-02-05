package ABC;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class WebExercise1
{
    static protected WebDriver driver;

    @Test
    public void metalanRegister()//auto registaration for matalan
    {   // set system property fro chrome driver
        System.setProperty( "webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS ); // wait time management
        driver.get( "https://www.matalan.co.uk/" ); //url for metalan
        driver.findElement( By.className( "o-list__item" ) ).click(); //click on register button
        driver.findElement( By.id( "account_form_email" ) ).sendKeys( "pbksoft2019@gmail.com" );// inserting email
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );// wait time in between actions
        driver.findElement( By.xpath( "//button[@data-behavior='save_button']" ) ).click();
        // auto input for first name
        driver.findElement( By.xpath( "//input[@id='account_form_meta_attributes[first_name][value]']" ) ).sendKeys( "Prakash" );
        driver.findElement( By.id( "account_form_meta_attributes[last_name][value]" ) ).sendKeys( "Kachhdiya" ); // last name auto input
        driver.findElement( By.id( "account_form_email_confirmation" ) ).sendKeys( "pbksoft2019@gmail.com" );
        driver.findElement( By.xpath( "//input[@id='account_form_password']" ) ).sendKeys( "Abcd1234" ); //password auto input
        driver.findElement( By.id( "account_form_password_confirmation" ) ).sendKeys( "Abcd1234" ); //confirm password auto input
        driver.findElement( By.className( "recaptcha-checkbox-border" ) ).click(); // capta
        driver.findElement( By.id( "recaptcha_disabled_btn" ) ).click();
    }

    @Test
    public void orangeHrmRegistration() // auto reistartion for OrangeHrm
    { // set system property an path for chrome browser
        System.setProperty( "webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS ); // wait time in between actions
        driver.get( "https://opensource-demo.orangehrmlive.com/" ); //url for OrangeHrm
        driver.findElement( By.id( "txtUsername" ) ).sendKeys( "Admin" );//username auto input
        driver.findElement( By.id( "txtPassword" ) ).sendKeys( "admin123" ); //password auto input
        driver.findElement( By.id( "btnLogin" ) ).click(); // auto click on login button
    }

    @Test
    public void autoRegistration()//automatic practice auto registration
            // set system property and path for chrome
    {   System.setProperty( "webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS ); // wait time in between action
        driver.get( "http://automationpractice.com/index.php" );// url for automatic practice
        driver.findElement( By.className( "login" ) ).click(); //auto click on login button
        driver.findElement( By.id( "email_create" ) ).sendKeys("pbksoft2019@gmail.com"  ); // auto input for email address
        driver.findElement( By.id( "SubmitCreate" ) ).click(); // auto click on submit
        driver.findElement( By.id( "customer_firstname" ) ).sendKeys( "prakash" ); //first name auto input
        driver.findElement( By.id( "customer_lastname" ) ).sendKeys( "kachhadiya" ); // lastname auto input
        driver.findElement( By.id( "passwd" ) ).sendKeys( "Abcd1234" ); // password auto input
        driver.findElement( By.id( "address1" ) ).sendKeys( "11 Downing Street, AB1 2CD" ); // address auto input
        driver.findElement( By.id( "city" ) ).sendKeys( "London" );// auto input city
        driver.findElement( By.id( "id_state" ) ).findElements(By.id( "uniform-id_state" ) ); // auto input for state
        driver.findElement( By.id( "postcode" ) ).sendKeys( "AB1 2CD" );// auto input for post code
        driver.findElement( By.id( "phone_mobile" ) ).sendKeys( "01234567891" );// phone number auto input
        driver.findElement( By.id( "submitAccount" ) ).click(); // click on submit button
    }

    @Test
    public void zaraRegistartion() // zara auto registration
    {   // // set system property and path for chrome
        System.setProperty( "webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS ); //wait time management
        driver.get( "https://www.zara.com/uk/" ); // url for zara
        driver.findElement( By.xpath( "/html/body/div[4]/header/div/div[3]/nav/ul/li[1]/a" )).click();
        driver.findElement( By.id( "register-button" ) ).click(); // auto click on register button
        driver.findElement( By.id( "email-form" ) ).sendKeys( "pbksoft2019@gmail.com" ); // auto input email
        driver.findElement( By.id( "new-password-form" ) ).sendKeys( "Abcd1234" ); // password auto input
        driver.findElement( By.id( "password-confirm-form" ) ).sendKeys( "Abcd1234" ); // confirm password auto input
        driver.findElement( By.id( "first-name" ) ).sendKeys( "James" ); // auto input for first name
        driver.findElement( By.id( "last-name" ) ).sendKeys( "Bond" ); //auto input last name
        driver.findElement( By.id( "address-1" ) ).sendKeys( "10 Downing Street" ); //auto input address
        driver.findElement( By.id( "zip-code" ) ).sendKeys( "N1 1QN" ); //post code auto input
        driver.findElement( By.id( "city" ) ).sendKeys( "London" ); // auto input city name
        driver.findElement( By.id( "phone-1" ) ).sendKeys( "7896543211" );//auto input phone number
        driver.findElement( By.id( "sign-up-button" ) ).click(); //auto click on sign in button
    }
    @Test
    public void mockPlusRegistartion() // auto registration for mock plus
    {   System.setProperty( "webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get("https://www.mockplus.com/"); // url for mockplus
        driver.findElement( By.className( "user-btn" ) ).click(); // click on log in button
        driver.findElement( By.id( "email" ) ).sendKeys( "pbksoft2019@gmail.com" ); // auto input email
        driver.findElement( By.id( "password" ) ).sendKeys( "Abca1234" ); // password auto input
        driver.findElement( By.id( "cofPassword" ) ).sendKeys( "Abcd1234" ); // auto input confirm password
        driver.findElement( By.id( "register" ) ).click(); // auto click on register
        }
}



