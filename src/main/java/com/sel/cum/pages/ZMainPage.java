package com.sel.cum.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sel.cum.base.ZCucumberBase;

public class ZMainPage extends ZCucumberBase {

	@FindBy(id = "search-input-location")
	WebElement searchFld1;

	public ZMainPage() {
		PageFactory.initElements(driver, this);
	}

	public ZResultPage searchForSale(String location) {
		searchFld1.sendKeys(location);
		searchFld1.sendKeys(Keys.ENTER);

		return new ZResultPage();
	}

}
