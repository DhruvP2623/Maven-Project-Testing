//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium
import org.openqa.selenium.By;
//importing a package of selenium WbDriver
import org.openqa.selenium.WebDriver;
//importing a package of ChromeDriver
import org.openqa.selenium.chrome.ChromeDriver;
//importing a package of AfterMethod
import org.testng.annotations.AfterMethod;
//importing a package of BeforeMethod
import org.testng.annotations.BeforeMethod;
//importing a package of Test
import org.testng.annotations.Test;
//It allows for formatting (date -> text), parsing (text -> date), and normalization.
import java.text.SimpleDateFormat;

public class HomePage {

    // method simulates a mouse-click on an element
    //findElement command is used to uniquely identify a web element within the web page
    //.click() command works to simulate user click
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    // verifying messages, errors, asserting WebElements, and many more.
    //findElement command is used to uniquely identify a web element within the web page
    //.getText() command is used for helps retrieve the text for a specific web element
    public String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    //to input content in editable text fields or password fields in a webpage.
    //findElement command is used to uniquely identify a web element within the web page
    /*.sendKeys for(Bro it's a good product) is a method in a selenium that allows QAs to type content automatically
        into an editable field while executing any tests for form */
    public void typeText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    @BeforeMethod//Executes before each test method
    public void openBrowser() {
        //.setProperty command is used for sets the property of the system which is indicated by a key
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        // To communicate test scripts with Google Chrome
        driver = new ChromeDriver();
        // To maximize the browser
        driver.manage().window().maximize();
        //.get() method is used to open URL and it will wait till the whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterMethod//Executes after each test method
    public void CloseBrowser() {
        driver.close();
    }

    protected static WebDriver driver;
    //Below code is for Register Page
    @Test//This a test method
    public void register() {
        //set the path of the driver for the chrome Browser
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        //Printing Output for timeStamp
        System.out.println(timeStamp);
        // method simulates a mouse-click on an ico-register
        //By.className for(ico-register) Initializes a new instance of the By class.
        clickOnElement(By.className("ico-register"));
        // method simulates a mouse-click on an radio button of gender-male
        //By.id for(gender-male) locate a particular web element using the value of its id attribute.
        clickOnElement(By.id("gender-male"));
        //to input content in editable text fields for(FirstName) in a webpage.
        //By.id for(FirstName) locate a particular web element using the value of its id attribute.
        typeText(By.id("FirstName"), "Rajesh");
        //to input content in editable text fields for(LastName) in a webpage.
        //By.id for(LastName) locate a particular web element using the value of its id attribute.
        typeText(By.id("LastName"), "Patel");
        //to input content in editable text fields for(DateOfBirth) in a webpage.
        /*.xpath function for(DateOfBirth) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        typeText(By.xpath("//div[@class=\"date-picker-wrapper\"]/select[1]"), "8");
        //to input content in editable text fields for(MonthOfBirth) in a webpage.
        /*.xpath function for(MonthOfBirth) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        typeText(By.xpath("//div[@class=\"date-picker-wrapper\"]/select[2]"), "June");
        //to input content in editable text fields for(YearOfBirth) in a webpage.
        /*.xpath function for(YearOfBirth) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        typeText(By.xpath("//div[@class=\"date-picker-wrapper\"]/select[3]"), "1985");
        //to input content in editable text fields for(Email) in a webpage.
        //By.id for(Email) locate a particular web element using the value of its id attribute.
        typeText(By.id("Email"), "Rajesh" + timeStamp + "@gmail.com");
        //to input content in editable text fields for(Company) in a webpage.
        //By.id for(Company) locate a particular web element using the value of its id attribute.
        typeText(By.id("Company"), "Dp Company");
        // method simulates a mouse-click on a radio Button of NewsLetters
        //By.id for(Newsletter) locate a particular web element using the value of its id attribute.
        clickOnElement(By.id("Newsletter"));
        //to input content in editable text fields for(Password) in a webpage.
        //By.id for(Password) locate a particular web element using the value of its id attribute.
        typeText(By.id("Password"), "rajesh");
        //to input content in editable text fields for(ConfirmPassword) in a webpage.
        //By.id for(ConfirmPassword) locate a particular web element using the value of its id attribute.
        typeText(By.id("ConfirmPassword"), "rajesh");
        // method simulates a mouse-click on a register-button
        //By.id for(register-button) locate a particular web element using the value of its id attribute.
        clickOnElement(By.id("register-button"));
        //By.className for(result) Initializes a new instance of the By class.
        // verifying messages, errors, asserting WebElements, and many more.
        String regMsg = getTextFromElement(By.className("result"));
        //Printing output for regMsg
        System.out.println(regMsg);


    }
    //Below code is for Email A Friend Function
    @Test//This a test method
    public void Emailtofriend (){
        /*.xpath function for(apple-macbook-pro-13-inch) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        // method simulates a mouse-click on an apple-macbook-pro-13-inch
        clickOnElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/apple-macbook-pro-13-inch\"]"));
        /*.xpath function for(email-a-friend) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        // method simulates a mouse-click on an email-a-friend
        clickOnElement(By.xpath("//div[@class=\"email-a-friend\"]"));
        //By.id for(FriendEmail) locate a particular web element using the value of its id attribute.
        //to input content in editable text fields for(FriendEmail) in a webpage.
        typeText(By.id("FriendEmail") , "Ansh123@gmail.com");
        //By.id for(YourEmailAddress) locate a particular web element using the value of its id attribute.
        //to input content in editable text fields for(YourEmailAddress) in a webpage.
        typeText(By.id("YourEmailAddress") ,"dhruvpatel12345@gmail.com");
        //By.id for(PersonalMessage) locate a particular web element using the value of its id attribute.
        //to input content in editable text fields for(PersonalMessage) in a webpage.
        typeText(By.id("PersonalMessage") , "Bro it's a good product");
        //By.className for(buttons) Initializes a new instance of the By class.
        // method simulates a mouse-click on an buttons
        clickOnElement(By.className("buttons"));
        /*.xpath function for(message-error validation-summary-errors) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        // verifying messages, errors, asserting WebElements, and many more.
        //regMsg is local variable to store the find element through .getText command
        String regMsg = getTextFromElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li"));
        //Printing output space
        System.out.println();
        //Printing output for regMsg
        System.out.println(regMsg);

    }
    //Below code is for To print Categories Name in the console
    @Test//This a test method
    public void HomepageCategories(){
        // verifying messages, errors, asserting WebElements, and many more.
        /*.xpath function for(computers) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]"));
        // verifying messages, errors, asserting WebElements, and many more.
        /*.xpath function for(electronics) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg1 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/electronics\"]"));
        // verifying messages, errors, asserting WebElements, and many more.
        /*.xpath function for(apparel) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg2 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/apparel\"]"));
        // verifying messages, errors, asserting WebElements, and many more.
        /*.xpath function for(digital-downloads) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg3 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/digital-downloads\"]"));
        // verifying messages, errors, asserting WebElements, and many more.
        /*.xpath function for(books) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg4 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/books\"]"));
        // verifying messages, errors, asserting WebElements, and many more.
        /*.xpath function for(jewelry) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String resMsg5 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/jewelry\"]"));
        // verifying messages, errors, asserting WebElements, and many more.
        /*.xpath function for(gift-cards) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String resMsg6 = getTextFromElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/gift-cards\"]"));
        //Printing output space
        System.out.println();
        //Printing output for regMsg
        System.out.println(regMsg);
        //Printing output for regMsg1
        System.out.println(regMsg1);
        //Printing output for regMsg2
        System.out.println(regMsg2);
        //Printing output for regMsg3
        System.out.println(regMsg3);
        //Printing output for regMsg4
        System.out.println(regMsg4);
        //Printing output for regMsg5
        System.out.println(resMsg5);
        //Printing output for regMsg6
        System.out.println(resMsg6);
    }
    //Below code is to show that user has Add News Comment and print the message in the console
    @Test//This a test method
    public void NewComments(){
        // method simulates a mouse-click on an read-more
        //By.className for(read-more) Initializes a new instance of the By class.
        clickOnElement(By.className("read-more"));
        //to input content in editable text fields in a webpage.
        //By.id for(AddNewComment_CommentTitle) locate a particular web element using the value of its id attribute.
        typeText(By.id("AddNewComment_CommentTitle") ,"Books");
        //to input content in editable text fields in a webpage.
        //By.id for(AddNewComment_CommentText) locate a particular web element using the value of its id attribute.
        typeText(By.id("AddNewComment_CommentText") ,"good news it was");
        // method simulates a mouse-click on an buttons
        //By.className for(buttons) Initializes a new instance of the By class.
        clickOnElement(By.className("buttons"));
        // verifying messages, errors, asserting WebElements, and many more.
        //By.className for(result) Initializes a new instance of the By class.
        String regMsg = getTextFromElement(By.className("result"));
        //Printing output space
        System.out.println();
        //Printing output for regMsg
        System.out.println(regMsg);

    }
    //Below code is to print Products Name in the console
    @Test//This a test method
    public void Products(){
        // method simulates a mouse-click on an element
         /*.xpath function for(computers) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        clickOnElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]"));
        // method simulates a mouse-click on an element
         /*.xpath function for(Show products in category Desktops) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        clickOnElement(By.xpath("//h2[@class=\"title\"]//a[@title=\"Show products in category Desktops\"]"));
        // verifying messages, errors, asserting WebElements, and many more.
         /*.xpath function for(build-your-own-computer) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg = getTextFromElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/build-your-own-computer\"]"));
        // verifying messages, errors, asserting WebElements, and many more.
          /*.xpath function for(digital-storm-vanquish-3-custom-performance-pc) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMs1 = getTextFromElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]"));
        // verifying messages, errors, asserting WebElements, and many more.
        /*.xpath function for(lenovo-ideacentre-600-all-in-one-pc) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        String regMsg2 = getTextFromElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]"));
        //Printing output space
        System.out.println();
        //Printing output for regMsg
        System.out.println(regMsg);
        //Printing output for regMsg1
        System.out.println(regMs1);
        //Printing output for regMsg2
        System.out.println(regMsg2);

    }
}
