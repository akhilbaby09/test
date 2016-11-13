package testcase;

import org.testng.annotations.DataProvider;

//import org.junit.runner.RunWith;
//import cucumber.api.junit.Cucumber:

import org.testng.annotations.Test;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;

import datahandler.ReadfromExcel;
import testObjects.SearchObjects;

import com.relevantcodes.extentreports.LogStatus;

import base.Confbase;

public class Search extends Confbase {

	SearchObjects s = new SearchObjects();
	ReadfromExcel Read = new ReadfromExcel();
	

	//@Test(dataProvider = "testdata")
	//public void BIBO(String username, double pass) throws InterruptedException, IOException
	public void BIBO() throws InterruptedException, IOException

	{

		//test.log(LogStatus.INFO, "Username --   " + username);
	//	test.log(LogStatus.INFO, "Password --   " + pass);
		
	System.out.println("BIBO");
		
		//if sucess
	/*	int rows = Read.getrowno("search");
		   for (int i = 0; i < rows; i++) {
			Read.Setvalue("search", i, 4);
			  }*/
	}

	/*@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() throws IOException {

		int rows = Read.getrowno("search");
		Object[][] data = new Object[rows][2];

		for (int i = 0; i < rows; i++) {
			data[i][0] = Read.getStringCellValue("search", i, 0);
			data[i][1] = Read.getNumericCellValue("search", i, 2);
		}
		return data;
	}*/

	//@Test

	public void second() throws InterruptedException {

		System.out.println("second");
		driver.findElement(By.id("start-date")).click();
		Thread.sleep(3000);
	}

	//@Test

	public void third() throws InterruptedException {

		System.out.println("third");
		driver.findElement(By.id("ddd")).click();
		Thread.sleep(2000);
	}

}