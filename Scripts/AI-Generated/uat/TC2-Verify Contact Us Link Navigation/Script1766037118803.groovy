import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.uat.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1512, 748)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /en"

TrueTestScripts.navigate("en")

"Step 2: Click on link contactUs -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_en/link_contactUs'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link contactUs - Navigate to page .png')

"Step 3: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Contact Us Link Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}