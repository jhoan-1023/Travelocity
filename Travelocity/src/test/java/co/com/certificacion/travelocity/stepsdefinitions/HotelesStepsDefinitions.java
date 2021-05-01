package co.com.certificacion.travelocity.stepsdefinitions;

import co.com.certificacion.travelocity.questions.ValidarAlertaCovid;
import co.com.certificacion.travelocity.tasks.IngresarATravelocity;
import co.com.certificacion.travelocity.tasks.ReservarHotel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class HotelesStepsDefinitions {

    @Dado("^que el usuario esta en la pagina de travelocity buscando (.*)$")
    public void queElUsuarioEstaEnLaPaginaDeTravelocityBuscandoHoteles(String opcion) {
        //theActorInTheSpotlight().attemptsTo(BuscarInformacionDeInteres.enSesion(opcion));
        theActorInTheSpotlight().attemptsTo(IngresarATravelocity.conClick());
    }

    @Cuando("^ingresa la informacion del hotel$")
    public void ingresaLaInformacionDelHotel() {
        theActorInTheSpotlight().attemptsTo(ReservarHotel.conDatos());
    }

    @Entonces("^visualizara el mensaje de covid (.*)$")
    public void visualizaraElMensajeDeCovid(String alert) {
        theActorInTheSpotlight().should(seeThat(ValidarAlertaCovid.EnLaPagina(), is(equalTo(alert))));

    }

}
