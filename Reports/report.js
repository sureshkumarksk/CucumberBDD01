$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureTag/Tag.feature");
formatter.feature({
  "name": "To Validate the Adactin Hotel WebApplication And to Check Weather the Application is Properly Working or not",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC_01 Validate the Adactin Hotel Webpage with Vaild UserName and valid PassWord",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User Launch the Webbrowser and hit the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "TagStepDef.user_Launch_the_Webbrowser_and_hit_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the the Adactin webpage Should be Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TagStepDef.user_verify_the_the_Adactin_webpage_Should_be_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter The Valid UserName And Valid PassWordAnd User Click The login Button",
  "keyword": "When "
});
formatter.match({
  "location": "TagStepDef.user_Enter_The_Valid_UserName_And_Valid_PassWordAnd_User_Click_The_login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify the Login Feature As should Be open Succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TagStepDef.user_Verify_the_Login_Feature_As_should_Be_open_Succesfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_02 Validate the Search page And Enter the given Below Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "User Verify the Search page Should Be Displayed",
  "keyword": "Given "
});
formatter.match({
  "location": "TagStepDef.user_Verify_the_Search_page_Should_Be_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter the \tAll the Details With In the text Box and Select the Drop Down Fields",
  "keyword": "Given "
});
formatter.match({
  "location": "TagStepDef.user_Enter_the_All_the_Details_With_In_the_text_Box_and_Select_the_Drop_Down_Fields()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#location\"}\n  (Session info: chrome\u003d102.0.5005.63)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.3\u0027, revision: \u00277b1ebf28ef\u0027\nSystem info: host: \u0027DESKTOP-35OCICB\u0027, ip: \u0027192.168.1.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [d49b2bddff436ca4cf91d3380230b01b, findElement {using\u003did, value\u003dlocation}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.63, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\sures\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63524}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63524/devtoo..., se:cdpVersion: 102.0.5005.63, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d49b2bddff436ca4cf91d3380230b01b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:567)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:385)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:377)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy20.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:46)\r\n\tat org.Baseclass.Baseclass01.selectoptionbyindex(Baseclass01.java:120)\r\n\tat org.adactian.TagStepDef.user_Enter_the_All_the_Details_With_In_the_text_Box_and_Select_the_Drop_Down_Fields(TagStepDef.java:64)\r\n\tat ✽.User Enter the \tAll the Details With In the text Box and Select the Drop Down Fields(file:src/test/resources/FeatureTag/Tag.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User Click the Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "TagStepDef.user_Click_the_Search_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify the while click the Search Button the page should Be Move to Next page",
  "keyword": "Then "
});
formatter.match({
  "location": "TagStepDef.user_verify_the_while_click_the_Search_Button_the_page_should_Be_Move_to_Next_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "TC_03 Validate the Select Hotel Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User Select the Hotel And Click the Hotel By using Radiobutton",
  "keyword": "Given "
});
formatter.match({
  "location": "TagStepDef.user_Select_the_Hotel_And_Click_the_Hotel_By_using_Radiobutton()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#radiobutton_0\"}\n  (Session info: chrome\u003d102.0.5005.63)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.3\u0027, revision: \u00277b1ebf28ef\u0027\nSystem info: host: \u0027DESKTOP-35OCICB\u0027, ip: \u0027192.168.1.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [d49b2bddff436ca4cf91d3380230b01b, findElement {using\u003did, value\u003dradiobutton_0}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.63, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\sures\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63524}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63524/devtoo..., se:cdpVersion: 102.0.5005.63, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d49b2bddff436ca4cf91d3380230b01b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:567)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:385)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:377)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat org.Baseclass.Baseclass01.click(Baseclass01.java:93)\r\n\tat org.adactian.TagStepDef.user_Select_the_Hotel_And_Click_the_Hotel_By_using_Radiobutton(TagStepDef.java:98)\r\n\tat ✽.User Select the Hotel And Click the Hotel By using Radiobutton(file:src/test/resources/FeatureTag/Tag.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User click the Continue Button",
  "keyword": "And "
});
formatter.match({
  "location": "TagStepDef.user_click_the_Continue_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "TC_04 Validate the Book Hotel Page And Enter the Given Below Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User Enter the Datas In the Given Text Box as Well As Drop Down Fields",
  "keyword": "Given "
});
formatter.match({
  "location": "TagStepDef.user_Enter_the_Datas_In_the_Given_Text_Box_as_Well_As_Drop_Down_Fields()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#first_name\"}\n  (Session info: chrome\u003d102.0.5005.63)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.3\u0027, revision: \u00277b1ebf28ef\u0027\nSystem info: host: \u0027DESKTOP-35OCICB\u0027, ip: \u0027192.168.1.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [d49b2bddff436ca4cf91d3380230b01b, findElement {using\u003did, value\u003dfirst_name}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.63, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\sures\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63524}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63524/devtoo..., se:cdpVersion: 102.0.5005.63, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d49b2bddff436ca4cf91d3380230b01b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:567)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:385)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:377)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat org.Baseclass.Baseclass01.sendkeys(Baseclass01.java:110)\r\n\tat org.adactian.TagStepDef.user_Enter_the_Datas_In_the_Given_Text_Box_as_Well_As_Drop_Down_Fields(TagStepDef.java:115)\r\n\tat ✽.User Enter the Datas In the Given Text Box as Well As Drop Down Fields(file:src/test/resources/FeatureTag/Tag.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User click the Booknow  Button As Well As Verify the cancel Button Should Be Displayed",
  "keyword": "And "
});
formatter.match({
  "location": "TagStepDef.user_click_the_Booknow_Button_As_Well_As_Verify_the_cancel_Button_Should_Be_Displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Verify the Book Hotel page Is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TagStepDef.user_Verify_the_Book_Hotel_page_Is_Displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "TC-05 Validate the Booking Conformation page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "name": "User Can See the Order Id and Other Details",
  "keyword": "Given "
});
formatter.match({
  "location": "TagStepDef.user_Can_See_the_Order_Id_and_Other_Details()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#order_no\"}\n  (Session info: chrome\u003d102.0.5005.63)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.3\u0027, revision: \u00277b1ebf28ef\u0027\nSystem info: host: \u0027DESKTOP-35OCICB\u0027, ip: \u0027192.168.1.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [d49b2bddff436ca4cf91d3380230b01b, findElement {using\u003did, value\u003dorder_no}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.63, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\sures\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63524}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63524/devtoo..., se:cdpVersion: 102.0.5005.63, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d49b2bddff436ca4cf91d3380230b01b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:567)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:385)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:377)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy20.getAttribute(Unknown Source)\r\n\tat org.Baseclass.Baseclass01.getattribute(Baseclass01.java:133)\r\n\tat org.adactian.TagStepDef.user_Can_See_the_Order_Id_and_Other_Details(TagStepDef.java:153)\r\n\tat ✽.User Can See the Order Id and Other Details(file:src/test/resources/FeatureTag/Tag.feature:30)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User verify the Logout Button Should Be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TagStepDef.user_verify_the_Logout_Button_Should_Be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verify the My liternery Button as well as Search hotel Button is Displayed in the below the details",
  "keyword": "Then "
});
formatter.match({
  "location": "TagStepDef.user_verify_the_My_liternery_Button_as_well_as_Search_hotel_Button_is_Displayed_in_the_below_the_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "TC_06 Validate the logout Button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    },
    {
      "name": "@E2E"
    }
  ]
});
formatter.step({
  "name": "User click the Log out",
  "keyword": "Given "
});
formatter.match({
  "location": "TagStepDef.user_click_the_Log_out()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#logout\"}\n  (Session info: chrome\u003d102.0.5005.63)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.3\u0027, revision: \u00277b1ebf28ef\u0027\nSystem info: host: \u0027DESKTOP-35OCICB\u0027, ip: \u0027192.168.1.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [d49b2bddff436ca4cf91d3380230b01b, findElement {using\u003did, value\u003dlogout}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.63, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\sures\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63524}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63524/devtoo..., se:cdpVersion: 102.0.5005.63, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d49b2bddff436ca4cf91d3380230b01b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:567)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:385)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:377)\r\n\tat org.adactian.TagStepDef.user_click_the_Log_out(TagStepDef.java:185)\r\n\tat ✽.User click the Log out(file:src/test/resources/FeatureTag/Tag.feature:36)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User verify the logout Was Succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TagStepDef.user_verify_the_logout_Was_Succesfully()"
});
formatter.result({
  "status": "skipped"
});
});