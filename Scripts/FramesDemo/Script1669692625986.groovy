import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://selenium08.blogspot.com/2019/11/selenium-iframe.html')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Selenium IFrame/center_Free Mock Tests  Current Affairs (Ne_2dcbd5'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Page_Selenium IFrame/a_View All Jobs'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Selenium IFrame/h2_Popular Categories'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Selenium IFrame/div_Jobs'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Selenium IFrame/div_Work from home jobs'), 'Work from home jobs')

WebUI.closeBrowser()

