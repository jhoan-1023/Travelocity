#language:es

  Característica: Verificar el correcto funcionamiento de los hoteles
    Yo como usuario de Travelocity
    Quiero verificar el correcto funcionamiento de los hoteles

  @hoteles
  Escenario: Hacer una reserva de un hotel
    Dado que el usuario esta en la pagina de travelocity buscando hoteles
    Cuando ingresa la informacion del hotel
    Entonces visualizara el mensaje de covid COVID-19 alert: Travel requirements are changing rapidly, including need for pre-travel COVID-19 testing and quarantine on arrival.
