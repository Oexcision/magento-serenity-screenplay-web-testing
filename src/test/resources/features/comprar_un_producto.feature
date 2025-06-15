@ComprarProductos
Feature: Buscar un producto, agregarlo al carrito y comprarlo

  @ComprarProductos @Happypath
  Scenario Outline: Buscar un producto, elegir talla, color, agregarlo al carrito y comprarlo de manera exitosa
    Given el usuario inicia sesion con email "<email>" y contrasenia "<contrasenia>"
    And selecciona jackets de top para men en el navbar
    And selecciona la talla "<talla>" y color "<color>"
    When agrega al carrito
    Then se actualiza el item "<item>" del carrito de manera exitosa
    When procede a realizar la compra desde el carrito
    And completa el formulario de compra con los datos direccion "<direccion>", ciudad "<ciudad>", zip "<zip>" y numero "<telefono>"
    And hace click en Place Order
    Then debe ver el mensaje de confirmación de compra exitosa
    When hace click en el número de orden
    Then debe ver los detalles de la orden
    And debe verificar que el producto comprado es "Proteus Fitness Jackshirt"

    Examples:
      | email              | contrasenia  | talla | color | item | direccion    | ciudad        | estado    | zip   | Pais          | telefono  |
      | test0007@gmail.com | Password123@ | L     | Blue  | 1    | Los Jazmines | San Francisco | Alabama   | 13012 | United States | 987654321 |