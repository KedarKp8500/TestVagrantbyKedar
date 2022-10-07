package com.testvagrant.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testvagrant.base.BaseClass;

public class HomePageWiki extends BaseClass
{
	
	@FindBy(xpath = "(//div[@class='plainlist'])[4]") WebElement releasedatewiki ;
	@FindBy(xpath="(//td[@class='infobox-data'])[12]") WebElement countrywiki;

	public HomePageWiki()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateReleaseDateWiki()
	{	
		
		String dateofwiki=releasedatewiki.getText();
		return dateofwiki;
	}
	public String validateCountryWiki()
	{
		String countryofwiki = countrywiki.getText();
		return countryofwiki;
	}
}
