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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kitchenplaza.com.my/')

ass = findTestObject('Object Repository/Page_Kitchen Plaza  Authentic Kitchenware/a_Cookware')

kong = ass.properties

print(kong)

WebUI.mouseOver(findTestObject('Page_Kitchen Plaza  Authentic Kitchenware/div_All departments'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Kitchen Plaza  Authentic Kitchenware/a_Shop by Brands'))

WebUI.click(findTestObject('Page_Shop by Brands  Kitchen Plaza/a_Corelle'))

WebUI.click(findTestObject('Object Repository/Page_Corelle  Kitchen Plaza/span_Filter by price_ui-slider-handle ui-co_0ae57b'))

WebUI.click(findTestObject('Page_Corelle  Kitchen Plaza/div_FilterPrice RM510  RM550'))

WebUI.click(findTestObject('Object Repository/Page_Corelle  Kitchen Plaza/button_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Corelle  Kitchen Plaza/span_Return To Shop'))

WebUI.click(findTestObject('Object Repository/Page_Products  Kitchen Plaza/div_HomeShopBlogAbout usContact us Login  0_049336'))

WebUI.getText(findTestObject('Page_Kitchen Plaza  Authentic Kitchenware/a_Cookware'))

WebUI.click(findTestObject('Page_Kitchen Plaza  Authentic Kitchenware/a_Cookware'))

WebUI.getText(findTestObject('Page_Kitchen Plaza  Authentic Kitchenware/a_Food Storage'))

WebUI.click(findTestObject('Page_Kitchen Plaza  Authentic Kitchenware/a_Food Storage'))

WebUI.getText(findTestObject('Page_Kitchen Plaza  Authentic Kitchenware/a_Kitchen Tools'))

WebUI.click(findTestObject('Page_Kitchen Plaza  Authentic Kitchenware/a_Kitchen Tools'))

WebUI.getText(findTestObject('Page_Kitchen Plaza  Authentic Kitchenware/a_Knife  Tools'))

WebUI.click(findTestObject('Page_Kitchen Plaza  Authentic Kitchenware/a_Knife  Tools'))

WebUI.getText(findTestObject('Page_Kitchen Plaza  Authentic Kitchenware/a_Tableware'))

WebUI.click(findTestObject('Page_Kitchen Plaza  Authentic Kitchenware/a_Tableware'))

