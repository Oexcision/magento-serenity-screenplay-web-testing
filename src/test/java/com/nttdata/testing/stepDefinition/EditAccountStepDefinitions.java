package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.MenClothesPage;
import com.nttdata.testing.Tasks.*;
import com.nttdata.testing.questions.AccountQuestion;
import io.cucumber.java.en.And;
import com.nttdata.testing.Pages.AccountPage;
import com.nttdata.testing.Pages.HomePage;

import com.nttdata.testing.questions.RegisterQuestion;
import com.nttdata.testing.questions.SearchQuestion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class EditAccountStepDefinitions {

    @And("ingresa a la seccion MyAccount")
    public void ingresaALaSeccionMyAccount() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(AccountPage.BTN_MENU),
                Click.on(AccountPage.BTN_MY_ACCOUNT)
        );
    }

    @And("selecciona Edit en Account Information")
    public void seleccionaEditEnAccountInformation() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(AccountPage.BTN_EDIT_MY_ACCOUNT)
        );
    }

    @When("modifica el nombre {string} y apellido {string}")
    public void modificaElNombreYApellido(String nombre, String apellido) {
        theActorInTheSpotlight().attemptsTo(ChangeFieldsUser.withData(nombre,apellido));
    }

    @And("presiona el boton Save")
    public void presionaElBotonSave() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(AccountPage.BTN_SAVE)
        );
    }

    @Then("es redirigido a MyAccount")
    public void esRedirigidoAMyAccount() {
        try {
            theActorInTheSpotlight().should(seeThat("El header de My Account", AccountQuestion.visibleEn(AccountPage.LBL_MYACCOUNT), equalTo("My Account")));
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("se muestra el mensaje {string}")
    public void seMuestraElMensaje(String message) {
        try {
            theActorInTheSpotlight().should(seeThat("Div Message Succesful", AccountQuestion.visibleEn(AccountPage.LBL_MESSAGE_SUCCESFUL), equalTo(message)));
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
