package steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matcher;
import pages.OperacionPage;



public class OperacionSteps {

    private OperacionPage mOperacionPage;

    @Step   //Serenity entienda que es 1 paso
    public void goToHomePage(){
          mOperacionPage.open();
    }

    @Step
    public void clickBtnIniciarSesionPaso(){
        mOperacionPage.clickBtnIniciarSesion();
    }

    @Step
    public void writeTxtCorreoElectronicoPaso(String capText){
        mOperacionPage.writeTxtCorreoElectronico(capText);
    }

    @Step
    public void clickBtnSiguientePaso(){
        mOperacionPage.clickBtnSiguiente();
    }

    @Step
    public void writeTxtPasswordCorreoPaso(String capTextP){
            mOperacionPage.writeTxtPasswordCorreo(capTextP);
    }

    @Step
    public void clickBtnIniciarSesionLoginPaso(){
        mOperacionPage.clickBtnIniciarSesionLogin();
    }

}
