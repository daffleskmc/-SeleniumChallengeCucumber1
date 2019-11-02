package com.sel.cum.stepDefinitions;

import java.util.List;

import com.sel.cum.base.ZCucumberBase;
import com.sel.cum.pages.ZAgentPage;
import com.sel.cum.pages.ZMainPage;
import com.sel.cum.pages.ZResultPage;
import com.sel.cum.pages.ZResultPageChild;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class ZCucumberSteps extends ZCucumberBase {

	ZAgentPage agent;

	ZMainPage main;

	ZResultPage result;

	ZResultPageChild resultChild;

	@Given("^user opens url$")
	public void user_opens_url() throws Throwable {
		initialization();
	}

	@Then("^user inputs location and click submit$")
	public void user_inputs_location_and_click_submit() throws Throwable {
		main = new ZMainPage();
		result = main.searchForSale(props.getProperty("location"));
	}

	@Then("^print price values in descending order$")
	public void print_price_values_in_descending_order() throws Throwable {
		result = new ZResultPage();
		List<String> priceList = result.getPriceListDesc();

		for (String str : priceList) {
			System.out.println(str);
		}
	}

	@Then("^user select fifth property$")
	public void user_select_fifth_property() throws Throwable {
		result = new ZResultPage();
		resultChild = result.getPriceList5th(5);
	}

	@Then("^click link to agent page$")
	public void click_link_to_agent_page() throws Throwable {

		String logo1 = resultChild.getAgentLogo();
		String agentName1 = resultChild.getAgentName();

		agent = resultChild.goToAgentPage();

		String logo2 = agent.getAgentLogo();
		String agentName2 = agent.getAgentName();

		Assert.assertEquals(logo1, logo2);
		Assert.assertEquals(agentName1, agentName2);
	}

	// @Then("^check if agent details are correct$")
	// public void check_if_agent_details_are_correct() throws Throwable {
	// Assert.assertEquals(resultChild.getAgentLogo(), agent.getAgentLogo());
	// Assert.assertEquals(resultChild.getAgentName(), agent.getAgentName());
	// }

}
