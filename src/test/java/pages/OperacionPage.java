package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import utils.UtilsElement;

@DefaultUrl("https://outlook.live.com/owa/")
public class OperacionPage extends UtilsElement {

       private String btnIniciarSesion = "//*[@class='auxiliary-actions']/ul/li[2]/a";
       private String txtCorreoElectronico = "//*[@id='i0116']";
       private String btnSiguiente = "//*[@id='idSIButton9']";
       private String txtPasswordCorreo = "//*[@id='i0118']";
       private String btnIniciarSesionLogin = "//*[@id='idSIButton9']";


       public void clickBtnIniciarSesion(){ click(btnIniciarSesion);}
       public void writeTxtCorreoElectronico(String capText){ typeInput(txtCorreoElectronico, capText );}
       public void clickBtnSiguiente(){ click(btnSiguiente);}
       public void writeTxtPasswordCorreo(String capTextP){
              try {
                     Thread.sleep(2000);
              } catch (InterruptedException e) {
                     e.printStackTrace();
              }
              typeInput(txtPasswordCorreo, capTextP);}
       public void clickBtnIniciarSesionLogin(){ click(btnIniciarSesionLogin); }

}
