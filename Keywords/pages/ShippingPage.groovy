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


public class ShippingPage {

	String checkoutPageLoadingObj = 'Object Repository/The Magento Objects/Page_Shipping Page/page_Checkout loader'
	String dropdownOfItemsActiveObj = 'Object Repository/The Magento Objects/Page_Shipping Page/dropdown_items in cart active'
	String dropdownOfItemsObj = 'Object Repository/The Magento Objects/Page_Shipping Page/dropdown_items in cart'

	String firstProductDetailsObj = 'Object Repository/The Magento Objects/Page_Shipping Page/First Product/toggle_View first_product details'
	String firstProductNameObj = 'Object Repository/The Magento Objects/Page_Shipping Page/First Product/name_First product'
	String firstProductSizeObj = 'Object Repository/The Magento Objects/Page_Shipping Page/First Product/size_First product'
	String firstProductColorObj = 'Object Repository/The Magento Objects/Page_Shipping Page/First Product/color_First product'

	String secondProductDetailsObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Second Product/toggle_View second_product details'
	String secondProductNameObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Second Product/name_Second product'
	String secondProductSizeObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Second Product/size_Second product'
	String secondProductColorObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Second Product/color_Second product'

	String emailObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/textbox_Email'
	String firstNameObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/textbox_Firstname'
	String lastNameObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/textbox_Lastname'
	String companyObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/textbox_Company'
	String streetObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/textbox_Street'
	String cityObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/textbox_City'
	String postcodeObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/textbox_Postcode'
	String telephoneObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/textbox_Telephone'
	String regionObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/dropdownlist_Region'
	String countryObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/dropdownlist_Country'
	String flatRateObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/radio_Flat rate'
	String bestWayObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/radio_Best way'
	String nextBtnObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/button_Next'
	String totalPriceObj = 'Object Repository/The Magento Objects/Page_Shipping Page/Shipping Address/amount_Order total price'


	Utils utils = new Utils()

	def waitForShippingPageLoad() {
		utils.waitForPageLoad(15)
	}

	def clickDropdownOfItems() {
		if (utils.waitForVisible(dropdownOfItemsActiveObj, 10) == false) {
			utils.click(dropdownOfItemsObj)
		}
	}

	def viewFirstProductDetails() {
		utils.click(firstProductDetailsObj)
	}

	def viewSecondProductDetails() {
		utils.click(secondProductDetailsObj)
	}

	def verifyFirstProductDetails(name, size, color) {
		utils.verifyText(firstProductNameObj, name)
		utils.verifyText(firstProductSizeObj, size)
		utils.verifyText(firstProductColorObj, color)
	}

	def verifySecondProductDetails(name, size, color) {
		utils.verifyText(secondProductNameObj, name)
		utils.verifyText(secondProductSizeObj, size)
		utils.verifyText(secondProductColorObj, color)
	}

	def selectShippingAddress(email, firstName, lastName, company, street, city, postcode, telephone, region, country) {
		utils.sendText(emailObj, email)
		utils.sendText(firstNameObj, firstName)
		utils.sendText(lastNameObj, lastName)
		utils.sendText(companyObj, company)
		utils.sendText(streetObj, street)
		utils.sendText(cityObj, city)
		utils.sendText(postcodeObj, postcode)
		utils.sendText(telephoneObj, telephone)
		utils.selectOptionByLabel(regionObj, region)
		utils.selectOptionByLabel(countryObj, country)
	}

	def selectShippingMethod(method) {
		switch(method) {
			case "flat rate":
				utils.click(flatRateObj)
				break
			case "best way":
				utils.click(bestWayObj)
				break
		}
	}

	def clickNextBtn() {
		utils.click(nextBtnObj)
	}

	def verifyOrderTotalPrice(amount) {
		utils.verifyText(totalPriceObj, amount)
	}
}
