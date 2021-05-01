package co.com.certificacion.travelocity.stepsdefinitions;

import co.com.certificacion.travelocity.tasks.AlquilarCarro;
import co.com.certificacion.travelocity.tasks.IngresarATravelocity;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CarrosStepsDefinitions {

    @Dado("^que el usuario esta en la pagina de travelocity alquilando un (.*)$")
    public void queElUsuarioEstaEnLaPaginaDeTravelocityAlquilandoUnCarro(String opcion) {
        theActorInTheSpotlight().attemptsTo(IngresarATravelocity.conClick());
    }

    @Cuando("^ingresa la informacion de alquiler del carro$")
    public void ingresaLaInformacionDeAlquilerDelCarro() {
        theActorInTheSpotlight().attemptsTo(AlquilarCarro.conTransporteAeropuerto());
    }

    @Entonces("^podra ver el listado de carros (.*)$")
    public void podraVerElListadoDeCarrosFindAirportTransportationWithEnhancedCleaning(String alquilerCarro) {
        theActorInTheSpotlight().should(seeThat(co.com.certificacion.travelocity.questions.AlquilarCarro.enElAeropuerto(), is(equalTo(alquilerCarro))));
    }

}
