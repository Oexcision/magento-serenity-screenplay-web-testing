package com.nttdata.testing.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;

public class PostCheckoutPage extends PageObject {
    public static final Target LBL_SUCCESS = Target.the("Texto de Confirmación de Compra")
            .located(By.xpath("//h1[@class='page-title']//span[@class='base' and text()='Thank you for your purchase!']\n"));

    public static final Target LNK_ORDER_NUMBER = Target.the("Link con número de orden")
            .located(By.cssSelector("a.order-number"));

    public static final Target LBL_ORDER_ID = Target.the("Etiqueta con número de orden")
            .located(By.cssSelector("h1.page-title span.base"));

    public static final Target LBL_PRODUCT_NAME = Target.the("Nombre del producto comprado")
            .located(By.cssSelector("strong.product.name.product-item-name"));


}
