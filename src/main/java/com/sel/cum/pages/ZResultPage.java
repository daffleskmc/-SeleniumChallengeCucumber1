package com.sel.cum.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sel.cum.base.ZCucumberBase;
import com.sel.cum.util.ZCucumberUtil;

public class ZResultPage extends ZCucumberBase {

	@FindBy(xpath = "//a[@class='listing-results-price text-price']")
	List<WebElement> priceList;

	public ZResultPage() {
		PageFactory.initElements(driver, this);
		ZCucumberUtil.waitForPageLoad(driver, priceList);
	}

	public List<String> getPriceListDesc() {
		List<String> list = new ArrayList<String>();
		String str = "";
		for (WebElement e : priceList) {

			str = e.getText().replaceAll("\\D+", "");
			list.add(str);
			// System.out.println(str);
		}

		Collections.sort(list, Collections.reverseOrder());
		return list;
	}

	public ZResultPageChild getPriceList5th(int cnt) {
		WebElement e5 = priceList.get(cnt);
		// UtilPage.moveElementToView(driver, e5);
		Actions action = new Actions(driver);
		action.moveToElement(e5).click().perform();

		return new ZResultPageChild();
	}
}
