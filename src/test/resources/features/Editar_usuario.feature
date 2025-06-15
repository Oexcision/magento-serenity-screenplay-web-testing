@EditarUsuario
Feature: Editar informacion del usuario

  @EditarDataUsuarioValido @Happypath
  Scenario Outline: Ingresar a la configuracion de la cuenta y editar los datos del usuario
    Given el usuario inicia sesion con email "<email>" y contrasenia "<contrasenia>"
    And ingresa a la seccion MyAccount
    And selecciona Edit en Account Information
    When modifica el nombre "<nuevoNombre>" y apellido "<nuevoApellido>"
    And presiona el boton Save
    Then es redirigido a MyAccount
    And se muestra el mensaje "You saved the account information."

    Examples:
      | email              | contrasenia  | nuevoNombre  | nuevoApellido |
      | test0001@gmail.com | Password123@ | Oscar        | Contreras     |