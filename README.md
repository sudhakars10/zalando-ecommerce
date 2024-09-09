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
<li><b>IDE:</b> Any Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse).

<h2><b>Setup</b></h2>
Clone the repository:

git clone [https://github.com/sudhakars10/zalando-ecommerce.git](https://github.com/sudhakars10/zalando-ecommerce.git) <br>
cd Zalando-eCommerce

Install dependencies:<br>
mvn clean install

<h2><b>Running Tests</b></h2>
Using Maven<br>
To run tests via Maven, execute the following command:<br>
mvn test

Using TestNG<br>
You can also run tests directly via the TestRunnerReport.xml file:<br>
Right-click on the TestRunnerReport.xml file in your IDE and select "Run"<br>

<h2><b>Framework Design</b></h2>
Page Object Model (POM)<br>
The project uses the Page Object Model (POM) design pattern, where web pages are represented as classes, and actions that can be performed on these pages are represented as methods.

Cucumber<br>
Cucumber is used to write Behavior-Driven Development (BDD) style test cases. Test scenarios are written in Gherkin language in .feature files.<br>

TestNG<br>
TestNG is used as the test runner for the Cucumber tests, which allows for parallel execution, grouping, and other advanced testing functionalities.<br>

Maven<br>
Maven is used for managing dependencies, build automation, and running tests.<br>

<h2><b>Reporting</b></h2>
The framework generates a Cucumber HTML report after the execution. You can find it under target/cucumber-reports/.

<h2><b>Note:</b></h2> 
The payment page can't be automated for the live 3rd party website as it's blocking the automation browser actions due to security reasons. Hence I created dummy assertions instead actual automation for this page alone. The rest of the pages are implemented with automation.
