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

CustomKeywords.'com.kt.oasis.MenuInstruct.enterModule'(['//div[@class=\'el-submenu__title\']/descendant::span[text()=\'系统配置\']'
        , '//li[@class=\'el-menu-item el-tooltip item\']/descendant::span[text()=\'导入模板配置\']'])

'点击新建按钮'
WebUI.click(findTestObject('CommonElement/btn_add'))

'设置导入模板编号'
WebUI.setText(findTestObject('ImportTemplateConfig/input_importTempNum'), importTempNum)

'设置导入模板名称'
WebUI.setText(findTestObject('ImportTemplateConfig/input_imortTempName'), importTempName)

'点击业务实体放大镜'
WebUI.click(findTestObject('ImportTemplateConfig/i_search_icon'))

'输入主表名'
WebUI.setText(findTestObject('ImportTemplateConfig/input_popups_searchField'), 'TZ_POSITION')

'点击搜索按钮'
WebUI.click(findTestObject('ImportTemplateConfig/i_popups_searchBtn'))

'点击搜索记录添加'
WebUI.click(findTestObject('ImportTemplateConfig/span_selectRecord'))

//'点击上传按钮'
//WebUI.click(findTestObject('ImportTemplateConfig/button_upload'))
'上传文件'
CustomKeywords.'com.kt.oasis.UploadInstruct.upload'(uploadBtnRepository, uploadFilePathList)

'点击保存按钮'
WebUI.click(findTestObject('ImportTemplateConfig/button_save'))

