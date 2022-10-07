package com.testvagrant.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.testvagrant.base.BaseClass;
import com.testvagrant.pageobjects.HomePageImdb;
import com.testvagrant.pageobjects.HomePageWiki;

public class TestPage extends BaseClass {
	
	HomePageImdb homepageimdb;
	HomePageWiki homepagewiki;
	
	
	@Test
	public void validateReleaseDate() throws InterruptedException
	{
		
		luanchApp("https://www.imdb.com/title/tt9389998/");
		homepageimdb= new HomePageImdb();
		String dateofimdb = homepageimdb.validateReleaseDateimdb();
		luanchApp("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		homepagewiki= new HomePageWiki();
		String dateofwiki = homepagewiki.validateReleaseDateWiki();
		Assert.assertEquals(dateofimdb, dateofwiki);
		closeBrowser();
	}
	
	@Test
	public void validateCountry() throws InterruptedException
	{
		luanchApp("https://www.imdb.com/title/tt9389998/");
		homepageimdb= new HomePageImdb();
		String countryofimdb = homepageimdb.validateCountryimdb();
		luanchApp("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		homepagewiki= new HomePageWiki();
		String countryofwiki = homepagewiki.validateCountryWiki();
		Assert.assertEquals(countryofimdb, countryofwiki);	
	}
	
	
}
