package definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.OperacionSteps;


public class OperacionDefinition {

    @Steps
    private OperacionSteps mOperacionSteps;


    @Given("^Estoy en la pagina de inicio de correo de Hotmail$")
    public void estoy_en_la_pagina_de_inicio_de_correo_de_hotmail() {
         mOperacionSteps.goToHomePage();

    }

    @When("^Registro mi login para iniciar sesion // accion$")
    public void registro_mi_login_para_iniciar_sesion_accion() {
         mOperacionSteps.clickBtnIniciarSesionPaso();
         mOperacionSteps.writeTxtCorreoElectronicoPaso("paola.arias.cy@hotmail.com");
         mOperacionSteps.clickBtnSiguientePaso();
         mOperacionSteps.writeTxtPasswordCorreoPaso("Nekoron19854480");
         mOperacionSteps.clickBtnIniciarSesionLoginPaso();
    }


    @Then("^Deberia ingresar al correo electronico de Hotmail  // resultado$")
    public void deberia_ingresar_al_correo_electronico_de_Hotmail_resultado() {

    }

}
