package stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.EnterData;
import tasks.Join;
import userinterfaces.HomePage;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userinterfaces.Captcha.CAPTCHA;

public class SignUpStepsDefinitions {

    private HomePage homePage = new HomePage();


    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^a new user (.*) has chosen to sign up$")
    public void aNewUserHasChosenToSignUp(String nameActor) {
        theActorCalled(nameActor).wasAbleTo(Open.browserOn(homePage));
        getDriver().manage().window().maximize();
        theActorInTheSpotlight().wasAbleTo(
                Join.whitButton()
        );

    }


    @When("^he signs up with valid details$")
    public void heSignsUpWithValidDetails(List<String> data) {

        theActorInTheSpotlight().wasAbleTo(
                EnterData.personal
                        (data.get(0),
                                data.get(1),
                                data.get(2),
                                data.get(3),
                                data.get(4),
                                data.get(5),
                                data.get(6),
                                data.get(7),
                                data.get(8),
                                data.get(9),
                                data.get(10),
                                data.get(11),
                                data.get(12),
                                data.get(13),
                                data.get(14),
                                data.get(15),
                                data.get(16))
        );

    }

    @Then("^he should see the captcha$")
    public void heShouldSeeTheCaptcha() {

        theActorInTheSpotlight().should(seeThat(the(CAPTCHA), isPresent()));
    }

}
