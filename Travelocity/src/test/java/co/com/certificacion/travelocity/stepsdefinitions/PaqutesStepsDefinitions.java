package co.com.certificacion.travelocity.stepsdefinitions;

import co.com.certificacion.travelocity.questions.ValidarAlertaCovid;
import co.com.certificacion.travelocity.tasks.IngresarATravelocity;
import co.com.certificacion.travelocity.tasks.ReservarPaquete;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PaqutesStepsDefinitions {

    @Dado("^que el usuario esta en la pagina de travelocity mirando un (.*)$")
    public void queElUsuarioEstaEnLaPaginaDeTravelocityMirandoUnPaquete(String opcion) {
        theActorInTheSpotlight().attemptsTo(IngresarATravelocity.conClick());
    }

    @Cuando("^ingresa la informacion de los paquetes$")
    public void ingresaLaInformacionDeLosPaquetes() {
        theActorInTheSpotlight().attemptsTo(ReservarPaquete.conHotel());
    }

    @Entonces("^podra ver el nombre del hotel (.*)$")
    public void podraVerElNombreDelHotelHotelBoutiqueDonPepe(String paquete) {
        theActorInTheSpotlight().should(seeThat(co.com.certificacion.travelocity.questions.ReservarPaquete.conHotel(), is(equalTo(paquete))));
    }

}
