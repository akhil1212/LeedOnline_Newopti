import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.format.DateTimeFormatterBuilder.InstantPrinterParser

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import projectKeywords.LeedOnlineKeywords
import common.entities

class FundamentalRefregrantMgmt {
	int rowNum

	String NameOfForm

	@Given("User should be on form (.*)")
	public void user_should_be_on_FRM_form(String formname) {

		WebUI.callTestCase(findTestCase("Test Cases/TC_Login"), ['variable':'BDD9 TestProject'])

		println formname

		int formRow = new LeedOnlineKeywords().get_rowNumber_of_form(formname)
		rowNum = formRow

		println rowNum

		String formName = findTestData("Data Files/TD_FormElements").getValue("Form Name", rowNum)

		NameOfForm =formName

		String formStatus = entities.scoreCardStatusPrefix+formName+entities.scoreCardStatusSuffix

		//	String formStatus = entities.scoreCard+formName+"']"+entities.scorecardFormSuffix

		TestObject formStatusObj = new TestObject().addProperty('xpath',ConditionType.EQUALS,formStatus,true)

		String scoreCardStatus = WebUI.getText(formStatusObj)

		println "The form Status is "+scoreCardStatus

		if(scoreCardStatus == "READY FOR REVIEW"){

			new LeedOnlineKeywords().click_mark_as_complete(formName)
		}

		WebUI.delay(3)

		new LeedOnlineKeywords().navigate_to_form(formName)
		WebUI.delay(5)



		String stringToSplit = findTestData("Data Files/TD_FormElements").getValue("Form Name with option", rowNum)


		if(stringToSplit.contains("!R")){

			String checkBoxVal = findTestData("Data Files/TD_FormElements").getValue("Checkbox Value", rowNum)

			String optionCheckbox_xpath =  new LeedOnlineKeywords().checkbox_getXpath(checkBoxVal,"option")+"[1]"

			println "Checkbox to be unchecked "+optionCheckbox_xpath

			new LeedOnlineKeywords().IsChecked(optionCheckbox_xpath)

		}


	}





	@When("User uploads files to Add file button")
	public void user_uploads_files_to_Add_file_button() {

		println rowNum
		//WebUI.click(findTestObject("Object Repository/Page_LEED Online/label_Comprehensive Phase-Out Plan"))

		String addfileNum = findTestData("Data Files/TD_FormElements").getValue("Add File", rowNum)

		println "Number of Add files "+addfileNum
		int length = Integer.parseInt(addfileNum)

		println "Addfile num "+length

		for(int i=1;i<=length;i++){

			//String xPath = entities.addFile+'['+i+']'
			//String xPath = '(//input[@type="file"])['+i+']'


			new LeedOnlineKeywords().UploadFiles_to_Addfile(i)
			//println "The path is ###################"+xPath
			WebUI.delay(3)
		}
	}

	@And("User Enters data to Narrative field")
	public void user_enters_data_to_Narrative_field(){
		println rowNum

		String narrativeNum = findTestData("Data Files/TD_FormElements").getValue("Narrative", rowNum)
		println "Number of Narrative "+narrativeNum
		int length = Integer.parseInt(narrativeNum)
		for(int i=1;i<=length;i++){
			String path_narrative = entities.narrative+'['+i+']'
			new LeedOnlineKeywords().fill_narrative(path_narrative)

		}


	}



	@And("User will select the Radio Button")
	public void User_will_select_the_Radio_Button(){


		println rowNum

		String optionValue
		String stringToSplit = findTestData("Data Files/TD_FormElements").getValue("Form Name with option", rowNum)

		if(stringToSplit.contains("!R")){
			String[] form_name = stringToSplit.split("!R")


			optionValue = form_name[0].substring(form_name[0].lastIndexOf("-")+1)

		}

		else{

			optionValue = stringToSplit.substring(stringToSplit.lastIndexOf("-")+1)

		}

		println "The option Value"+optionValue

		//String options = findTestData("Data Files/TD_FormElements").getValue("RadioButton Value", rowNum)

		String option_xpath = entities.radioButton+"[@value='"+optionValue+"'] | "+entities.radioButton1+"@value='"+optionValue+"']"
		//String option_xpath = "(//input[@name='selectedOption'])[@type='radio'][@value='"+optionValue+"']"

		TestObject radio_button = new TestObject().addProperty('xpath',ConditionType.EQUALS,option_xpath,true)
		println "The xpath is "+option_xpath

		new LeedOnlineKeywords().select_radio_button(radio_button)


		String radioCount = findTestData("Data Files/TD_FormElements").getValue("Radio Button", rowNum)

		int length = Integer.parseInt(radioCount)

		if(length>0){

			for(int i=1;i<=length;i++){
				String radio_xpath = entities.radioOptions+"["+i+"]"

				TestObject radiobtn = new TestObject().addProperty('xpath',ConditionType.EQUALS,radio_xpath,true)
				new LeedOnlineKeywords().select_radio_button(radiobtn)
			}

		}


	}

	@And("User enters data to text box")
	public void user_enters_data_to_text_box(){

		String textBoxNum = findTestData("Data Files/TD_FormElements").getValue("Text Box", rowNum)

		println "Text box number "+textBoxNum
		int length = Integer.parseInt(textBoxNum)

		for(int i=1;i<=length;i++){
			TestObject text_box =  new TestObject().addProperty('xpath',ConditionType.EQUALS,entities.textMedium+'['+i+']',true)
			new LeedOnlineKeywords().enter_TextBox_Data(text_box)
		}
	}

	@And("User checks the checkbox option")
	public void user_checks_the_checkbox_option(){

		String checkBoxVal = findTestData("Data Files/TD_FormElements").getValue("Checkbox Value", rowNum)

		println "The form Name "+checkBoxVal

		String stringToSplit = findTestData("Data Files/TD_FormElements").getValue("Form Name with option", rowNum)

		//To check checkboxex apart from the option checkbox

		if(stringToSplit.contains("!R")){
			String checkBoxCount = findTestData("Data Files/TD_FormElements").getValue("Checkbox", rowNum)

			int length = Integer.parseInt(checkBoxCount)

			if(length>0){

				for(int i=1;i<=length;i++){
					String fieldCheckBoxPath = new LeedOnlineKeywords().checkbox_getXpath(checkBoxVal,"")+"["+i+"]"

					TestObject fieldCheckBoxObj = new TestObject().addProperty('xpath',ConditionType.EQUALS,fieldCheckBoxPath,true)
					new LeedOnlineKeywords().select_checkBox(fieldCheckBoxObj)
				}

			}

		}


		else if(checkBoxVal!='' && stringToSplit.contains("!C")){

			String checkbox_xpath =  new LeedOnlineKeywords().checkbox_getXpath(checkBoxVal,"option")
			TestObject checkboxObj = new TestObject().addProperty('xpath',ConditionType.EQUALS,checkbox_xpath,true)
			new LeedOnlineKeywords().select_checkBox(checkboxObj)
			String checkBoxCount = findTestData("Data Files/TD_FormElements").getValue("Checkbox", rowNum)
			int length = Integer.parseInt(checkBoxCount)

			if(length>0){

				for(int i=1;i<=length;i++){
					String fieldCheckBoxPath = new LeedOnlineKeywords().checkbox_getXpath(checkBoxVal,"")+"["+i+"]"

					TestObject fieldCheckBoxObj = new TestObject().addProperty('xpath',ConditionType.EQUALS,fieldCheckBoxPath,true)
					new LeedOnlineKeywords().select_checkBox(fieldCheckBoxObj)
				}

			}
		}

		else{

			String checkBoxCount = findTestData("Data Files/TD_FormElements").getValue("Checkbox", rowNum)
			int length = Integer.parseInt(checkBoxCount)
			String checkBoxValue = ""

			if(length>0){

				for(int i=1;i<=length;i++){
					String fieldCheckBoxPath = new LeedOnlineKeywords().checkbox_getXpath(checkBoxValue,"")+"["+i+"]"
					TestObject fieldCheckBoxObj = new TestObject().addProperty('xpath',ConditionType.EQUALS,fieldCheckBoxPath,true)
					new LeedOnlineKeywords().select_checkBox(fieldCheckBoxObj)
				}

			}

		}

	}

	@And("User enters data to text box with number")
	public void user_enters_data_to_text_box_with_number(){
		String numberTextBoxNum = findTestData("Data Files/TD_FormElements").getValue("Text Box for Numbers", rowNum)

		int length=Integer.parseInt(numberTextBoxNum)
		for(int i=1;i<=length;i++){
			TestObject rtl_textBox = new TestObject().addProperty('xpath',ConditionType.EQUALS,entities.textRtl+'['+i+']',true)
			new LeedOnlineKeywords().enter_data_to_textbox_rtl(rtl_textBox)
		}
	}

	@And("User fills the table (.*) with data (.*) isAddRow (.*)")
	public void user_fills_the_table(String table, String data, String isAddRow){

		new LeedOnlineKeywords().enter_TableData(table, data, isAddRow)

	}

	@And("User clicks on Save button")
	public void User_clicks_on_Save_button() {

		new LeedOnlineKeywords().click_save_button()
		WebUI.delay(4)
	}

	@Then("User can able to see the form got saved")
	public void user_can_able_to_see_the_form_got_saved(){

		WebUI.verifyTextPresent("Form data saved successfully.", false)
	}

	@And("User downloads the uploaded files")
	public void user_downloads_the_uploaded_files(){

		String addfileNum = findTestData("Data Files/TD_FormElements").getValue("Add File", rowNum)

		int length = Integer.parseInt(addfileNum)

		for(int i=1;i<=length;i++){

			new LeedOnlineKeywords().download_the_uploaded_files(i)



		}

	}

	@And("User deletes the uploaded files")
	public void user_deletes_the_uploaded_files(){
		String addfileNum = findTestData("Data Files/TD_FormElements").getValue("Add File", rowNum)

		int length = Integer.parseInt(addfileNum)

		for(int i=length;i>=1;i--){



			new LeedOnlineKeywords().delete_uploaded_files(i)

		}

	}

	@And("User clicks the Complete icon to set status to Ready for Review")
	public void User_clicks_the_Complete_icon_to_set_status_to_Ready_for_Review(){

		WebUI.back()
		WebUI.delay(2)
		new LeedOnlineKeywords().click_mark_as_complete(NameOfForm)

	}

	@And("User sets the date field")
	public void User_sets_the_date_field(){
		new LeedOnlineKeywords().fill_date_field()
	}


}
