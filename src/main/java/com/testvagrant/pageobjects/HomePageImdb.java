package com.testvagrant.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testvagrant.base.BaseClass;

public class HomePageImdb extends BaseClass {
	
	@FindBy(xpath = "(//div[@class='ipc-metadata-list-item__content-container'])[17]") WebElement releasedateimdb ;
	@FindBy(xpath="(//div[@class='ipc-metadata-list-item__content-container'])[18]") WebElement countryimdb;
		
	
	
	public HomePageImdb()
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateReleaseDateimdb()
	{
		
		String dateofimdb=releasedateimdb.getText();
		return dateofimdb;
	}
	
	public String validateCountryimdb()
	{
		String countryofimdb= countryimdb.getText();
		return countryofimdb;
	}
	
}
