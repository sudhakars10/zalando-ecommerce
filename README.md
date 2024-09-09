# ShoppingCart
This project automates end-to-end testing of a Zalando e-commerce website using Selenium WebDriver, Java, and Cucumber. The tests cover user scenarios like browsing products, adding items to the cart, checking out, payment, and more.

<h2><b>Features</b></h2>
<li><b>Automated UI Testing:</b> Comprehensive coverage of e-commerce user journeys.</li>
<li><b>Cross-Browser Testing:</b> Configurable for different browsers (Chrome, Firefox, Edge).</li>
<li><b>BDD Approach:</b> Written in a behavior-driven development style using Cucumber.</li>
<li><b>Reports:</b> Generates detailed reports using Cucumber and other reporting tools.</li>

<h2><b>Prerequisites</b></h2>
<li><b>Java 11 or higher:</b> Make sure Java is installed and JAVA_HOME is set.
<li><b>Maven:</b> Ensure Maven is installed and added to your system's PATH.
<li><b>Browser Drivers:</b> Download the appropriate WebDriver executables (e.g., ChromeDriver) and add them to your system's PATH.

Note: The payment page can't be automated for the live 3rd party website as it's blocking the automation browser actions due to security reasons. Hence I created dummy assertions instead actual automation for this page alone. The rest of the pages are implemented with automation.
