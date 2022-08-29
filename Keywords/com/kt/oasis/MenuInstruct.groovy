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
 * 菜单指令集
 * */
public class MenuInstruct {

	WebDriver driver = DriverFactory.getWebDriver()

	/**
	 * 进入指定菜单
	 * @param menuPath:菜单名称[主菜单, 子菜单1, 子菜单2, ...]
	 * */
	@Keyword(keywordObject="menu")
	def enterModule(List<String> menuNameXPaths) {
		if(menuNameXPaths.size != 0) {
			for(menuNameXPath in menuNameXPaths) {
				driver.findElement(By.xpath(menuNameXPath)).click()
				Thread.sleep(500)
			}
		}
	}
}
