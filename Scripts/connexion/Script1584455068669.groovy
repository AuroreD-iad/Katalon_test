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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://preprod.iadfrance.fr/')

WebUI.click(findTestObject('site_web_test/Page_iad - Vente achat location maison appa_3091d3/span_Se connecter'))

WebUI.click(findTestObject('site_web_test/Page_iad - Vente achat location maison appa_3091d3/input_Crer un compte__username'))

WebUI.click(findTestObject('site_web_test/Page_iad - Vente achat location maison appa_3091d3/input_Crer un compte__username'))

WebUI.click(findTestObject('site_web_test/Page_iad - Vente achat location maison appa_3091d3/div_Se connecter            Crer un compte _049f0e'))

WebUI.click(findTestObject('site_web_test/Page_iad - Vente achat location maison appa_3091d3/a_PRESTIGE'))

WebUI.click(findTestObject('site_web_test/Page_iad - Vente achat location maison appa_3091d3/a_Vendre'))

WebUI.closeBrowser()

