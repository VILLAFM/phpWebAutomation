package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import pages.driver;
import pages.setup;

public class userRegistrationStepdefs {
    driver driver;
    setup setup;
    String browserName;
    String url;

    @Before
    public void before(){
        setup = new setup();
        browserName = setup.getParameter("browser");
        driver = new driver(browserName);
        url = setup.getParameter("url");
        driver.get(url);
    }

    @Given("^user launched the phpTravel registration page$")
    public void user_launched_the_phpTravel_registration_page() throws Throwable {
        System.out.println("Hello");
    }

}
