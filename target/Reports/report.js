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
  "error_message": "cucumber.runtime.CucumberException: Failed to instantiate class step_definitions.MyStepdefT\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:47)\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.getInstance(DefaultJavaObjectFactory.java:33)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:57)\n\tat cucumber.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:43)\n\tat cucumber.runner.TestCase.run(TestCase.java:46)\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:126)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:66)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:156)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\nCaused by: java.lang.reflect.InvocationTargetException\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat cucumber.runtime.java.DefaultJavaObjectFactory.cacheNewInstance(DefaultJavaObjectFactory.java:41)\n\t... 32 more\nCaused by: org.openqa.selenium.WebDriverException: Unable to parse remote response: Uh oh, you\u0027ve run out of minutes!\nPlease visit https://saucelabs.com/pricing to purchase a subscription.\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:115)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:139)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:577)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:211)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:144)\n\tat Utils.BrowserUtils.getDriver(BrowserUtils.java:42)\n\tat Utils.Utilities.\u003cinit\u003e(Utilities.java:12)\n\tat step_definitions.MyStepdefT.\u003cinit\u003e(MyStepdefT.java:22)\n\t... 37 more\nCaused by: org.openqa.selenium.json.JsonException: Unable to determine type from: U. Last 1 characters read: U\nBuild info: version: \u00274.0.0-alpha-1\u0027, revision: \u0027d1d3728cae\u0027, time: \u00272019-04-24T13:42:21\u0027\nSystem info: host: \u0027MarifatpleWatch.localdomain\u0027, ip: \u0027fe80:0:0:0:1865:3210:ffaf:eee9%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.json.JsonInput.peek(JsonInput.java:125)\n\tat org.openqa.selenium.json.JsonTypeCoercer.lambda$null$6(JsonTypeCoercer.java:140)\n\tat org.openqa.selenium.json.JsonTypeCoercer.coerce(JsonTypeCoercer.java:126)\n\tat org.openqa.selenium.json.Json.toType(Json.java:69)\n\tat org.openqa.selenium.json.Json.toType(Json.java:55)\n\tat org.openqa.selenium.json.Json.toType(Json.java:50)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:112)\n\t... 46 more\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.WebDriverException: Unable to parse remote response: Uh oh, you\u0027ve run out of minutes!\nPlease visit https://saucelabs.com/pricing to purchase a subscription.\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:115)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:139)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:577)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:211)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:144)\n\tat Utils.BrowserUtils.getDriver(BrowserUtils.java:42)\n\tat step_definitions.Hooks.teardown(Hooks.java:26)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:126)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:66)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:156)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\nCaused by: org.openqa.selenium.json.JsonException: Unable to determine type from: U. Last 1 characters read: U\nBuild info: version: \u00274.0.0-alpha-1\u0027, revision: \u0027d1d3728cae\u0027, time: \u00272019-04-24T13:42:21\u0027\nSystem info: host: \u0027MarifatpleWatch.localdomain\u0027, ip: \u0027fe80:0:0:0:1865:3210:ffaf:eee9%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.json.JsonInput.peek(JsonInput.java:125)\n\tat org.openqa.selenium.json.JsonTypeCoercer.lambda$null$6(JsonTypeCoercer.java:140)\n\tat org.openqa.selenium.json.JsonTypeCoercer.coerce(JsonTypeCoercer.java:126)\n\tat org.openqa.selenium.json.Json.toType(Json.java:69)\n\tat org.openqa.selenium.json.Json.toType(Json.java:55)\n\tat org.openqa.selenium.json.Json.toType(Json.java:50)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:112)\n\t... 45 more\n",
  "status": "failed"
});
});