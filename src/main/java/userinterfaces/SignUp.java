package userinterfaces;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/signup")
public class SignUp extends PageObject {


    public static final Target FIRST_NAME = Target.the("Campo para ingresar primer nombre").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Campo para ingresar apellido").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Campo para ingresar correo electrónico").located(By.id("email"));
    public static final Target SELECT_BIRTH_MONTH = Target.the("Selecionar mes de nacimiento").located(By.id("birthMonth"));
    public static final Target SELECT_BIRTH_DAY = Target.the("Selecionar día de nacimiento").located(By.id("birthDay"));
    public static final Target SELECT_BIRTH_YEAR = Target.the("Selecionar año de nacimiento").located(By.id("birthYear"));
    public static final Target NEXT_LOCATION = Target.the("Botón para continuar al registro de datos de ubicación").located(By.xpath("//a[@class='btn btn-blue']"));

    public static final Target COUNTRY  = Target.the("Campo para ingresar país").located(By.xpath ("//span[@ng-hide='$select.isEmpty()'][contains(.,'Colombia')]"));
    public static final Target ENTER_COUNTRY  = Target.the("Campo para ingresar país").located(By.xpath ("(//input[contains(@placeholder, 'Select a country')])[1]"));
    public static final Target CITY  = Target.the("Campo para ingresar ciudad").located(By.id("city"));
    public static final Target ZIP_CODE = Target.the("Campo para ingresar zip o código postal").located(By.id("zip"));
    public static final Target NEXT_DEVICES = Target.the("Botón para continuar al registro de datos de ubicación").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    public static final Target CLOSE = Target.the("Quitar selección autoseleccionada").located(By.xpath("//i[@class='glyphicon glyphicon-remove']"));
    public static final Target SEARCH_SO = Target.the("Seleccionar el campo para buscar el SO").located(By.xpath ("(//span[@ng-show='$select.isEmpty()'][contains(.,'Select OS')])[1]"));
    public static final Target ENTER_SO = Target.the("Campo para ingresar el nombre del SO").located(By.xpath ("(//input[contains(@placeholder, 'Select OS')])[1]"));
    public static final Target VERSION = Target.the("Campo para ingresar la versión del SO").located(By.xpath ("(//span[@ng-show='$select.isEmpty()'][contains(.,'Select a Version')])[1]"));
    public static final Target ENTER_VERSION = Target.the("Campo para ingresar la versión del SO").located(By.xpath ("(//input[contains(@placeholder, 'Select a Version')])[1]"));
    public static final Target LANGUAGE = Target.the("Campo para seleccionar el lenguaje").located(By.xpath ("(//span[@ng-show='$select.isEmpty()'][contains(.,'Select OS language')])[1]"));
    public static final Target ENTER_LANGUAGE = Target.the("Campo para ingresar el lenguaje").located(By.xpath ("(//input[contains(@placeholder, 'Select OS language')])[1]"));
    public static final Target MOB_DEVICE = Target.the("Campo para seleccionar el equipo móvil").located(By.xpath ("(//span[@ng-show='$select.isEmpty()'][contains(.,'Select Brand')])[1]"));
    public static final Target ENTER_DEVICE = Target.the("Campo para ingresar el equipo móvil").located(By.xpath ("(//input[contains(@placeholder, 'Select Brand')])[1]"));
    public static final Target MODEL = Target.the("Campo para ingresar el equipo del móvil").located(By.xpath ("(//span[@ng-show='$select.isEmpty()'][contains(.,'Select a Model')])[1]"));
    public static final Target ENTER_MODEL = Target.the("Campo para ingresar el equipo del móvil").located(By.xpath ("(//input[contains(@placeholder, 'Select a Model')])[1]"));
    public static final Target OP_SYSTEM = Target.the("Campo para ingresar el SO del móvil").located(By.xpath ("(//span[@ng-show='$select.isEmpty()'][contains(.,'Select OS')])[3]"));
    public static final Target ENTER_OP_SYSTEM = Target.the("Campo para ingresar el SO del móvil").located(By.xpath ("(//input[contains(@placeholder, 'Select OS')])[3]"));

    public static final Target CREATE_PASS = Target.the("Campo para ingresar la nueva contraseña").located(By.id ("password"));
    public static final Target CONFIRM_PASS = Target.the("Campo para confirmar la nueva contraseña").located(By.id ("confirmPassword"));
    public static final Target TERM = Target.the("Campo para seleccionar términos").located(By.xpath ("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target POLITIC = Target.the("Campo para seleccionar políticas").located(By.xpath ("//span[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));
    public static final Target COMPLETE_SET_UP = Target.the("Botón para finalizar registro").located(By.id ("laddaBtn"));


}
