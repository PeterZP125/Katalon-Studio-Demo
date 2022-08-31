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

'点击‘加载本BE字段’'
WebUI.click(findTestObject('ConfigureTemplateField/btn_loadCurrBEField'))

'点击‘加载外键字段’'
WebUI.click(findTestObject('ConfigureTemplateField/btn_loadForeignKeyField'))

'点击全选\r\n'
WebUI.click(findTestObject('ConfigureTemplateField/btn_loadForeignKeyField_selectAll'))

'点击确定'
WebUI.click(findTestObject('ConfigureTemplateField/btn_loadForeignKeyField_confirm'))

'点击关闭按钮'
WebUI.click(findTestObject('ConfigureTemplateField/btn_loadForeignKeyField_close'))

'查询目标字段'
CustomKeywords.'com.kt.oasis.CommonInstruct.searchByPopupsWithFields'(searchBtnRepositoryId, searchInputRepositoryIdList, 
    searchConfirmBtnRepositoryId, searchTextList)

'点击目标字段的修改按钮\r\n'
WebUI.click(findTestObject('ConfigureTemplateField/btn_record_edit'))

