package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.AccountPage;
import com.nttdata.testing.Pages.CheckoutPage;
import com.nttdata.testing.Pages.MenClothesPage;
import com.nttdata.testing.Pages.PostCheckoutPage;
import com.nttdata.testing.Tasks.*;
import com.nttdata.testing.questions.BuyQuestion;
import com.nttdata.testing.questions.RegisterQuestion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class BuyClothesStepDefinition {


    @And("selecciona jackets de top para men en el navbar")
    public void seleccionaJacketsDeTopParaMenEnElNavbar() {
        theActorInTheSpotlight().attemptsTo(
                MoveMouse.to(MenClothesPage.ITM_ITEM),
                MoveMouse.to(MenClothesPage.ITM_CATEGORY),
                Click.on(MenClothesPage.ITM_SUBCATEGORY)

        );
    }


    @When("procede a realizar la compra desde el carrito")
    public void procedeARealizarLaCompraDesdeElCarrito() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(MenClothesPage.BTN_CART),
                Click.on(MenClothesPage.BTN_PROCEED_CHECKOUT)
        );
    }

    @And("completa el formulario de compra con los datos direccion {string}, ciudad {string}, zip {string} y numero {string}")
    public void completaElFormularioDeCompraConLosDatosDireccionCiudadZipYNumero(String direccion, String ciudad, String zip, String telefono) {

        try {
            theActorInTheSpotlight().attemptsTo(FillCheckoutForm.withData(direccion, ciudad, zip, telefono));
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("hace click en Place Order")
    public void haceClickEnPlaceOrder() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CheckoutPage.BTN_PLACE_ORDER)
        );
    }

    @Then("debe ver el mensaje de confirmación de compra exitosa")
    public void debeVerElMensajeDeConfirmaciónDeCompraExitosa() {
        System.out.println("exitoso");
        try {
            theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(PostCheckoutPage.LBL_SUCCESS, isVisible()).forNoMoreThan(5).seconds()
            );
            theActorInTheSpotlight().should(seeThat("El mensaje de registro correcto", BuyQuestion.visibleEn(PostCheckoutPage.LBL_SUCCESS), equalTo("Thank you for your purchase!")));
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("hace click en el número de orden")
    public void haceClickEnElNúmeroDeOrden() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    Click.on(PostCheckoutPage.LNK_ORDER_NUMBER)
            );
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("debe ver los detalles de la orden")
    public void debeVerLosDetallesDeLaOrden() {
        theActorInTheSpotlight().should(
                seeThat("el campo de ID de orden es visible", BuyQuestion.visibleEn(PostCheckoutPage.LBL_ORDER_ID), containsString("Order #"))
        );
    }

    @And("debe verificar que el producto comprado es {string}")
    public void debeVerificarQueElProductoCompradoEs(String nameProducto) {
        System.out.println("exitoso");
        try {
            theActorInTheSpotlight().should(seeThat("El nombre de Producto correcto", BuyQuestion.visibleEn(PostCheckoutPage.LBL_PRODUCT_NAME), equalTo(nameProducto)));
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
