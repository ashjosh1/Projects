


	package Form1;

	import static org.junit.Assert.assertTrue;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import Page.LoginPageBean;
	import cucumber.api.java.Before;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class StepDef {
		private WebDriver driver;
		private WebDriver driver1;
		private LoginPageBean loginPageBean;
		@Before
		public void setUp() {
			System.setProperty("webdriver.chrome.driver","D:\\Users\\askommar\\Downloads\\chromedriver.exe");
		
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			loginPageBean=new LoginPageBean(driver);
		}
		@Given("^Student details$")
		public void student_details() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.get("http://localhost:8083/StudentRegForm/");
			
		}

		@When("^valid details$")
		public void valid_details() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions

	String pageHeading=loginPageBean.getPageTitle();

	assertTrue(pageHeading.equals("Student Registration Form"));


	loginPageBean.loginTo_NextPage("Ash","Reddy","FlatNo:10,Srd","Hyderabad","telangana","m","BE","9000781570");

		}

		@Then("^successfully save the details$")
		public void successfully_save_the_details() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		
			

		  
				 //System.out.println(driver.switchTo().alert().getText());
				         driver.switchTo().alert().accept(); 
				    	 String url=driver.getCurrentUrl();
				    	 
				    	 

			  assertTrue(url.equals("http://localhost:8083/StudentRegForm/next"));
			//  driver.get("http://localhost:8083/StudentRegForm/next");
		}
		@Given("^Paymentdetails$")
		public void paymentdetails() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			 driver.get("http://localhost:8083/StudentRegForm/next");
		}

		@When("^ValidDetails$")
		public void validdetails() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		   
		}

		@Then("^registration is successfull$")
		public void registration_is_successfull() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    
		}
		
		}

		


