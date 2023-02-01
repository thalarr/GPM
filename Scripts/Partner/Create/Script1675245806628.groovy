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

WebUI.callTestCase(findTestCase('Login/Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/p_Partner'))

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/button_New Partner'))

WebUI.setText(findTestObject('Object Repository/Partner/Create/Page_Project Management/input_Partner Name_store_name'), 
    'Ayu Tingting')

WebUI.setText(findTestObject('Object Repository/Partner/Create/Page_Project Management/input_Partner ID_code'), 'PID002')

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/input_Partner Category_category'))

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/li_On Progress'))

WebUI.setText(findTestObject('Object Repository/Partner/Create/Page_Project Management/input_Name of the Representative_name'), 
    'Partner Kuaci')

WebUI.setText(findTestObject('Object Repository/Partner/Create/Page_Project Management/input_Email_email'), 'ayu@mailinator.com')

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/div_Phone NumberPhone Number'))

WebUI.setText(findTestObject('Object Repository/Partner/Create/Page_Project Management/input_Phone Number_phone'), '089999999999')

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/input_Province_province_id'))

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/li_Kepulauan Riau'))

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/input_City_cities_id'))

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/li_Kabupaten Bintan'))

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/input_Postal Code_postal_code'))

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/li_MANTANG'))

WebUI.setText(findTestObject('Object Repository/Partner/Create/Page_Project Management/input_Address_address'), 'Riau Barat')

WebUI.setText(findTestObject('Object Repository/Partner/Create/Page_Project Management/textarea_oke'), 'oke')

WebUI.click(findTestObject('Object Repository/Partner/Create/Page_Project Management/button_Create New Partner'))

