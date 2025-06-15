package com.nttdata.testing.Pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenClothesPage extends PageObject {

    public static final Target TXT_BUSCAR = Target.the("Barra de busqueda")
            .located(By.id("search"));

    public static final Target ICN_BUSCAR = Target.the("Icono para buscar")
            .located(By.xpath("//button[contains(@class, 'search') and span[text()='Search']]"));

    public static final Target ITM_SHIRT = Target.the("Item Shirt")
            .located(By.xpath("//a[contains(@href, 'proteus-fitness-jackshirt.html') and contains(@class, 'product-item-link')]\n"));

    public static final Target ITM_TALLA = Target.the("Item Talla de ropa")
            .located(By.xpath("//div[@option-label='L']"));

    public static final Target ITM_COLOR_PRENDA = Target.the("Color de la prenda")
            .located(By.xpath("//div[@option-label='Blue']"));

    public static final Target BTN_AGREGAR_CARRITO = Target.the("Boton Agregar producto al carrito")
            .located(By.xpath("//button[span[text()='Add to Cart']]"));

    public static final Target ITM_CARRITO = Target.the("Items agregados al carrito")
            .located(By.xpath("//div[@data-block='minicart']//span[@class='counter qty']//span[@class='counter-number']"));

    public static final Target ITM_ITEM = Target.the("Item de NavBar")
            .located(By.xpath("//a[@id='ui-id-5']\n"));

    public static final Target ITM_CATEGORY = Target.the("Categoria de Item de NavBar")
            .located(By.xpath("//a[@id='ui-id-17']\n"));

    public static final Target ITM_SUBCATEGORY = Target.the("Categoria de Item de NavBar")
            .located(By.xpath("//a[@id='ui-id-19']\n"));

    public static final Target BTN_CART = Target.the("Categoria de Item de NavBar")
            .located(By.xpath("//a[@class='action showcart']"));

    public static final Target BTN_PROCEED_CHECKOUT = Target.the("Categoria de Item de NavBar")
            .located(By.xpath("//button[@id='top-cart-btn-checkout']"));
}
