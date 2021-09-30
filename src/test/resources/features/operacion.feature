@Regresion
Feature: Busqueda correo electronico


  @SmokeTest
  Scenario: Login en correo electronico de Hotmail
    Given Estoy en la pagina de inicio de correo de Hotmail
    When  Registro mi login para iniciar sesion // accion
    Then  Deberia ingresar al correo electronico de Hotmail  // resultado

