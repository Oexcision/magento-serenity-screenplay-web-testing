package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.AccountPage;
import com.nttdata.testing.Pages.CheckoutPage;
import com.nttdata.testing.interactions.ScrollToBottom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ChangeFieldsUser implements Task {
    private final String nombre;
    private final String apellido;

    public ChangeFieldsUser(String nombre, String apellido ) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(HomePage.BTN_SIGN_UP),
                Enter.theValue(nombre).into(AccountPage.TXT_NAME),
                Enter.theValue(apellido).into(AccountPage.TXT_LASTNAME)

                //Enter.theValue(contrasenia).into(CheckoutPage.TXT_PASSWORD_CONFIRMATION),
                //Click.on(CheckoutPage.BTN_CREATE)
        );
    }

    public static Performable withData(String nombre, String apellido) {
        return new ChangeFieldsUser(nombre, apellido);
    }
}