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

'打开浏览器'
WebUI.openBrowser('')

'最大化浏览器窗口'
WebUI.maximizeWindow()

'输入网址'
WebUI.navigateToUrl('http://192.168.1.235/#/login?redirect=%2Fdashboard')

'输入用户名'
WebUI.setText(findTestObject('Object Repository/Login/input_Tranzvision Oasis_username'), username)

'输入密码'
WebUI.setText(findTestObject('Object Repository/Login/input_Tranzvision Oasis_password'), password)

'点击登录'
WebUI.click(findTestObject('Login/button_login'))

'进入模块'
CustomKeywords.'com.kt.oasis.MenuInstruct.enterModule'(menuNameXPaths)

