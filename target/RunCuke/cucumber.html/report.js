$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Shopping.feature");
formatter.feature({
  "line": 2,
  "name": "Acceptance Testing to validate the user login and shopping cart functionality",
  "description": "",
  "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TestCafeExample"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Validate the Test Cafe Example page",
  "description": "",
  "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user is on the home page \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the \"SignIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user enters the \"emailaddress\" under \"\u003cemailaddress\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user enters the \"password\" under \"\u003cpassword\u003e\" field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user clicks on the \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user should see the corresponding \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;",
  "rows": [
    {
      "cells": [
        "emailaddress",
        "password",
        "message"
      ],
      "line": 14,
      "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;1"
    },
    {
      "cells": [
        "mskumar0918@gmail.com",
        "Helloworld1234",
        "Successful"
      ],
      "line": 15,
      "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;2"
    },
    {
      "cells": [
        "mskumar0918@gmail.com",
        "Helloworld12345",
        "InvalidPassword"
      ],
      "line": 16,
      "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;3"
    },
    {
      "cells": [
        "mskumar09181@gmail.com",
        "Helloworld12345",
        "InvalidEmail"
      ],
      "line": 17,
      "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;4"
    },
    {
      "cells": [
        "mskumar0918@gmail.com",
        "",
        "BlankPassword"
      ],
      "line": 18,
      "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;5"
    },
    {
      "cells": [
        "",
        "Helloworld12345",
        "BlankEmail"
      ],
      "line": 19,
      "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;6"
    },
    {
      "cells": [
        "mskumar09181@gmail.com",
        "Helloworld12345",
        "InvalidDetails"
      ],
      "line": 20,
      "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;7"
    },
    {
      "cells": [
        "",
        "",
        "BlankDetails"
      ],
      "line": 21,
      "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3042404151,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Validate the Test Cafe Example page",
  "description": "",
  "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestCafeExample"
    },
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user is on the home page \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the \"SignIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user enters the \"emailaddress\" under \"mskumar0918@gmail.com\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user enters the \"password\" under \"Helloworld1234\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user clicks on the \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user should see the corresponding \"Successful\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 30
    }
  ],
  "location": "AutomationPracticeSteps.theUserIsOnTheHomePage(String)"
});
formatter.result({
  "duration": 6900721029,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignIn",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 1781916807,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emailaddress",
      "offset": 21
    },
    {
      "val": "mskumar0918@gmail.com",
      "offset": 42
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 165618121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 21
    },
    {
      "val": "Helloworld1234",
      "offset": 38
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 152909440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 1640644410,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successful",
      "offset": 39
    }
  ],
  "location": "AutomationPracticeSteps.theUserShouldSeeTheCorresponding(String)"
});
formatter.result({
  "duration": 91306,
  "status": "passed"
});
formatter.after({
  "duration": 169964102,
  "status": "passed"
});
formatter.before({
  "duration": 2014950243,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Validate the Test Cafe Example page",
  "description": "",
  "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestCafeExample"
    },
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user is on the home page \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the \"SignIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user enters the \"emailaddress\" under \"mskumar0918@gmail.com\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user enters the \"password\" under \"Helloworld12345\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user clicks on the \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user should see the corresponding \"InvalidPassword\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 30
    }
  ],
  "location": "AutomationPracticeSteps.theUserIsOnTheHomePage(String)"
});
formatter.result({
  "duration": 7071222342,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignIn",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 2235883508,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emailaddress",
      "offset": 21
    },
    {
      "val": "mskumar0918@gmail.com",
      "offset": 42
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 164362750,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 21
    },
    {
      "val": "Helloworld12345",
      "offset": 38
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 131283726,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 1161831089,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "InvalidPassword",
      "offset": 39
    }
  ],
  "location": "AutomationPracticeSteps.theUserShouldSeeTheCorresponding(String)"
});
formatter.result({
  "duration": 38691911,
  "status": "passed"
});
formatter.after({
  "duration": 274616813,
  "status": "passed"
});
formatter.before({
  "duration": 1462900890,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validate the Test Cafe Example page",
  "description": "",
  "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestCafeExample"
    },
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user is on the home page \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the \"SignIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user enters the \"emailaddress\" under \"mskumar09181@gmail.com\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user enters the \"password\" under \"Helloworld12345\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user clicks on the \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user should see the corresponding \"InvalidEmail\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 30
    }
  ],
  "location": "AutomationPracticeSteps.theUserIsOnTheHomePage(String)"
});
formatter.result({
  "duration": 6842278935,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignIn",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 1782430605,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emailaddress",
      "offset": 21
    },
    {
      "val": "mskumar09181@gmail.com",
      "offset": 42
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 161898201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 21
    },
    {
      "val": "Helloworld12345",
      "offset": 38
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 133615872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 809312801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "InvalidEmail",
      "offset": 39
    }
  ],
  "location": "AutomationPracticeSteps.theUserShouldSeeTheCorresponding(String)"
});
formatter.result({
  "duration": 31390008,
  "status": "passed"
});
formatter.after({
  "duration": 135443667,
  "status": "passed"
});
formatter.before({
  "duration": 1341246865,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Validate the Test Cafe Example page",
  "description": "",
  "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestCafeExample"
    },
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user is on the home page \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the \"SignIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user enters the \"emailaddress\" under \"mskumar0918@gmail.com\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user enters the \"password\" under \"\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user clicks on the \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user should see the corresponding \"BlankPassword\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 30
    }
  ],
  "location": "AutomationPracticeSteps.theUserIsOnTheHomePage(String)"
});
formatter.result({
  "duration": 7032557328,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignIn",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 2185172849,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emailaddress",
      "offset": 21
    },
    {
      "val": "mskumar0918@gmail.com",
      "offset": 42
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 154124187,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 21
    },
    {
      "val": "",
      "offset": 38
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 59983383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 1186952925,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BlankPassword",
      "offset": 39
    }
  ],
  "location": "AutomationPracticeSteps.theUserShouldSeeTheCorresponding(String)"
});
formatter.result({
  "duration": 35354693,
  "status": "passed"
});
formatter.after({
  "duration": 157871884,
  "status": "passed"
});
formatter.before({
  "duration": 1347397375,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Validate the Test Cafe Example page",
  "description": "",
  "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestCafeExample"
    },
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user is on the home page \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the \"SignIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user enters the \"emailaddress\" under \"\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user enters the \"password\" under \"Helloworld12345\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user clicks on the \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user should see the corresponding \"BlankEmail\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 30
    }
  ],
  "location": "AutomationPracticeSteps.theUserIsOnTheHomePage(String)"
});
formatter.result({
  "duration": 7258292585,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignIn",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 2072955026,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emailaddress",
      "offset": 21
    },
    {
      "val": "",
      "offset": 42
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 62762791,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 21
    },
    {
      "val": "Helloworld12345",
      "offset": 38
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 139940867,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 1297065660,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BlankEmail",
      "offset": 39
    }
  ],
  "location": "AutomationPracticeSteps.theUserShouldSeeTheCorresponding(String)"
});
formatter.result({
  "duration": 37774221,
  "status": "passed"
});
formatter.after({
  "duration": 139691649,
  "status": "passed"
});
formatter.before({
  "duration": 1294323831,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Validate the Test Cafe Example page",
  "description": "",
  "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestCafeExample"
    },
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user is on the home page \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the \"SignIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user enters the \"emailaddress\" under \"mskumar09181@gmail.com\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user enters the \"password\" under \"Helloworld12345\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user clicks on the \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user should see the corresponding \"InvalidDetails\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 30
    }
  ],
  "location": "AutomationPracticeSteps.theUserIsOnTheHomePage(String)"
});
formatter.result({
  "duration": 7637325366,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignIn",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 1865625475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emailaddress",
      "offset": 21
    },
    {
      "val": "mskumar09181@gmail.com",
      "offset": 42
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 160205702,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 21
    },
    {
      "val": "Helloworld12345",
      "offset": 38
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 117942064,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 1121531820,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "InvalidDetails",
      "offset": 39
    }
  ],
  "location": "AutomationPracticeSteps.theUserShouldSeeTheCorresponding(String)"
});
formatter.result({
  "duration": 38416100,
  "status": "passed"
});
formatter.after({
  "duration": 139306209,
  "status": "passed"
});
formatter.before({
  "duration": 1319639703,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Validate the Test Cafe Example page",
  "description": "",
  "id": "acceptance-testing-to-validate-the-user-login-and-shopping-cart-functionality;validate-the-test-cafe-example-page;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TestCafeExample"
    },
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user is on the home page \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the \"SignIn\" button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user enters the \"emailaddress\" under \"\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user enters the \"password\" under \"\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user clicks on the \"Submit\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the user should see the corresponding \"BlankDetails\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/index.php",
      "offset": 30
    }
  ],
  "location": "AutomationPracticeSteps.theUserIsOnTheHomePage(String)"
});
formatter.result({
  "duration": 7302149444,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SignIn",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 2278232142,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "emailaddress",
      "offset": 21
    },
    {
      "val": "",
      "offset": 42
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 62039943,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 21
    },
    {
      "val": "",
      "offset": 38
    }
  ],
  "location": "AutomationPracticeSteps.entersTheUnderField(String,String)"
});
formatter.result({
  "duration": 69677262,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 24
    }
  ],
  "location": "AutomationPracticeSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "duration": 1063051440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BlankDetails",
      "offset": 39
    }
  ],
  "location": "AutomationPracticeSteps.theUserShouldSeeTheCorresponding(String)"
});
formatter.result({
  "duration": 33230389,
  "status": "passed"
});
formatter.after({
  "duration": 133438763,
  "status": "passed"
});
});