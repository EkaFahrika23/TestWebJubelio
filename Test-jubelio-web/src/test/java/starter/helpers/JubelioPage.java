package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://app.jubelio.com/login")
public class JubelioPage extends PageObject {

    public static Target FIELD_EMAIL = Target.the("email").locatedBy("//form[contains(@class,'login-form m-t')]/div[1]/div[1]/input[1]");
    public static Target FIELD_PASSWORD = Target.the("password").locatedBy("//form[contains(@class,'login-form m-t')]/div[2]/div[1]/input[1];

    public static Target LOGIN_BUTTON = Target.the("login button").locatedBy("//Span[contains(text(),'Masuk')]");

}
