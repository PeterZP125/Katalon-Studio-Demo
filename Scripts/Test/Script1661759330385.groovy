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

WebUI.callTestCase(findTestCase('登录/Login'), [('username') : 'admin', ('password') : 'Admin@12345', ('menuNameXPaths') : [
            '//li[@class=\'el-submenu\']/descendant::span[text()=\'系统配置\']', '//li[@class=\'el-menu-item el-tooltip item\']/descendant::span[text()=\'导入模板配置\']']], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('导入模板/ImportTemplateConfig'), [('importTempNum') : 'num02', ('importTempName') : 'name02'
        , ('uploadBtnRepository') : 'Object Repository/ImportTemplateConfig/button_upload', ('uploadFilePathList') : ['C:\\Users\\AdminZP\\Desktop\\日志.xlsx']], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('导入模板/配置模板字段/ConfigureTemplateField'), [('searchBtnRepositoryId') : 'Object Repository/ConfigureTemplateField/btn_query'
        , ('searchInputRepositoryIdList') : ['Object Repository/ConfigureTemplateField/btn_query_inputTemplateFieldName']
        , ('searchConfirmBtnRepositoryId') : 'Object Repository/ConfigureTemplateField/btn_query_query', ('searchTextList') : ['BuId']], 
    FailureHandling.STOP_ON_FAILURE)

