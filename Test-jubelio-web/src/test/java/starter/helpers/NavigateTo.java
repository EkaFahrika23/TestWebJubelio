package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable LoginPage(){
        return Task.where("{0} opens the login page",
                Open.browserOn().the(JubelioPage.class));
    }

}