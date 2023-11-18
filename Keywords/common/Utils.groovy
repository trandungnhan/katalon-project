package common
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.assertj.core.internal.bytebuddy.asm.Advice.Return

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
import org.openqa.selenium.Keys as Keys

import internal.GlobalVariable

public class Utils {

	def visit(url) {
		return WebUI.openBrowser(url)
	}

	def maximize() {
		return WebUI.maximizeWindow()
	}

	def waitForPageLoad(time) {
		return WebUI.waitForPageLoad(time)
	}

	def click(element) {
		return WebUI.click(findTestObject(element))
	}

	def scrollToView(element) {
		return WebUI.scrollToElement(findTestObject(element), 3)
	}

	def hover(element) {
		return WebUI.mouseOver(findTestObject(element))
	}

	def sendText(element, text) {
		return WebUI.setText(findTestObject(element), text)
	}

	def getText(element) {
		return WebUI.getText(findTestObject(element))
	}

	def enter(element) {
		return WebUI.sendKeys(findTestObject(element), Keys.chord(Keys.ENTER))
	}

	def selectOptionByLabel(element, label) {
		return WebUI.selectOptionByLabel(findTestObject(element), label, false)
	}

	def verifyText(element, text) {
		return WebUI.verifyElementText(findTestObject(element), text)
	}

	def waitForVisible(element, timeout) {
		return WebUI.waitForElementVisible(findTestObject(element), timeout)
	}

	def waitForNotVisible(element, timeout) {
		return WebUI.waitForElementNotVisible(element, timeout)
	}

	def waitForNotPresent(element, timeout) {
		return WebUI.waitForElementNotPresent(element, timeout)
	}


	def waitForClickable(element, timeout) {
		return WebUI.waitForElementClickable(findTestObject(element), timeout)
	}

	def closeBrowser() {
		return WebUI.closeBrowser()
	}
}
