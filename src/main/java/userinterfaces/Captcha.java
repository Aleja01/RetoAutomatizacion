package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Captcha {


    public static final Target CAPTCHA = Target.the("Captcha").located(By.xpath("//iframe[@title='Prueba reCAPTCHA']"));
}
