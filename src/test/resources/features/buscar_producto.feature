@BuscarProductos
Feature: Buscar un producto y validar inexistencia

  @BusquedaProductoInexistente @Unhappypath
  Scenario Outline: Buscar un producto que no existe y validar mensaje de advertencia
    Given el usuario inicia sesion con email "<email>" y contrasenia "<contrasenia>"
    When busca un producto "<nombreProducto>"
    Then se muestra mensaje de advertencia "Your search returned no results."

    Examples:
      | email              | contrasenia  | nombreProducto        |
      | test0001@gmail.com | Password123@ | ProductoInexistente123|


