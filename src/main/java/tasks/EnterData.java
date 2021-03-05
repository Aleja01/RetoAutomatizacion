package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.SignUp.*;


public class EnterData implements Task {

    public String firstname;
    public String lastname;
    public String email;
    public String city;
    public String zipCode;
    public String country;
    public String birthMonth;
    public String birthDay;
    public String birthYear;
    public String so;
    public String version;
    public String language;
    public String device;
    public String model;
    public String opSystem;
    public String password;
    public String cPassword;





    public EnterData(String firstname, String lastname, String email, String city, String zipCode, String country, String birthMonth, String birthDay, String birthYear, String so, String version, String language, String device, String model, String opSystem, String password, String cPassword) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.so = so;
        this.version = version;
        this.language = language;
        this.device = device;
        this.model = model;
        this.opSystem = opSystem;
        this.password = password;
        this.cPassword = cPassword;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                //Pasos para ingresar los datos personales
                Enter.theValue(firstname).into(FIRST_NAME),
                Enter.theValue(lastname).into(LAST_NAME),
                Enter.theValue(email).into(EMAIL),
                SelectFromOptions.byValue(birthMonth).from(SELECT_BIRTH_MONTH),
                SelectFromOptions.byValue(birthDay).from(SELECT_BIRTH_DAY),
                SelectFromOptions.byValue(birthYear).from(SELECT_BIRTH_YEAR),
                Scroll.to(FIRST_NAME),
                JavaScriptClick.on(NEXT_LOCATION),

                //Pasos para ingresar los datos de ubicación
                JavaScriptClick.on(COUNTRY),
                WaitUntil.the(ENTER_COUNTRY, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(country).into(ENTER_COUNTRY).thenHit(Keys.ENTER),
                Enter.theValue(city).into(CITY),
                Enter.keyValues(city).into(CITY).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                Enter.theValue(zipCode).into(ZIP_CODE),
                Scroll.to(CITY),
                JavaScriptClick.on(NEXT_DEVICES),

                //Pasos para ingresar los datos de equipos y SO

                Click.on(CLOSE),
                JavaScriptClick.on(SEARCH_SO),
                WaitUntil.the(ENTER_SO, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(so).into(ENTER_SO).thenHit(Keys.ENTER),
                JavaScriptClick.on(VERSION),
                WaitUntil.the(ENTER_VERSION, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(version).into(ENTER_VERSION).thenHit(Keys.ENTER),
                JavaScriptClick.on(LANGUAGE),
                WaitUntil.the(ENTER_LANGUAGE, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(language).into(ENTER_LANGUAGE).thenHit(Keys.ENTER),
                JavaScriptClick.on(MOB_DEVICE),
                WaitUntil.the(ENTER_DEVICE, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(device).into(ENTER_DEVICE).thenHit(Keys.ENTER),
                JavaScriptClick.on(MODEL),
                WaitUntil.the(ENTER_MODEL, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(model).into(ENTER_MODEL).thenHit(Keys.ENTER),
                JavaScriptClick.on(OP_SYSTEM),
                WaitUntil.the(ENTER_OP_SYSTEM, WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(opSystem).into(ENTER_OP_SYSTEM).thenHit(Keys.ENTER),
                JavaScriptClick.on(NEXT_DEVICES),


                //Pasos para ingresar ingresar contraseña y aceptar términos y condiciones

                Enter.theValue(password).into(CREATE_PASS),
                WaitUntil.the(CONFIRM_PASS, WebElementStateMatchers.isEnabled()).forNoMoreThan(15).seconds(),
                Enter.theValue(cPassword).into(CONFIRM_PASS),
                Scroll.to(CONFIRM_PASS),
                Click.on(TERM),
                WaitUntil.the(POLITIC, WebElementStateMatchers.isEnabled()).forNoMoreThan(15).seconds(),
                Click.on(POLITIC),
                Click.on(COMPLETE_SET_UP));


    }


    public static EnterData personal(String firstname, String lastname, String email, String city, String zipCode, String country, String birthMonth , String birthDay, String birthYear, String so, String version, String language, String device, String model, String opSystem, String password, String cPassword) {
        return instrumented(EnterData.class, firstname, lastname, email, city, zipCode, country, birthMonth, birthDay, birthYear, so, version, language, device, model, opSystem, password, cPassword);
    }
}

