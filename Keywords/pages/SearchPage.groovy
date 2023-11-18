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

public class SearchPage {

	String firstItemObj = 'Object Repository/The Magento Objects/Page_Search page/First Item/item_First item'
	String firstItemSizeObj = 'Object Repository/The Magento Objects/Page_Search page/First Item/size_First item'
	String firstItemColorObj = 'Object Repository/The Magento Objects/Page_Search page/First Item/color_First item'
	String addFirstItemBtnObj = 'Object Repository/The Magento Objects/Page_Search page/First Item/button_Add to cart_First item'

	String secondItemObj = 'Object Repository/The Magento Objects/Page_Search page/Second Item/item_Second item'
	String secondItemSizeObj = 'Object Repository/The Magento Objects/Page_Search page/Second Item/size_Second item'
	String secondItemColorObj = 'Object Repository/The Magento Objects/Page_Search page/Second Item/color_Second item'
	String addSecondItemBtnObj = 'Object Repository/The Magento Objects/Page_Search page/Second Item/button_Add to cart_Second item'

	String cartIconObj = 'Object Repository/The Magento Objects/Page_Search page/icon_Cart'
	String checkoutBtnObj = 'Object Repository/The Magento Objects/Page_Search page/button_Checkout'
	String searchMgsObj = 'Object Repository/The Magento Objects/Page_Search page/message_Search'
	String numberOfItemObj = 'Object Repository/The Magento Objects/Page_Search page/counter_Numer of items'

	Utils utils = new Utils()

	def getSearchMgs() {
		return utils.getText('Object Repository/The Magento Objects/Page_Search page/message_Search')
	}

	def selectFirstItem() {
		utils.scrollToView(firstItemObj)
		utils.hover(firstItemObj)
		utils.click(firstItemSizeObj)
		utils.click(firstItemColorObj)
		utils.click(addFirstItemBtnObj)
	}

	def selectSecondItem() {
		utils.scrollToView(secondItemObj)
		utils.hover(secondItemObj)
		utils.click(secondItemSizeObj)
		utils.click(secondItemColorObj)
		utils.click(addSecondItemBtnObj)
	}

	def selectCheckoutButton() {
		utils.scrollToView(cartIconObj)
		utils.click(cartIconObj)
		utils.click(checkoutBtnObj)
	}

	def verifySuccessMgs(successMgs) {
		return utils.verifyText(searchMgsObj, successMgs)
	}

	def verifyNumberOfItems(number) {
		utils.scrollToView(cartIconObj)
		return utils.verifyText(numberOfItemObj, number)
	}
}