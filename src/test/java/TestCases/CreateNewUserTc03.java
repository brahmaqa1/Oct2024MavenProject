package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;

public class CreateNewUserTc03 {

	@Test
	public void createNewUserTc03() throws InterruptedException
	{
		// open browser		
		// open url in browser
		// open url = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		// open browser		
		// open url in browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// add some commnets by tester2 
		//		//open chrome browser
		WebDriver driver =  new ChromeDriver();
		// open url = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		//                   https://opensource-demo.orangehrmlive.com/auth/login
		// .implicitlyWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




		// 	loginToAppl
		LoginPage lpage = new LoginPage(driver);

		lpage.loginToAppl("Admin", "admin123");

		// or 
		// logintoAppl  pass user, pwd


		// Verify Home page is displayed or not
		// Create obj for HomePage - class
		HomePage hPage = new HomePage(driver);
		hPage.isProfileImageDisplayed();			


		//  Navigate to admin menu
		hPage.navigateToAdminMenu();

		// Verify System user page is displayed or not
		hPage.verifySystemUserPageDisplayed();


		//Click add +   button
		//				oxd-button oxd-button--medium oxd-button--secondary
		hPage.clickAddBtn();


		// Verify - Add User page is displayed
		hPage.verifyAddUserpageDisplayed();

		//Select some value (Admin) in User Role dropdown
		hPage.selectUserRole();


		// or selectUserRole-ESS  -->  
		// working

		// type some employee name(Orange  Test) - in "Employee Name" txt box

		//                       Orange  Test
		String empName ="vin eetha Dan";
		hPage.typeEmployeeName(empName);
		
		// Select some status =Enabled
		hPage.selectStatus("Enabled");

		// Type some value in 'user name' text box 
		//  Ramarao123  ramrao9868
		//				Random  r = new Random();
		//				int randomno= r.nextInt(1000);		
//						String user= "ramarao" + random
		String user= "rajaram1";
		hPage.enterUserName(user);


		// Type some value in 'password'  text box
		String pwd = "Admin123";
		
		hPage.EnterValueInPassword(pwd);

		//// Type some value in 'Confirm password'  text box
		hPage.EnterValueInConfirmPassword(pwd);

		Thread.sleep(3000);

		// click on Save button
		hPage.clickSaveBtn();

		// Verify  new user name is exist in table or not




	}
}
