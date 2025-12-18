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

"Step 2: Click on link events -> Navigate to page '/en/collections/e'"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_en/link_events'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link events - Navigate to page encollectionse.png')

"Step 3: Click on link eventLive -> Navigate to page '/en/events/bruno-mars-live/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_en_collections_e/link_eventLive'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link eventLive - Navigate to page eneventsbruno-mars-live.png')

"Step 4: Click on button bookNow -> Navigate to page '/booking/*/sessions'"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_en_events_bruno_mars_live/button_bookNow'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button bookNow - Navigate to page bookingsessions.png')

"Step 5: Click on button sessionDate -> Navigate to page '/booking/*/tickets'"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_booking_sessions/button_sessionDate'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button sessionDate - Navigate to page bookingtickets.png')

"Step 6: Click on button ticketQuantity (addQuantity)"

// Bind values to the variables in the locators of "AI-Generated/uat/Dynamic Objects/Page_booking_tickets/button_ticketQuantity"
WebUI.enhancedClick(findTestObject('AI-Generated/uat/Dynamic Objects/Page_booking_tickets/button_ticketQuantity', ['button_ticketQuantity_nth_1': button_ticketQuantity_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button ticketQuantity addQuantity.png')

"Step 7: Click on button addTicketQuantity"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_booking_tickets/button_addTicketQuantity'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button addTicketQuantity.png')

"Step 8: Click on button confirm -> Navigate to page '/checkout'"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_booking_tickets/button_confirm'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button confirm - Navigate to page checkout.png')

"Step 9: Click on button checkout -> Navigate to page '/checkout/patron'"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_checkout/button_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button checkout - Navigate to page checkoutpatron.png')

"Step 10: Click on input fullName"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_checkout_patron/input_fullName'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on input fullName.png')

"Step 11: Enter input value in input fullName"

WebUI.setText(findTestObject('AI-Generated/uat/Page_checkout_patron/input_fullName'), input_fullName)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Enter input value in input fullName.png')

"Step 12: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_checkout_patron/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on input email.png')

"Step 13: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/uat/Page_checkout_patron/input_email'), input_email)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Enter input value in input email.png')

"Step 14: Click on input confirmEmail"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_checkout_patron/input_confirmEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on input confirmEmail.png')

"Step 15: Enter input value in input confirmEmail"

WebUI.setText(findTestObject('AI-Generated/uat/Page_checkout_patron/input_confirmEmail'), input_confirmEmail)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Enter input value in input confirmEmail.png')

"Step 16: Click on input phone"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_checkout_patron/input_phone'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on input phone.png')

"Step 17: Enter input value in input phone"

WebUI.setText(findTestObject('AI-Generated/uat/Page_checkout_patron/input_phone'), input_phone)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Enter input value in input phone.png')

"Step 18: Click on div indiaOption"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_checkout_patron/div_indiaOption'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on div indiaOption.png')

"Step 19: Click on input phoneNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_checkout_patron/input_phoneNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on input phoneNumber.png')

"Step 20: Enter input value in input phoneNumber"

WebUI.setText(findTestObject('AI-Generated/uat/Page_checkout_patron/input_phoneNumber'), input_phoneNumber)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Enter input value in input phoneNumber.png')

"Step 21: Click on button confirmDetails -> Navigate to page '/checkout/payment'"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_checkout_patron/button_confirmDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on button confirmDetails - Navigate to page checkoutpayment.png')

"Step 22: Click on link termsAndConditions"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_checkout_payment/link_termsAndConditions'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on link termsAndConditions.png')

"Step 23: Click on button back -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/uat/Page_checkout_payment/button_back'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on button back - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Book Tickets for Live Event and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}