$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/indeztruk/eclipse-workspace/SeleniumChallengeCucumber1/src/main/java/com/sel/cum/features/zoopla.feature");
formatter.feature({
  "line": 1,
  "name": "Search Properties Feature",
  "description": "",
  "id": "search-properties-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search Properties Scenario",
  "description": "",
  "id": "search-properties-feature;search-properties-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user inputs location and click submit",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "print price values in descending order",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user select fifth property",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click link to agent page",
  "keyword": "Then "
});
formatter.match({
  "location": "ZCucumberSteps.user_opens_url()"
});
formatter.result({
  "duration": 16993555101,
  "status": "passed"
});
formatter.match({
  "location": "ZCucumberSteps.user_inputs_location_and_click_submit()"
});
formatter.result({
  "duration": 2784503599,
  "status": "passed"
});
formatter.match({
  "location": "ZCucumberSteps.print_price_values_in_descending_order()"
});
formatter.result({
  "duration": 1372480001,
  "status": "passed"
});
formatter.match({
  "location": "ZCucumberSteps.user_select_fifth_property()"
});
formatter.result({
  "duration": 1292662000,
  "status": "passed"
});
formatter.match({
  "location": "ZCucumberSteps.click_link_to_agent_page()"
});
formatter.result({
  "duration": 2469486200,
  "status": "passed"
});
});