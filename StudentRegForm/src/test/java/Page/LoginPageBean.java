package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageBean {

	
		

	WebDriver driver;
	
	

		public LoginPageBean(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		// TODO Auto-generated constructor stub
		
		

		
		
	
	
@FindBy(name="firstName",how=How.NAME)
private WebElement firstName;

@FindBy(name="lastName")
private WebElement lastName;
@FindBy(name="address",how=How.NAME)
private WebElement address;
@FindBy(name="city",how=How.NAME)
private WebElement city;
@FindBy(name="state",how=How.NAME)
private WebElement state;
//@FindBy(name="gender",how=How.NAME)
private WebElement gender;

@FindBy(name="course",how=How.NAME)
private WebElement course;

@FindBy(name="mobilenum",how=How.NAME)
private WebElement mobilenum;

@FindBy(id="Next")
private WebElement submit;

//private By pageheading=By.xpath("//*[@id=\"mainCnt\"]/h1");
@FindBy(xpath="/html/body/h1")
private WebElement pageheading;




public void setFirstName(String firstname) {
	//driver.findElement(userName).sendKeys(us);
	firstName.sendKeys(firstname);
}


public void setLastName(String lastname) {
	//driver.findElement(userPwd).sendKeys(usrPwd);
	lastName.sendKeys(lastname);
}
public void setAddress(String address1) {
	//driver.findElement(userPwd).sendKeys(usrPwd);
	address.sendKeys(address1);
	
}

public void setCity(String city1) {
	//driver.findElement(userPwd).sendKeys(usrPwd);
	city.sendKeys(city1);
	
	
}
public void setstate(String state1) {
	//driver.findElement(userPwd).sendKeys(usrPwd);
	state.sendKeys(state1);
	
	
}
public void setGender(String gender1) {
	//driver.findElement(userPwd).sendKeys(usrPwd);
	WebElement element=driver.findElement(By.id(gender1));
	//System.out.println("hiii");
	element.click();
	//gender.sendKeys(gender1);
	
	
}
public void setCourse(String course1) {
	//driver.findElement(userPwd).sendKeys(usrPwd);
	course.sendKeys(course1);
	
	
}
public void setMobileNum(String mobilenum1) {
	//driver.findElement(userPwd).sendKeys(usrPwd);
	mobilenum.sendKeys(mobilenum1);
	
	
}
public void setSubmit() {
	//driver.findElement(userPwd).sendKeys(usrPwd);
	submit.submit();
	
	
}




public String getPageTitle() {
	//return driver.findElement(pageheading).getText();
	return pageheading.getText();
}



public void loginTo_NextPage(String firstname,
		String lastname,String address1,String city1,String state1,String gender1,String course1,String mobilenum1) {
	this.setFirstName(firstname);
	this.setLastName(lastname);
	this.setAddress(address1);
	this.setCity(city1);
	this.setstate(state1);
	this.setGender(gender1);
	this.setCourse(course1);
	this.setMobileNum(mobilenum1);
	this.setSubmit();
}



}





	


