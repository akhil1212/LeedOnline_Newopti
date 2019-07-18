package common
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
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
import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.aggregateExpression_scope
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

import com.kms.katalon.core.configuration.RunConfiguration
import groovy.io.FileType
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.SelectorMethod
import org.openqa.selenium.remote.HttpCommandExecutor
import org.openqa.selenium.remote.SessionId
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.Capabilities

class LoginStepDefinition {
	@Given("User has to navigate to leed online home page")
	public void user_has_to_navigate_to_leed_online_home_page() {
		//'	new LeedOnlineKeywords().setDownloadPath()
		WebUI.openBrowser("")
		WebUI.maximizeWindow()

		RemoteWebDriver driver = DriverFactory.getWebDriver()
		String DownloadPath = "/var/lib/jenkins/workspace/Usgbc_LEEDOnline_NewApproach/USGBC_LEED/Include/TestData/DownloadedFiles"
		new	LeedOnlineKeywords().sendCommandForDownloadChromeHeadLess((HttpCommandExecutor)driver.getCommandExecutor(),driver.getSessionId(), DownloadPath )

		WebUI.navigateToUrl("https://leedonline-stg.usgbc.org")
	}

	@And("User enters the username (.*) and password (.*)")
	public void user_enters_the_username_automationbdd_gmail_com_and_password_initpass(String username, String password) {

		TestObject userNameObj = new TestObject().addProperty('xpath',ConditionType.EQUALS,entities.userName)
		TestObject passwordObj = new TestObject().addProperty('xpath',ConditionType.EQUALS,entities.password)
		//WebUI.setText(findTestObject('Object Repository/Login/input_Log username'), username)
		//WebUI.setText(findTestObject('Object Repository/Login/input_Log password'), password)

		WebUI.setText(userNameObj, username)
		WebUI.setText(passwordObj, password)
	}

	@And("User has to accept end user license agreement")
	public void user_has_to_accept_end_user_license_agreement() {
		WebUI.delay(3)
		//WebUI.scrollToElement(findTestObject('Object Repository/Login/span_End User License Agreemen'),30)
		//WebUI.check(findTestObject('Object Repository/Login/span_End User License Agreemen'))
		TestObject agreementObj = new TestObject().addProperty('xpath',ConditionType.EQUALS,entities.agreement)
		WebUI.scrollToElement(agreementObj,30)
		WebUI.check(agreementObj)
	}


	@When("User clicks on LOG IN button")
	public void user_clicks_on_LOG_IN_button() {
		WebUI.delay(4)
		//	WebUI.click(findTestObject('Object Repository/Login/button_Log In'))

		TestObject btnObj = new TestObject().addProperty('xpath',ConditionType.EQUALS,entities.loginButton)
		//WebUI.click(btnObj)

		WebUI.submit(btnObj)
	}

	@Then("User clicks on Project")
	public void user_clicks_on_Project() {

		//TestObject projectName  = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//div[@title="BDD9 TestProject"]', true)

		TestObject projectName = new TestObject().addProperty('xpath',ConditionType.EQUALS,entities.projectName)
		WebUI.click(projectName)
	}

	@And("User navigates to the credits page of the project")
	public void user_navigates_to_the_credits_page_of_the_project() {

		TestObject creditsBtn = new TestObject().addProperty('xpath',ConditionType.EQUALS,entities.creditsBtn)

		//WebUI.click(findTestObject('Object Repository/Login/a_Credits'))

		WebUI.click(creditsBtn)
	}
}