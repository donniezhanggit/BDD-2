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
  "location": "LoginStep.goToSite()"
});
formatter.result({
  "duration": 22784488691,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clickSignInButton()"
});
formatter.result({
  "duration": 591817684,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enterEmailId()"
});
formatter.result({
  "duration": 308707662,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.enterPassword()"
});
formatter.result({
  "duration": 187187631,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clickLogInInButton()"
});
formatter.result({
  "duration": 2544619595,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.closeBrowser()"
});
formatter.result({
  "duration": 3571192287,
  "status": "passed"
});
});