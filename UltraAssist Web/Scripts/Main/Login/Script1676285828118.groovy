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

//Open browser with selected URL
WebUI.openBrowser(GlobalVariable.URL)
//Maximixe browser window
WebUI.maximizeWindow()
//Webelements
String username = 'Object Repository/Login WebElement/Page_Login/input_Username_username'
String password = 'Object Repository/Login WebElement/Page_Login/input_Password_password'
String loginbtn = 'Object Repository/Login WebElement/Page_Login/input_Password_Button1'
String dashboard = 'Object Repository/Login WebElement/Page_Login/Page_Dashboard/Dashboard Title'
//Add UserName
WebUI.setText(findTestObject(username), GlobalVariable.UserName)
//Add Password
WebUI.setText(findTestObject(password), GlobalVariable.Password)
//Click on LogIn button
WebUI.click(findTestObject(loginbtn))
//Assertion to verify
assert WebUI.verifyElementVisible(findTestObject(dashboard)) == true : 'login failed as dashboard is not present'