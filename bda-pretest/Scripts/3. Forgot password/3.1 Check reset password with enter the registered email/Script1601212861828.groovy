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

// open browser and go to katalon sign in page
WebUI.openBrowser(GlobalVariable.SignIn_url)
WebUI.maximizeWindow()
WebUI.delay(1)

// click button reset password
WebUI.click(findTestObject('obj/bt_forgot_pass'))
WebUI.delay(1)

// input registered email.
WebUI.setText(findTestObject('obj/input_email'), GlobalVariable.U_Email_not_delete)
WebUI.delay(1)

//click reset password
WebUI.click(findTestObject('obj/bt_reset_pass'))
WebUI.delay(3)

// verify text
WebUI.verifyTextPresent("An email has been sent to your email address that includes a password reset link", false)
WebUI.verifyTextPresent("Still don't get the email", false)
WebUI.delay(1)

// close browser
WebUI.closeBrowser() 