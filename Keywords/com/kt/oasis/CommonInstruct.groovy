package com.kt.oasis

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

import internal.GlobalVariable

//自定义导入
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory

/**
 * 通用指令
 * */
public class CommonInstruct {

	WebDriver driver = DriverFactory.getWebDriver()

	/**
	 * 在搜索弹框中输入指定搜索字段查找数据
	 * @param	searchBtnRepositoryId:搜索按钮id
	 * 			searchInputRepositoryId:查找input框id
	 * 			searchConfirmBtnRepositoryId:搜索按钮id
	 * 			searchText:搜索文本
	 * */
	@Keyword(keywordObject="searchByPopupsWithFields")
	void searchByPopupsWithFields(String searchBtnRepositoryId, List<TestObject> searchInputRepositoryIdList,
			String searchConfirmBtnRepositoryId, List<String> searchTextList) {
		//todo:校验searchInputRepositoryId数量=searchText数量
		WebUI.click(findTestObject(searchBtnRepositoryId))
		println 'aaaaaaaaaaaaaaa'
		for(int i = 0; i < searchInputRepositoryIdList.size(); i++) {
			println 'nbbbbbbbbbbbbbbb'
			WebUI.setText(findTestObject(searchInputRepositoryIdList.get(i)), searchTextList.get(i))
		}
		WebUI.click(findTestObject(searchConfirmBtnRepositoryId))
	}
}