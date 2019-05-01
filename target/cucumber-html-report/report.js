$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestCase1.feature");
formatter.feature({
  "line": 1,
  "name": "Test search feature",
  "description": "",
  "id": "test-search-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "Test search feature with product name",
  "description": "",
  "id": "test-search-feature;test-search-feature-with-product-name;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open Application url in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"username1\" inserachbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Hit enter key",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should get relevent products",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.openBrowser()"
});
formatter.result({
  "duration": 9860223246,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username1",
      "offset": 13
    }
  ],
  "location": "StepDefination.enterkeyword(String)"
});
formatter.result({
  "duration": 208105284,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.hitEnterKey()"
});
formatter.result({
  "duration": 928065841,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.verifyProducts()"
});
formatter.result({
  "duration": 43028,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Test search feature with product name",
  "description": "",
  "id": "test-search-feature;test-search-feature-with-product-name;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open Application url in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"username2\" inserachbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Hit enter key",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should get relevent products",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.openBrowser()"
});
formatter.result({
  "duration": 9674216751,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username2",
      "offset": 13
    }
  ],
  "location": "StepDefination.enterkeyword(String)"
});
formatter.result({
  "duration": 165106162,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.hitEnterKey()"
});
formatter.result({
  "duration": 1088872011,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.verifyProducts()"
});
formatter.result({
  "duration": 49738,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Test search feature with product name",
  "description": "",
  "id": "test-search-feature;test-search-feature-with-product-name;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open Application url in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"username3\" inserachbox",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Hit enter key",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should get relevent products",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.openBrowser()"
});
formatter.result({
  "duration": 9463388494,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username3",
      "offset": 13
    }
  ],
  "location": "StepDefination.enterkeyword(String)"
});
formatter.result({
  "duration": 203394360,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.hitEnterKey()"
});
formatter.result({
  "duration": 1686346966,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.verifyProducts()"
});
formatter.result({
  "duration": 39870,
  "status": "passed"
});
});