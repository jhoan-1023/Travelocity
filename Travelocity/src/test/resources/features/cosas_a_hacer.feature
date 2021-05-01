#language: es
  Característica: Verifcar el correcto funcionamiento de la opcion "cosas a hacer"
    Yo como usuario de travelocity
    quiero ingresar a la opcion de cosas a hacer para verificar su correcto funcionamiento

  @cosas_a_hacer
  Escenario: Buscar cosas para hacer en una ciudad
    Dado que el usuario esta en la pagina de travelocity mirando cosas que hacer en un hotel
    Cuando se ingresa la informacion del hotel y las fechas
    Entonces podra ver una opcion para hacer Cruises & boat tours