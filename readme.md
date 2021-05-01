
# Automatización Travelocity

## Framework

* Serenity: Es una librería de código abierto que ayuda a escribir pruebas de aceptación automatizadas de mayor calidad y de manera más eficiente. 

## Patron de Diseño

* Se utiliza Screenplay pattern ya que es un patrón de diseño orientado al comportamiento BDD y presenta un algo desacoplamiento de la interfaz del usuario y propone trabajar en términos de tareas y no de interfaz de usuario.


## Gradle

* Es una herramienta que permite la automatización de compilación de código abierto, la cual se encuentra centrada en la flexibilidad y el rendimiento y el cual nos ayuda a       gestionar nuestras librerías, frameworks, plugins, entre otros.


## Cucumber

* Es una herramienta de software que admite el desarrollo basado en el comportamiento central para el enfoque de Cucumber BDD es su analizador de lenguaje ordinario llamado       Gherkin.


## La estructura completa del proyecto es la siguiente:

* Features: En esta capa se escriben los archivos .feature, estos describen las características y escenarios a probar haciendo uso del lenguaje Gherkin.
* Runners: Contiene los archivos runner encargados de ejecutar los escenarios de la feature. Se usan las anotaciones @RunWhit() @CucumberOptions() para especificar qué ejecutar   y cómo hacerlo.
* Step Definitions: Gestiona los code snippets de los steps definidos con las palabras Given, When, Then en los escenarios de los archivos .feature
* Tasks: Esta clase contiene las clases que son el corazón del patrón de screenplay = Las tareas. Las tareas son acciones de alto nivel que definen un conjunto de interacciones   en el lenguaje de negocio.
* Questions: Esta capa gestiona los Asserts o verificaciones de las pruebas las cuales son el fin ultimo de las mismas, ya que con estas capturamos la información de la interfaz   que puede ser usada. 
* User Interfaces: Almacena las clases en las cuales se mapean los elementos de la interfaz de usuario o inputs o botones.
* Interactions: Se encargan de las interacciones con la interfaz de usuario. Muchas interacciones ya fueron desarrolladas y se encuentran disponibles gracias a las librerías de   screenplay y de serenity BDD
* Models: Los objetos de negocio son una abstracción de un ente real o virtual, modelado mediante atributos y métodos

 
## Comandos para ejecutar el proyecto.

* gradle clean test --tests FlightsRunner aggregate -Dcucumber.filter.tags="@Flight" -Denvironment=Laboratorio


## Autores

## Jhoan Márquez Castrillón - jhoan-1023@hotmail.com 
