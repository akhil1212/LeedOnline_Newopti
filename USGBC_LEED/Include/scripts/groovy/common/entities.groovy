package common

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class entities {

	//Login
	static String userName = "//input[@type='text']"
	static String password = "//input[@type='password']"
	static String agreement = "//input[@type='checkbox' and @name='agree']"
	static String loginButton = "//fieldset//button[@type='submit']"
	static String creditsBtn = "//a[normalize-space()='Credits']"
	static String projectName = "//a[normalize-space()='BDD9 TestProject']"



	static String addFile = '(//input[@type="file"])'
	static String narrative = '(//iframe[contains(@class, "cke_wysiwyg_frame")])'
	static String radioButton = '(//input[@name="selectedOption"])[@type="radio"]'
	static String radioButton1 = "//input[@type='radio' and "

	//Simple Radio button

	static String radioOptions = '((//input[@name="aselectedOption"])[@type="radio"])'


	static String textMedium = "(//input[@type='text'][@class='leed-text-medium'])"
	static String textRtl = "(//div[@class='leed-single-row']//input[@type='text'])"
	static String formIframe = "//iframe"
	//static String checkBox = "(//div[@class='ui checkbox leed-checkbox']//input[@type='checkbox'])"



	//Date Field

	static String dateText = "//div[@class='vdp-datepicker dateInputWrapper']//input[@type='text']"
	static String dateSelect = "//div[@class='vdp-datepicker__calendar']//span[@class='cell day' and  text()='5'] | //div[@class='vdp-datepicker__calendar']//span[@class='cell day selected' and  text()='5']"

	static String scorecardFormName = "(//div[@class='col2 credit-name simpleTip'])"
	static String scorecardFormPrefix = "(//div[@class='col2 credit-name simpleTip'][contains(text(),'"
	static String scorecardFormSuffix = "']/following::div[@class='optionals']//div[@class='buttons']//a//span[contains(text(),'(V01)')])[1]"

	static String scoreCard = "(//div[@class='col2 credit-name simpleTip' and normalize-space()='"

	//Mark as complete
	//static String markCompletePrefix = "//div[@class='col2 credit-name simpleTip'][contains(text(),'"
	static String markCompletePrefix = "(//div[@class='col2 credit-name simpleTip' and normalize-space()='"
	//static String markComplereSuffix = "')]/..//div[@class='toggle-check'][a]"
	static String markCompleteSuffix = "']/..//div[@class='toggle-check'][a])"

	//scorecard Status

	//static String scoreCardStatusPrefix = "(//a/preceding::div[@class='col2 credit-name simpleTip'][contains(text(),'"
	static String scoreCardStatusPrefix = "(//a/preceding::div[@class='col2 credit-name simpleTip' and normalize-space()='"
	static String scoreCardStatusSuffix = "']/following::h3)[1]"

	//Uploaded files' table

	static String uploadedTablePrefix = "(//table[@class='ui collapsing celled table unstackable'])["//tbody//tr"
	static String uploadedTableSuffix = "]/tbody/tr"

	//Download Icon

	static String downloadIconPrefix = "((//table[@class='ui collapsing celled table unstackable'])["
	static String downloadIconSuffix = "]//i[@class='download icon'])"

	//Delete Icon

	static String deleteIconPrefix = "((//table[@class='ui collapsing celled table unstackable'])["
	static String deleteIconSuffix = "]//i[@class='trash icon'])"

	//File Name in Uploaded file table
	
	static String uploadedFileNamePrefix = "((//table[@class='ui collapsing celled table unstackable'])["
	static String uploadedFileNameSuffix = "]//td[@class='fileNameColumn'])"
	
	// Table
	static String tableSelectPrefix = "(//label[contains(text(),'"
	static String tableSelectSuffix = "')]/following::table[1]//tr"

	static String tableTextPrefix = "(//label[contains(text(),'"
	static String tableTextSuffix = "')]/following::table[1]//tr"

	static String saveButton = "//button[@class='ui primary button']"

	static String yesButton = "//button[@class='confirm-yes mini ui blue button']"

	//Assersion xpaths
	//Addfile button xpath to check whether it is enabled

	static String AddFileEnabled = "(//button[@class='tiny ui button'])["

	//static String table_path = "//label[contains(text(),"+table_name+")]/following::table[1]"

}
