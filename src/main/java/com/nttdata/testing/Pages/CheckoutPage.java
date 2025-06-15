package com.nttdata.testing.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;

public class CheckoutPage extends PageObject {

    public static final Target TXT_ADDRESS = Target.the("Campo de texto de Dirección")
            .located(By.xpath("//input[@name='street[0]']\n"));

    public static final Target TXT_CITY = Target.the("Campo de texto de Ciudad")
            .located(By.xpath("//input[@name='city']\n"));

    public static final Target SLT_COUNTRY = Target.the("Select de Pais")
            .located(By.xpath("//select[@name='country_id']/option[@value='US']"));

    public static final Target SLT_STATE = Target.the("Select de Estado")
            .located(By.xpath("//select[@name='region_id']/option[@value='1']"));

    public static final Target TXT_ZIP = Target.the("Campo de texto de ZIP")
            .located(By.xpath("//input[@name='postcode']\n"));

    public static final Target TXT_PHONE = Target.the("Campo de texto de Telefono")
            .located(By.xpath("//input[@name='telephone']\n"));

    public static final Target RD_SHIPPING = Target.the("Radio de Envio")
            .located(By.xpath("//input[@type='radio' and @value='flatrate_flatrate']\n"));

    public static final Target BTN_NEXT = Target.the("Boton de paso al siguiente formulario")
            .located(By.xpath("//button[span[text()='Next']]\n"));

    public static final Target BTN_PLACE_ORDER = Target.the("Boton para realizar la orden")
            .located(By.xpath("//button[@title='Place Order']"));
}
