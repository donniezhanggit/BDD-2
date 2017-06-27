$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "abc",
  "description": "",
  "id": "abc",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "I login with valid credential",
  "description": "",
  "id": "abc;i-login-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to flipkart site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter email id",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enter password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeStep.goToSite()"
});
formatter.result({
  "duration": 47936300463,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat Automation.pom.Home.clickOnLoginTxt(Home.java:35)\r\n\tat StepDefination.HomeStep.goToSite(HomeStep.java:28)\r\n\tat ✽.Given I navigate to flipkart site(Login.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomeStep.clickSignInButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomeStep.enterEmailID()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomeStep.enterPassword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomeStep.clickLogInInButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomeStep.closeBrowser()"
});
formatter.result({
  "status": "skipped"
});
});