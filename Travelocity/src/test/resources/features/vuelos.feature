#language:es

  Característica: Verificar el funcionamiento de los vuelos
    Yo como usuario de la pagina Travelocity
    Quiero ingresar a la opcion de vuelos para verificar el funcionamiento correctamente

  @vuelos
  Escenario: Seleccionar un vuelo de ida y regreso en la clase de negocios con pasajero adicional
    Dado que el usuario esta en la pagina de travelocity reservando vuelos
    Cuando el usuario selecciona un vuelo de ida y regreso en la clase de negocios
    Entonces podra ver el mensaje Prices displayed include taxes and may change based on availability. You can review any additional fees before check out. Prices are not final until you complete your purchase.

