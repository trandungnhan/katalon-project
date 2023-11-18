package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import common.Utils

public class HomePage {

	String welcomeMgsObj = 'Object Repository/The Magento Objects/Page_Home page/message_Welcome'
	String searchTxbObj =  'Object Repository/The Magento Objects/Page_Home page/textbox_Search'
	String themagentoUrl = 'https://magento.softwaretestingboard.com/'


	Utils utils = new Utils()

	def openTheMangenToPage() {
		utils.visit(themagentoUrl)
		utils.maximize()
	}

	def searchPants() {
		utils.sendText(searchTxbObj,"pants")
		utils.enter(searchTxbObj)
	}

	def verifyWelcomeMgs(expectedMgs) {
		utils.waitForPageLoad(15)
		utils.waitForVisible(welcomeMgsObj, 10)
		utils.verifyText(welcomeMgsObj, expectedMgs)
	}
}
