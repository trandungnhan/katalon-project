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
import pages.*

HomePage homepage = new HomePage()
SearchPage searchpage = new SearchPage()
ShippingPage shippingpage = new ShippingPage()


homepage.verifyWelcomeMgs('Click “Write for us” link in the footer to submit a guest post');
homepage.searchPants();

searchpage.verifySuccessMgs("Search results for: 'pants'")
searchpage.selectFirstItem()
searchpage.selectSecondItem()
searchpage.verifyNumberOfItems("2")
searchpage.selectCheckoutButton()

shippingpage.waitForShippingPageLoad()
shippingpage.clickDropdownOfItems()
shippingpage.viewFirstProductDetails()
shippingpage.verifyFirstProductDetails("Caesar Warm-Up Pant", "32", "Black")
shippingpage.viewSecondProductDetails()
shippingpage.verifySecondProductDetails("Aether Gym Pant", "33", "Brown")


