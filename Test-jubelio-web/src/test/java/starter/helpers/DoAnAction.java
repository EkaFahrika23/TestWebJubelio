package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoAnAction {

//    register

//    login

    public static Performable EmailFieldWithValue(String email) {
        return Task.where("{0} email field with " + email,
                Enter.theValue(email)
                        .into(JubelioPage.FIELD_EMAIL)
        );
    }

    public static Performable PasswordFieldWithValue(String password) {
        return Task.where("{0} password field with " + password,
                Enter.theValue(password)
                        .into(JubelioPage.FIELD_PASSWORD)
        );
    }

    public static Performable clickLoginButton() {
        return Task.where("{0} click Login button",
                Click.on(JubelioPage.LOGIN_BUTTON)
        );
    }

    public static Performable invalidEmail(String invEmail) {
        return Task.where("{0} invalid email with" + invEmail,
                Enter.theValue(invEmail)
                        .into(JubelioPage.FIELD_EMAIL)
        );
    }

    public static Performable invalidPassword(String invPassword) {
        return Task.where("{0} invalid password with" + invPassword,
                Enter.theValue(invPassword)
                        .into(JubelioPage.FIELD_PASSWORD)
        );
    }

}