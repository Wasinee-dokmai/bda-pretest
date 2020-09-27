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

// click sign up
WebUI.click(findTestObject('obj/sign_up_page'))
WebUI.delay(2)

//input name e-mail and password
WebUI.setText(findTestObject('obj/input_name'), GlobalVariable.U_fullname)
WebUI.delay(1)
WebUI.setText(findTestObject('obj/input_email'), GlobalVariable.U_Email)
WebUI.delay(1)
WebUI.setText(findTestObject('obj/input_password'), GlobalVariable.U_password)
WebUI.delay(1)

//click submit
WebUI.click(findTestObject('obj/bt_submit'))
WebUI.delay(2)

// verify text 
WebUI.verifyTextPresent('One last step…', false)

// click go to sigin in page
WebUI.click(findTestObject('obj/bt_Sign_in')) 
WebUI.delay(1)

// verify register successfully
WebUI.verifyTextPresent('My Account', false)
WebUI.delay(1)

//click go to my account page
WebUI.click(findTestObject('obj/bt_My_Account'))

// verify name and email
WebUI.verifyTextPresent("Personal Information", false)
WebUI.verifyTextPresent(GlobalVariable.U_fullname, false)
WebUI.verifyTextPresent(GlobalVariable.U_Email, false)

// sign out and close browser
WebUI.click(findTestObject('obj/bt_sign_out'))
WebUI.delay(2)
WebUI.closeBrowser()


