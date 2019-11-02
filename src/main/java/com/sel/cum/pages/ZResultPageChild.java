package com.sel.cum.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sel.cum.base.ZCucumberBase;
import com.sel.cum.util.ZCucumberUtil;

public class ZResultPageChild extends ZCucumberBase {

	@FindBy(xpath = "//div[@class='dp-sidebar-wrapper__contact']//h4[@class='ui-agent__name']")
	WebElement agentName;

	@FindBy(xpath = "//div[@class='dp-sidebar-wrapper__contact']//img[@class='js-lazy-loaded']")
	WebElement agentLogo;

	@FindBy(xpath = "//div[@class='dp-sidebar-wrapper__contact']//a[@class='ui-link']")
	WebElement agentNum;

	public ZResultPageChild() {
		PageFactory.initElements(driver, this);
	}

	public String getAgentName() {
		ZCucumberUtil.waitForElementToBeVisible(driver, agentName);
		return agentName.getText();
	}

	public String getAgentLogo() {
		ZCucumberUtil.waitForElementToBeVisible(driver, agentLogo);
		return agentLogo.getAttribute("src");
	}

	public String getAgentNum() {
		ZCucumberUtil.waitForElementToBeVisible(driver, agentNum);
		return agentNum.getText();
	}

	public ZAgentPage goToAgentPage() {
		agentName.click();
		return new ZAgentPage();
	}
}
