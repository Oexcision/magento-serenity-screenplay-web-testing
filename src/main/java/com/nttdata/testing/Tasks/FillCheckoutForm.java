package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.CheckoutPage;
import com.nttdata.testing.interactions.ScrollToBottom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillCheckoutForm implements Task {
    private final String direccion;
    private final String ciudad;
    private final String zip;
    private final String telefono;

    public FillCheckoutForm(String direccion, String ciudad, String zip, String telefono ) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.zip = zip;
        this.telefono = telefono;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(HomePage.BTN_SIGN_UP),
                Enter.theValue(direccion).into(CheckoutPage.TXT_ADDRESS),
                Enter.theValue(ciudad).into(CheckoutPage.TXT_CITY),
                Click.on(CheckoutPage.SLT_COUNTRY),
                Click.on(CheckoutPage.SLT_STATE),
                Enter.theValue(zip).into(CheckoutPage.TXT_ZIP),
                Enter.theValue(telefono).into(CheckoutPage.TXT_PHONE),
                Click.on(CheckoutPage.RD_SHIPPING),
                Click.on(CheckoutPage.BTN_NEXT),
                //Enter.theValue(contrasenia).into(CheckoutPage.TXT_PASSWORD_CONFIRMATION),
                ScrollToBottom.now()
                //Click.on(CheckoutPage.BTN_CREATE)
        );
    }

    public static Performable withData(String direccion, String ciudad, String zip, String telefono) {
        return new FillCheckoutForm(direccion, ciudad, zip, telefono);
    }
}
