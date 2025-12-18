import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.contactus.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1512, 748)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /contact-us"

TrueTestScripts.navigate("contact-us")

"Step 2: Click on input yourName"

WebUI.enhancedClick(findTestObject('AI-Generated/contactus/Page_contact_us/input_yourName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on input yourName.png')

"Step 3: Enter input value in input yourName"

WebUI.setText(findTestObject('AI-Generated/contactus/Page_contact_us/input_yourName'), input_yourName)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Enter input value in input yourName.png')

"Step 4: Click on input surname"

WebUI.enhancedClick(findTestObject('AI-Generated/contactus/Page_contact_us/input_surname'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on input surname.png')

"Step 5: Enter input value in input surname"

WebUI.setText(findTestObject('AI-Generated/contactus/Page_contact_us/input_surname'), input_surname)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Enter input value in input surname.png')

"Step 6: Click on input yourEmail"

WebUI.enhancedClick(findTestObject('AI-Generated/contactus/Page_contact_us/input_yourEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on input yourEmail.png')

"Step 7: Enter input value in input yourEmail"

WebUI.setText(findTestObject('AI-Generated/contactus/Page_contact_us/input_yourEmail'), input_yourEmail)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in input yourEmail.png')

"Step 8: Click on input contact"

WebUI.enhancedClick(findTestObject('AI-Generated/contactus/Page_contact_us/input_contact'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on input contact.png')

"Step 9: Enter input value in input contact"

WebUI.setText(findTestObject('AI-Generated/contactus/Page_contact_us/input_contact'), input_contact)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Enter input value in input contact.png')

"Step 10: Click on input companyName"

WebUI.enhancedClick(findTestObject('AI-Generated/contactus/Page_contact_us/input_companyName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on input companyName.png')

"Step 11: Enter input value in input companyName"

WebUI.setText(findTestObject('AI-Generated/contactus/Page_contact_us/input_companyName'), input_companyName)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Enter input value in input companyName.png')

"Step 12: Click on input city"

WebUI.enhancedClick(findTestObject('AI-Generated/contactus/Page_contact_us/input_city'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on input city.png')

"Step 13: Enter input value in input city"

WebUI.setText(findTestObject('AI-Generated/contactus/Page_contact_us/input_city'), input_city)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Enter input value in input city.png')

"Step 14: Click on textarea yourMessage"

WebUI.enhancedClick(findTestObject('AI-Generated/contactus/Page_contact_us/textarea_yourMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on textarea yourMessage.png')

"Step 15: Enter input value in textarea yourMessage"

WebUI.setText(findTestObject('AI-Generated/contactus/Page_contact_us/textarea_yourMessage'), textarea_yourMessage)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Enter input value in textarea yourMessage.png')

"Step 16: Click on input send -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/contactus/Page_contact_us/input_send'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on input send - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Submit Contact Us Form and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}