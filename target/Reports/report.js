$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/Users/Tsolmon/IdeaProjects/HakuProject/src/main/resources/FirstPage.feature");
formatter.feature({
  "name": "Home page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the URL \"https://www.techleadacademy.io/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefT.i_navigate_to_the_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Contact TechLeadAcademy",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I send emails using folowing values:",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Phone",
        "Email",
        "Subject",
        "Message"
      ]
    },
    {
      "cells": [
        "Tsolmon",
        "Baasandorj",
        "703380000",
        "tsolmon_mm@yahoo.com",
        "hi",
        "This is Tsolmon"
      ]
    },
    {
      "cells": [
        "Khaliunaa",
        "Baasandorj",
        "703381111",
        "Khaliunaa_mm@yahoo.com",
        "hi",
        "This is Khaliunaa"
      ]
    },
    {
      "cells": [
        "Kuba",
        "Zhaanbaev",
        "703382222",
        "Kuba_mm@yahoo.com",
        "hi",
        "This is Kuba"
      ]
    },
    {
      "cells": [
        "Nurik",
        "Ibraimov",
        "703383333",
        "Nurik_mm@yahoo.com",
        "hi",
        "This is Nurik"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefT.iSendEmailsUsingFolowingValues(Contacter\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});