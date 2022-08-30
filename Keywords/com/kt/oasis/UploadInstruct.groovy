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
 * 上传指令集
 * */
public class UploadInstruct {

	WebDriver driver = DriverFactory.getWebDriver()

	/**
	 *  上传文件
	 * @param	btnXpath: 按钮XPath定位
	 * 			filePathList:文件路径列表
	 * 			single:默认传输多个文件
	 * */
	@Keyword(keywordObject="uploadFile")
	void upload(String uploadBtnRepository, List<String> filePathList, single = false) {
		if(single) {
			WebUI.uploadFile(findTestObject(uploadBtnRepository), filePathList.get(0))
		}else {
			for(filePath in filePathList) {
				WebUI.uploadFile(findTestObject(uploadBtnRepository), filePath)
			}
		}
	}
}
