package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("Botón para registrarse").located(By.className("unauthenticated-nav-bar__sign-up"));

}
