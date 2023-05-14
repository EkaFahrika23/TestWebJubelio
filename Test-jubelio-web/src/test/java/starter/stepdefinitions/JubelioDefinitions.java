package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;

public class JubelioDefinitions {

    @Given("{actor} on the login page")
    public void userOnTheLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.LoginPage());
    }

    @When("{actor} input the valid email {string}")
    public void inputValidEmail(Actor actor, String email) {
        actor.attemptsTo(DoAnAction.EmailFieldWithValue(email));
    }

    @And("{actor} input the valid password {string}")
    public void inputValidPassword(Actor actor, String password) {
        actor.attemptsTo(DoAnAction.PasswordFieldWithValue(password));
    }

    @Then("{actor} click login button")
    public void userClickLoginButton(Actor actor) {
        actor.attemptsTo(DoAnAction.clickLoginButton());
    }
//    @Then("{actor} see {string} text on the home page")
//    public void seeHomePage(Actor actor, String text){
//        actor.attemptsTo(Ensure.that(LoginPage.HOME_PAGE).hasText(text));
//    }

    //    invalid login
    @And("{actor} input invalid email {string}")
    public void inputInvalidEmail(Actor actor, String invEmail) {
        actor.attemptsTo(DoAnAction.invalidEmail(invEmail));

    }

    @And("{actor} input invalid password {string}")
    public void inputInvalidPassword(Actor actor, String invPassword) {
        actor.attemptsTo(DoAnAction.invalidPassword(invPassword));

    }
//    @Then("{actor} see this {string} alert message invalid account")
//    public void alertMessageInvalid(Actor actor, String alert){
//        actor.attemptsTo(Ensure.that(AltaShopPage.ALERT_MESSAGE).hasText(alert));
//
//    }

}