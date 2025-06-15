package com.nttdata.testing.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AccountPage extends PageObject {

    public static final Target LBL_MY_ACCOUNT = Target.the("Boton crear usuario")
            .located(By.xpath("//span[text()='My Account']"));

    public static final Target BTN_MENU = Target.the("Boton de Menu")
            .located(By.xpath("(//button[@data-action='customer-menu-toggle'])[1]"));

    public static final Target BTN_MY_ACCOUNT = Target.the("Boton de My Account")
            .located(By.xpath("//a[text()='My Account']"));

    public static final Target BTN_EDIT_MY_ACCOUNT = Target.the("Boton de Edit My Account")
            .located(By.xpath("//a[contains(@class, 'action') and contains(@class, 'edit')]"));

    public static final Target TXT_NAME = Target.the("Texto de nombre")
            .located(By.xpath("//input[@id='firstname']"));

    public static final Target TXT_LASTNAME = Target.the("Texto de Apellido")
            .located(By.xpath("//input[@id='lastname']"));

    public static final Target BTN_SAVE = Target.the("Boton de Guardado")
            .located(By.xpath("//button[@title='Save']"));

    public static final Target LBL_MYACCOUNT = Target.the("Label de My Account")
            .located(By.xpath("//span[@data-ui-id='page-title-wrapper']"));

    public static final Target LBL_MESSAGE_SUCCESFUL = Target.the("Mensaje de exito al guardar la informacion de cuenta")
            .located(By.xpath("//div[normalize-space(text())='You saved the account information.']"));
}
