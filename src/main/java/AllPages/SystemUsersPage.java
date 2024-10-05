package AllPages;

import org.openqa.selenium.WebDriver;

public class SystemUsersPage {

WebDriver driver;
	
	// UsernameTxtbox;	//label[text()='Username']/../following-sibling::div/input
	
	
	// searchBtn;//button[@type='submit']
	
	
	// RecordFoundTxt;//span[text()='(1) Record Found']
	
	
	//deleteRecordTxt;//p[text()='The selected record will be permanently deleted. Are you sure you want to continue?']
	
	
	
	
//	yesDeleteBtn;//div[@class='orangehrm-modal-footer']/button/i
	
	
	
	
	//2 Define constr
	
	
	
	//3 .
	// EnterValueInUserName(String val)
	
		//System.out.println("Search with  user="+val);
	

	/// click Search button ClickSearch()
	
		//System.out.println("click Search button");

	
	
			
		// Verify  '(1) Record Found'  msg is displayed verify1RecordFoundMsg
	
		
//		System.out.println("Verify  '(1) Record Found'  msg is displayed");
		
		
//			System.out.println("Pass.'(1) Record Found'  msg is displayed");
			
	
//			System.out.println("Fail. '(1) Record Found'  msg is  not displayed");
		
		

	
	
	// Select given user name -selectCheckboxForGivenUser(String user)
	
		//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Alice']/preceding::input[1]
		//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Alice']/parent::div/preceding-sibling::div//input
		
//					Thread.sleep(4000);
//			System.out.println("select user ="+ user);
//			
			//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Anthony.Nolan']/parent::div/preceding-sibling::div/div

			
		
		
//			System.out.println("NoSuchElementException. Please check user="+ user + " is avaialble");
	
		
	
	
	//				// Click delete image icon -clickDeleteImageForUser(String user)
	
		//div[@class='oxd-table-body']/div/div[@role='row']/div[2]/div[text()='Alice']/parent::div/following-sibling::div[4]//i[contains(@class,'trash')]
		
//			Thread.sleep(4000);

//			String myxpath="//div[@role='rowgroup'][@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='" +user+"']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']";
//			System.out.println("click Delete image icon for user="+ user);
			
			
		
		
//			System.out.println("NoSuchElementException. Please check user="+ user + " is avaialble");
	
	

	//				
	//	// Verify the msg -The selected record will be permanently deleted. Are you sure you want to continue?
// verifyDeleteRecordMsgDisplayed
	
//			Thread.sleep(4000);
	
//			System.out.println("The selected record will be permanently deleted. Are you sure you want to continue? is displayed");
	
//			System.out.println("System.out.println(\"The selected record will be permanently deleted. Are you sure you want to continue? is  not displayed\");");
			
		
			
			

			
	//// Click Yes Delete button-clickYesDeleteBtn()

//		System.out.println("clickYesDeleteBtn");

		
	//// Verify Record should not be available in table  or No records found
	//searchForGivenUser
				


}
